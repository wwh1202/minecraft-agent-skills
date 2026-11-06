# Minecraft MCP Landscape (research snapshot: 2026-11-06)

This is a shortlist for further source audit and isolated testing, not an endorsement or claim that any candidate is safe for production. MCP servers expose powerful capabilities; do not connect them to a live survival server until permissions and network exposure have been audited.

## The important distinction

| Need | Best-fit category | What it should provide |
|---|---|---|
| Let an AI physically play or inspect the client | Client-side Fabric mod | screenshots, player movement, inventory, block/entity interaction |
| Let an AI edit a Paper world / administer a server | Paper plugin MCP bridge | controlled world edits, logs, player state, commands |
| Test a Paper plugin like a real player | E2E test harness | bot clients, player/console commands, waits, assertions against live state/events/messages |
| Build/inspect structures in a live Paper world | World-building MCP | terrain survey, block data, bulk edits, snapshots/restore |

## Candidates found

### 1. VitaminMCP — strongest candidate for plugin QA
- Source: https://github.com/Backas03/VitaminMCP
- Description: Paper/Purpur plugin plus MCP endpoint; drives real protocol bot clients and introspects the running server.
- Reported capabilities: spawn/control test players; run commands as console or player; wait for conditions; assert blocks, player state, events, inventory, messages, and reachability.
- Reported compatibility: Minecraft 1.21–1.21.11 live-tested on Windows/Linux/macOS; 26.1 support listed. The repository explicitly notes limitations for bot support on later 26.x versions.
- License: repository identifies MIT.
- Why it matters: this is much closer to a reusable plugin acceptance-test harness than a generic command bridge.
- Risks / checks before use: inspect current release and source; validate token/auth model, exposed endpoint, bot lifecycle cleanup, and the exact Paper build. Start on an isolated local server only.
- Current decision: **FIRST TO EVALUATE** for the Skills project's real plugin challenge, not yet installed or run.

### 2. Mine MCP — strongest candidate for client/world interaction
- Source: https://www.curseforge.com/minecraft/mc-mods/mine-mcp
- Description: client-side Fabric mod with a reported 75 MCP tools; solo and multiplayer modes; screenshots, player control, world inspection, block/entity NBT, and inventory actions.
- Reported boundary: on multiplayer servers without OP it uses normal player permissions and does not grant OP; integrated-server authority is only available in solo worlds.
- License: MIT per project page.
- Compatibility evidence: page lists current 26.x versions; the project description says it does not support Forge/NeoForge/Quilt/Bedrock. Do not assume compatibility with Paper server installation because this is a client-side Fabric mod.
- Current decision: **SECONDARY EVALUATION** if the task is to control a player/client or inspect a world visually, not for Paper plugin QA.

### 3. CommandNeural — broad server administration surface
- Project: https://modrinth.com/project/sJEGjL7Z
- Reported capabilities: 100+ tools for server/player management, world editing, construction, integrations with WorldGuard/LuckPerms/Vault/PlaceholderAPI/Oraxen and others, filesystem and SQL operations.
- Reported license: MIT; listed platform support includes Bukkit/Paper/Spigot/Folia and versions 1.16.5+.
- Risk: very broad authority (filesystem, SQL, NBT, commands, player management). A broad tool inventory is not automatically a better choice. Audit the source, permission checks, path sandbox, SQL behavior, rate limits and compatibility claims before use.
- Current decision: **DO NOT CONNECT TO PRODUCTION**; evaluate only in a disposable server if broad admin integration becomes a concrete requirement.

### 4. MineMCP (AxenoDev) — compact Paper bridge
- Source: https://github.com/AxenoDev/MineMCP
- Reported capabilities: place/break/fill blocks, execute commands, read/write/list server files, list plugins/logs/players, inspect player state.
- Reported requirements: Java 21, Paper/Purpur, Minecraft 1.21.
- Reported license: GPL-3.0-only.
- Risk: arbitrary command and filesystem access require strict review and least-privilege configuration.
- Current decision: **REFERENCE IMPLEMENTATION** for a simple Paper MCP bridge; not the first QA choice.

### 5. MinecraftServerMCP — policy-oriented server bridge
- Source: https://github.com/MrApik/MinecraftServerMCP
- Reported capabilities: HTTP(S) MCP, bearer tokens, per-profile per-tool policies, filesystem read/list/write, server command/logs, player list/details, and a Bukkit service for other plugins to register tools.
- Reported requirements: Paper/Spigot 1.21+, Java 21.
- Current decision: **WATCHLIST**; inspect extension API and policy enforcement if we later build our own skills integration.

### 6. Ashlar — Paper world survey/build/inspect
- Source: https://github.com/rcwalter24/ashlar
- Reported capabilities: MCP server + Paper plugin for terrain survey, world rendering, bulk building, exact block inspection, region snapshot/restore and console commands.
- Reported compatibility in repository: Paper 26.2/26.3, Java 25, Node 22. This is a newer version line and is not a fit for the current Paper 1.21.11 staging target without separate compatibility evidence.
- License: AGPL-3.0.
- Current decision: **REFERENCE FOR BUILDING WORKFLOWS**, not selected for 1.21.11 plugin QA.

## Recommendation for this project

Use **VitaminMCP first** for the synthetic Paper plugin challenge because the key proof is real player/console behavior and assertions, not merely remote command execution. Keep a normal Gradle build and deterministic tests in CI. Consider Mine MCP later for client-side visual/player actions. Do not install any of these on the user's private production server as part of this evaluation.

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
- Mine MCP: https://www.curseforge.com/minecraft/mc-mods/mine-mcp
- CommandNeural: https://modrinth.com/project/sJEGjL7Z
- MineMCP: https://github.com/AxenoDev/MineMCP
- MinecraftServerMCP: https://github.com/MrApik/MinecraftServerMCP
- Ashlar: https://github.com/rcwalter24/ashlar
