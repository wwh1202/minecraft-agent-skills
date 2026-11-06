# Minecraft MCP Landscape (research snapshot: 2026-11-06)

This is a shortlist for source audit and isolated testing, not an endorsement or claim that any candidate is safe for production. MCP servers expose powerful capabilities; do not connect them to a live survival server until permissions and network exposure have been audited.

## The important distinction

| Need | Best-fit category | What it should provide |
|---|---|---|
| Let an AI physically play or inspect the client | Client-side Fabric mod | screenshots, player movement, inventory, block/entity interaction |
| Let an AI edit a Paper world / administer a server | Paper plugin MCP bridge | controlled world edits, logs, player state, commands |
| Test a Paper plugin like a real player | E2E test harness | bot clients, player/console commands, waits, assertions against live state/events/messages/world |
| Build/inspect structures in a live Paper world | World-building MCP | terrain survey, block data, bulk edits, snapshots/restore |

## Candidates found

### 1. VitaminMCP — first choice for plugin QA
- Source: https://github.com/Backas03/VitaminMCP
- Paper/Purpur plugin + MCP endpoint. It drives real protocol bot clients and introspects the running server; the plugin under test does not need source instrumentation.
- Tools include player/console commands, GUI/inventory inspection and clicks, event/log/exception queries, waits, player bots and scenario assertions.
- Version table in upstream README reports Minecraft 1.21–1.21.11 supported and live-tested on Windows/Linux/macOS; 26.1 is also listed. Newer 26.2–26.3 agent-side support is partial and bot support is explicitly not yet complete.
- License: MIT.
- Registry snapshot reports version 3.2.2 published 2026-10-20. Verify current tag/release before installing.
- Why it matters: closest match to our acceptance challenge because it validates real player/console behavior instead of only executing console commands.
- Current decision: **FIRST TO EVALUATE** on a disposable Paper 1.21.11 server. Not installed or run yet.

### 2. Mine MCP — client-side player/world control
- Source: https://github.com/hashk014/Mine-MCP
- CurseForge: https://www.curseforge.com/minecraft/mc-mods/mine-mcp
- Client-side Fabric mod; reported 75 MCP tools for solo and multiplayer, including screenshots, player movement, inventory/container interaction, block/entity inspection and actions.
- Critical authority distinction: solo owner can access integrated-server developer functions; multiplayer without OP is limited to ordinary player permissions; with OP it can use server-authorized commands/debug queries. It does not grant remote console access on a multiplayer server.
- License: MIT. Current upstream reports Minecraft 1.21.11 with 49/49 isolated singleplayer runtime checks, and 1.14.4 also has a separate recorded run. The project labels itself experimental alpha; its compatibility catalog is not proof that every feature was gameplay-tested on every version.
- Local endpoint is documented as loopback-only with a generated token; still audit the exact release/config before use.
- Current decision: **BEST CLIENT-CONTROL CANDIDATE** if the goal is to operate a Minecraft client/world, not the first choice for server plugin acceptance tests.

### 3. MC-Inspector — client automation, screenshots and packet inspection
- Source: https://github.com/Nano112/MC-Inspector
- Fabric client mod reported for Minecraft 1.21.8–1.21.11 and 26.1/26.2; MIT.
- Reported MCP tools include screenshots, game state/logs, keyboard/mouse injection, UI widgets, command execution, server connection, scripted sequences and packet inspection.
- Security note: it also advertises in-client JavaScript execution and packet-inspection features. Treat this as a high-privilege debugging surface; audit source, auth and tool policy before connecting.
- Current decision: **SPECIALIST DEBUGGING OPTION**, not a default server admin bridge.

### 4. Fabric API MCP Server — world API access
- CurseForge: https://www.curseforge.com/minecraft/mc-mods/fabric-api-mcp-server
- Fabric mod exposing Minecraft/Fabric APIs to an MCP client for reading/manipulating a live world; listing includes Minecraft 1.21.11 and 26.x, MIT.
- This is a Fabric mod integration, not a Paper plugin. Use only when a Fabric client/server environment is acceptable.
- Current decision: **WATCHLIST** for Fabric-world automation.

### 5. CommandNeural — broad server administration surface
- Project: https://modrinth.com/project/sJEGjL7Z
- Reported 100+ tools for server/player management, world editing, construction, integrations with WorldGuard/LuckPerms/Vault/PlaceholderAPI/Oraxen and others, filesystem and SQL operations.
- Reported license: MIT; listed platform support includes Bukkit/Paper/Spigot/Folia and versions 1.16.5+.
- Risk: very broad authority (filesystem, SQL, NBT, commands, player management). A broad tool inventory is not automatically a better choice. Audit source, permission checks, path sandbox, SQL behavior, rate limits and compatibility claims.
- Current decision: **DO NOT CONNECT TO PRODUCTION**; evaluate only in a disposable server if broad admin integration becomes a concrete requirement.

### 6. MineMCP (AxenoDev) — compact Paper bridge
- Source: https://github.com/AxenoDev/MineMCP
- Reported capabilities: place/break/fill blocks, execute commands, read/write/list server files, list plugins/logs/players, inspect player state.
- Reported requirements: Java 21, Paper/Purpur, Minecraft 1.21.
- Reported license: GPL-3.0-only.
- Risk: arbitrary command and filesystem access require strict review and least-privilege configuration.
- Current decision: **REFERENCE IMPLEMENTATION** for a simple Paper MCP bridge; not the first QA choice.

### 7. MinecraftServerMCP — policy-oriented server bridge
- Source: https://github.com/MrApik/MinecraftServerMCP
- Reported capabilities: HTTP(S) MCP, bearer tokens, per-profile per-tool policies, filesystem read/list/write, server command/logs, player list/details, and a Bukkit service for other plugins to register tools.
- Reported requirements: Paper/Spigot 1.21+, Java 21.
- Current decision: **WATCHLIST**; inspect extension API and policy enforcement if we later build our own Skills integration.

### 8. Ashlar — Paper world survey/build/inspect
- Source: https://github.com/rcwalter24/ashlar
- Paper plugin + Node MCP server for terrain survey, world rendering, bulk building, exact block inspection, region snapshot/restore and console commands. It schedules block writes across ticks and supports snapshots/restore.
- Reported compatibility: Paper 26.2/26.3, Java 25, Node 22. This is not a fit for the current Paper 1.21.11 target without separate compatibility evidence.
- License: AGPL-3.0.
- Current decision: **REFERENCE FOR BUILDING WORKFLOWS**, not selected for 1.21.11 plugin QA.

## Recommendation for this project

Use **VitaminMCP first** for the synthetic Paper plugin challenge because the key proof is real player/console behavior and assertions, not merely remote command execution. Keep a normal Gradle build and deterministic tests in CI. Use **Mine MCP** if the task is to operate a client/player and inspect the live world. These are different jobs, not competing products.

Do not install any candidate on the user's private production server as part of this evaluation. Begin with a local disposable Paper 1.21.11 server and least-privilege settings.

## Mandatory evaluation checklist

- [ ] Verify latest release/tag and source commit.
- [ ] Confirm Paper build + Minecraft version + Java runtime.
- [ ] Inspect license and dependency licenses.
- [ ] Inspect authentication, bind address, TLS/proxy assumptions, rate limiting and tool-level authorization.
- [ ] Enumerate tools and disable command, filesystem, SQL, NBT, player-ban/kick and world-write groups unless needed.
- [ ] Start on a disposable local Paper server with no production data.
- [ ] Test allowed read-only call and denied privileged call.
- [ ] Run one harmless player scenario and verify bot cleanup.
- [ ] Capture logs, assertions, timings and rollback evidence.
- [ ] Mark status PASS only with artifacts; otherwise BLOCKED/FAIL.

## Sources
- VitaminMCP: https://github.com/Backas03/VitaminMCP
- Mine MCP: https://github.com/hashk014/Mine-MCP
- MC-Inspector: https://github.com/Nano112/MC-Inspector
- Fabric API MCP Server: https://www.curseforge.com/minecraft/mc-mods/fabric-api-mcp-server
- CommandNeural: https://modrinth.com/project/sJEGjL7Z
- MineMCP: https://github.com/AxenoDev/MineMCP
- MinecraftServerMCP: https://github.com/MrApik/MinecraftServerMCP
- Ashlar: https://github.com/rcwalter24/ashlar
