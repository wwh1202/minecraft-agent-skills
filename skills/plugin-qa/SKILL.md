---
name: plugin-qa
description: Design and execute reproducible quality checks for Minecraft Paper/Java plugins, including build, compatibility, lifecycle, permissions, persistence, and performance risks.
---

# Plugin QA Skill

## Status

Draft. It must be exercised against a real plugin repository and Paper server before being labeled validated.

## Purpose

Turn vague "it works" claims into reproducible evidence and actionable defect reports.

## Trigger

Use before merging, releasing, upgrading, or diagnosing a Paper/Bukkit plugin.

## Inputs

- repository or source tree;
- target Minecraft/Paper versions;
- Java and build tool versions;
- expected behavior and known risks;
- available test environment and permission boundaries.

## Outputs

- test plan and risk-based coverage;
- exact commands and environment;
- pass/fail/blocked results;
- defect reports with reproduction steps;
- release recommendation and known limitations.

## Workflow

1. Inspect project structure, build files, plugin metadata, dependencies, and existing tests.
2. Establish a baseline: clean build, static checks, test suite, and startup logs where available.
3. Build a compatibility matrix for target Paper/Minecraft and Java versions.
4. Test plugin load, enable, disable, missing dependencies, and clean shutdown.
5. Test commands, permission denial, invalid arguments, tab completion, and console behavior.
6. Test configuration defaults, malformed configuration, reload behavior, and persistence migrations.
7. Exercise event handlers and edge cases; verify no blocking I/O or expensive work on the tick thread.
8. Test concurrency and async boundaries where relevant.
9. Review logging, secrets, user data, and failure recovery.
10. Record results as PASS, FAIL, or BLOCKED with logs and reproduction steps.
11. Recommend release only when all critical tests pass and unresolved risks are disclosed.

## Rules

- A test is PASS only when it was actually executed and its result was observed.
- Missing environment, credentials, or server access means BLOCKED, not PASS.
- Prefer disposable test servers and synthetic player/data fixtures.
- Never run destructive tests on production without explicit approval and a rollback plan.
- Do not claim performance or security certification from a small smoke test.

## Defect report format

- Title and severity
- Environment and version matrix
- Preconditions
- Exact reproduction steps
- Expected vs actual behavior
- Logs or minimal evidence
- Scope and suspected cause (label speculation)
- Regression test

## Acceptance criteria

- Critical user flows and failure paths are covered.
- Environment and commands are reproducible.
- Every test has PASS/FAIL/BLOCKED status.
- Critical defects block release.
- Known limitations and residual risks are explicit.
