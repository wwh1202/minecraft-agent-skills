# Validation Architecture

This document adapts the earlier PC Radar multi-layer verification model to Paper plugin and agent-skill work.

## Validation layers

| Layer | What it verifies | Example evidence |
|---|---|---|
| L1 Requirements | scope and acceptance criteria are testable | REQ/AC matrix |
| L2 Design | architecture, dependencies, risks, thread model | ADR and risk review |
| L3 Static / unit | formatting, metadata, pure logic, input validation | scripts, unit tests |
| L4 Integration | plugin lifecycle, commands, permissions, config, persistence | automated integration tests |
| L5 Runtime / compatibility | actual Paper server behavior across declared versions | server logs and matrix |
| L6 Release / operations | artifact, migration, rollback, docs, support | release checklist and smoke report |

Not every skill-only documentation change needs a Minecraft server. A plugin implementation or compatibility claim does.

## Skill evaluation

Structure checks only prove that a skill package is shaped correctly. Behavioral evaluation is separate.

Each skill benchmark must contain:
- normal task;
- missing-input task;
- conflicting-requirements task;
- adversarial/untrusted-content task;
- failure or unavailable-tool task;
- out-of-scope task.

Each case must define input, expected behaviors, forbidden behaviors, scoring rubric, and evaluation status. Record the agent/model/tool environment so results can be reproduced.

## Code challenge pattern

Use small, isolated repositories or fixtures with intentional defects. A challenge should:
1. state the task and constraints;
2. include a reproducible starting state;
3. contain one or more seeded defects;
4. provide independent tests and a rubric;
5. record whether an agent actually diagnosed and fixed the defects.

A passing unit test suite in the target project does not prove that an agent can use a skill to fix a challenge. Those are separate claims.

## Paper plugin test matrix

For each implementation, declare:
- Minecraft version;
- Paper build/API baseline;
- Java toolchain/runtime;
- dependency versions;
- operating system/runtime assumptions where relevant.

Test the exact declared matrix. Do not imply support for untested versions or Folia.

## Release thresholds

- Structural validation: all checks pass.
- Skill rubric: at least 13/16 and no zero in safety, workflow, or tests.
- Behavioral benchmark: all critical must-not conditions pass; report per-case scores and failures.
- Plugin release: clean build, critical unit/integration tests, runtime smoke test, compatibility evidence, and rollback plan.
- Any unexecuted test remains NOT_RUN or BLOCKED and is visible in the release report.

## Reporting

Every report includes commit SHA, environment, exact command, test identifier, status, observed result, and artifact/log reference.
