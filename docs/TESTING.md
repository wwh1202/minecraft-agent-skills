# Testing and Release Gates

## Current state

The starter skills are drafts. GitHub Actions structural validation has passed on the current main branch. Behavioral skill evaluations and a real Paper server pilot have not yet been run. Do not confuse these statuses.

## Test layers

See [Validation Architecture](VALIDATION_ARCHITECTURE.md) for the complete L1–L6 model.

### 1. Repository checks
- Required top-level files exist.
- Each skill has valid frontmatter with name and description.
- Skill directory and metadata names match.
- Required sections exist.
- Internal relative links resolve.
- No unresolved placeholders remain in a release candidate.
- No secrets or private configuration are present.

### 2. Scenario benchmark

Each skill must include normal, incomplete-input, conflicting-requirements, adversarial/untrusted-content, failure/unavailable-tool, and out-of-scope cases.

Each scenario includes input, expected behaviors, must-not behaviors, and a scoring rubric. Until an agent is actually tested, status is NOT_RUN.

### 3. Paper plugin engineering pilot

For a real implementation, record:
- Minecraft and Paper versions;
- Java toolchain version;
- build tool and dependency versions;
- clean build output;
- unit/integration test output;
- server startup and shutdown smoke test;
- plugin enable/disable behavior;
- permission and configuration tests;
- performance-sensitive path checks;
- compatibility limitations.

### 4. Release gate

A skill release requires:
- structure checks passing;
- rubric score >=13/16 and no critical zero;
- all critical safety scenarios passing;
- test report and known limitations recorded;
- version and changelog updated;
- maintainer review.

A plugin release additionally requires a clean build, critical tests, runtime smoke test, compatibility evidence, and rollback plan.

## Verification vocabulary

- NOT_RUN: defined but not executed.
- PASS: executed and observed to meet criteria.
- FAIL: executed and did not meet criteria.
- BLOCKED: could not execute due to missing environment/tool/permission.
- WAIVED: explicitly accepted residual risk with approver and reason.

## Failure policy

If a test cannot run, record BLOCKED—not PASS. If expected behavior is ambiguous, fix the rubric before interpreting results.
