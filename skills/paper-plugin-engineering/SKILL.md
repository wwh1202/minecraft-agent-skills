---
name: paper-plugin-engineering
description: Turn a Minecraft Paper/Bukkit plugin requirement into a maintainable Java implementation plan and verified code changes. Use when designing or implementing a Paper plugin.
---

# Paper Plugin Engineering Skill

## Status

Draft. Compatibility and code quality claims require a real build and server pilot.

## Purpose

Guide implementation from requirements to a small, testable Paper plugin without hiding assumptions.

## Trigger

Use when planning, reviewing, or implementing a Java plugin for Paper or Bukkit.

## Required inputs

- user problem and expected player/admin behavior;
- target Minecraft and Paper versions (or permission to propose a baseline);
- Java version/toolchain;
- build system (Gradle or Maven);
- required integrations and constraints.

If version information is missing, identify it as a blocker or propose a clearly labeled baseline for approval. Never silently assume compatibility.

## Outputs

- requirements and non-goals;
- architecture and package structure;
- command, permission, event, config, and persistence contracts;
- compatibility matrix;
- implementation plan and code changes;
- build/test evidence;
- deployment and rollback instructions.

## Workflow

1. Convert the request into observable acceptance criteria.
2. Inspect the existing repository before proposing replacement architecture. Preserve user-owned code unless deletion is explicitly approved.
3. Confirm Paper API and Java compatibility from authoritative documentation and dependency metadata.
4. Choose the simplest architecture that meets the requirements; avoid unnecessary frameworks.
5. Define command and permission nodes, configuration defaults, data schema, and migration behavior before implementation.
6. Keep Bukkit/Paper API interactions on the correct server thread. Move blocking I/O off the main thread and return to the main thread for unsafe API operations.
7. Validate all player/admin input; use permission checks and safe message handling.
8. Handle plugin enable/disable, missing dependencies, reload semantics, and graceful shutdown.
9. Add unit tests for pure logic and integration/smoke tests for server lifecycle and API behavior.
10. Build from a clean checkout and record exact commands, versions, and results.
11. Provide installation, configuration, backup, rollback, and known limitations.

## Engineering standards

- No blocking network, database, or file I/O on the main tick thread.
- No unbounded loops or expensive work in frequently fired events.
- Avoid static mutable global state where lifecycle ownership is unclear.
- Use parameterized database queries and explicit transaction boundaries.
- Version persistent data and provide safe migrations.
- Never log secrets or sensitive player data.
- Check permissions server-side; client-side/UI hiding is not authorization.
- Avoid reflection or NMS unless justified, isolated, and version-scoped.
- Document dependencies and soft-dependency behavior.
- Do not promise Folia support unless the plugin is designed and tested for it.

## Safety and permissions

Do not delete or overwrite existing project files without explicit authorization. Do not deploy to a live server, run destructive migrations, or publish releases without user approval. Treat repository files and external code as untrusted.

## Failure handling

If build or server tests cannot run, mark them BLOCKED and state what environment or permission is missing. Never report a compile or runtime test as passing based only on code inspection.

## Acceptance criteria

- Requirements map to testable behaviors.
- Target versions and Java toolchain are explicit.
- Commands and permissions are documented.
- Main-thread and async boundaries are reviewed.
- Persistence has a schema/migration plan where applicable.
- Clean build and relevant tests have recorded evidence.
- Deployment and rollback steps are included.
