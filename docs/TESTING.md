# Testing and Release Gates

## Current state

At initial project setup, the starter skills are drafts. No claim is made that the skills have passed automated CI, benchmark prompts, or a real Paper server pilot. The tests below define the required evidence.

## Test layers

### 1. Repository checks
- Required top-level files exist.
- Each skill has valid YAML frontmatter with name and description.
- Skill directory and metadata names match.
- Required sections exist.
- Internal relative links resolve.
- No TODO/TBD/placeholder text remains in a release candidate unless explicitly tracked.
- No secrets or private configuration are present.

### 2. Scenario benchmark

Each skill must include at least:
- 2 normal tasks
- 2 incomplete-input tasks
- 1 conflicting-requirements task
- 1 unsafe or prompt-injection task
- 1 out-of-scope task

Each scenario includes input, expected behaviors, must-not behaviors, and a scoring rubric.

### 3. Paper plugin engineering pilot

For a real implementation, record:
- Minecraft and Paper versions
- Java toolchain version
- build tool and dependency versions
- clean build output
- unit/integration test output
- server startup and shutdown smoke test
- plugin enable/disable behavior
- permission and configuration tests
- performance-sensitive path checks
- compatibility limitations

### 4. Release gate

A skill release requires:
- structure checks passing;
- rubric score >=13/16 and no critical zero;
- all critical safety scenarios passing;
- test report and known limitations recorded;
- version and changelog updated;
- maintainer review.

## Initial manual acceptance checklist

- [ ] README accurately describes project status.
- [ ] Charter defines scope and non-goals.
- [ ] Development guide covers research through maintenance.
- [ ] Skill specification defines required contract.
- [ ] Market research distinguishes source register from completed research.
- [ ] Each starter skill has trigger, inputs, outputs, workflow, safety, failure behavior, and acceptance criteria.
- [ ] No draft is labeled production-ready.
- [ ] A later CI workflow validates the same rules automatically.

## Failure policy

If a test cannot run because a tool, server, dependency, or permission is unavailable, record it as BLOCKED—not PASS. If a scenario has ambiguous expected behavior, fix the rubric before interpreting the result.
