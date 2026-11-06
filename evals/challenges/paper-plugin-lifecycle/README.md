# Challenge: Paper plugin lifecycle + real-player acceptance test

**Case ID:** PAPER-E2E-001  
**Target:** Paper 1.21.11 / Java 21  
**Status:** STARTER_BUILD_PENDING / LIVE_E2E_NOT_RUN  
**Purpose:** Prove the Skills composition can diagnose, repair, build and verify a deliberately flawed plugin using deterministic tests plus a live Paper server. This is a synthetic, isolated challenge; it contains no code or configuration from the user's private server.

## Starter project

The deliberately flawed starter plugin is in `starter/`. It is a small Gradle project that compiles against Paper 1.21.11 and has one passing pure-Java regression test. The starter is intentionally defective at runtime; a successful baseline build is not evidence that the plugin behavior is correct.

## Scenario

A small plugin named `WelcomeLedger` should:
1. Welcome each joining player with a configurable message.
2. Track a player's first-join timestamp and last-seen timestamp in a YAML file.
3. Expose `/welcomeledger stats` to players with `welcomeledger.stats`.
4. Reject unauthorized players with a clear message.
5. Save data safely on shutdown and avoid blocking the server thread with file I/O.

## Known seeded defects (do not repair before the baseline evaluation)
- Bukkit/Paper player and configuration APIs are accessed from an asynchronous task.
- YAML persistence is mutated and saved concurrently with joins/shutdown.
- Command permission handling is missing.
- Scheduled work is not cancelled/tracked during plugin disable.
- Persisted records are not loaded into the in-memory entry map on startup.

## Required agent workflow

1. Inspect repository, runtime, build, plugin descriptor and API version.
2. Produce a short root-cause report before editing.
3. Write failing regression tests first where feasible.
4. Repair the implementation using supported Paper 1.21.11 APIs.
5. Build the shaded plugin JAR and run unit/integration tests.
6. Start an isolated disposable Paper 1.21.11 server.
7. Connect an MCP E2E harness (VitaminMCP is the first candidate) and test:
   - player joins and receives the welcome message;
   - first join creates exactly one record;
   - reconnect updates last-seen without overwriting first-join;
   - authorized command succeeds;
   - unauthorized command is denied;
   - plugin disable/restart preserves data;
   - no asynchronous Bukkit API violations or severe errors appear in logs.
8. Save test output, server logs, JAR hash, exact tool/plugin versions and a final scorecard.

## Safety boundaries

- Never connect the challenge to a production server.
- Never expose the MCP endpoint publicly; bind to loopback or an isolated private network.
- Use a disposable world and synthetic player names.
- No RCON, filesystem-wide access, SQL, arbitrary console commands or destructive world edits unless the test specifically requires them.
- Record an explicit negative test showing an unauthorized action is denied.
- Do not claim a live-server pass if the MCP harness, Paper server or bot protocol could not actually be started.

## Acceptance rubric (100 points)

| Area | Points | Evidence |
|---|---:|---|
| Correct Paper API / Java compatibility | 15 | Successful compile on Java 21 against Paper 1.21.11 |
| Main-thread and lifecycle correctness | 20 | Tests + no async API violation in logs |
| Persistence correctness | 15 | First/last timestamps survive restart |
| Command and permission behavior | 15 | Authorized and unauthorized player assertions |
| Regression tests | 15 | Repeatable automated test output |
| Live E2E validation | 15 | MCP assertions against real server and bot |
| Security and evidence quality | 5 | No secret leakage; versioned report and artifact hashes |

## Status rules

- `NOT_RUN`: no agent execution has been recorded.
- `BLOCKED`: environment, tool, or network limitation prevents a required test; include the exact reason.
- `FAIL`: execution occurred and one or more required assertions failed.
- `PASS`: all mandatory assertions pass and evidence is linked.
- `PASS_WITH_LIMITATIONS`: all feasible checks pass but a clearly identified optional check is unavailable. Mandatory live E2E cannot be waived for full PASS.

## Evidence report template

Copy this file to `evals/reports/PAPER-E2E-001-<date>.md` and fill:
- agent/model and skills activated;
- source commit and diff;
- Java/Paper/build tool versions;
- test commands and exit codes;
- server logs and MCP tool call summaries (redact tokens);
- JAR SHA-256;
- rubric score and unresolved limitations.
