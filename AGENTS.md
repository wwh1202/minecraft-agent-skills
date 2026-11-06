# Agent Engineering Contract

This file is the repository-level source of truth for AI-assisted changes. More detailed guidance lives in `docs/` and individual `skills/`.

## Before changing code or skills

1. Inspect the current repository, relevant history, and existing tests.
2. Read `docs/PROJECT_CHARTER.md`, `docs/ENGINEERING_GOVERNANCE.md`, and `docs/SKILL_SPECIFICATION.md`.
3. Convert the request into requirement IDs and observable acceptance criteria.
4. Identify affected files, compatibility assumptions, dependencies, and risks.
5. Propose a bounded plan before large or destructive changes.

## During implementation

- Make the smallest coherent change.
- Preserve existing behavior unless a breaking change is approved.
- Keep Paper API calls on safe server-thread boundaries; never block the tick thread with I/O.
- Validate permissions and all external/player input server-side.
- Version persisted data and configuration migrations.
- Do not add dependencies without explaining why.
- Keep credentials, private server configuration, and player data out of this public repository.

## Verification

- Run the relevant automated checks and record exact commands/results.
- Distinguish PASS, FAIL, NOT_RUN, and BLOCKED.
- Compilation is not proof of runtime correctness.
- Do not claim compatibility, performance, security, or test success without evidence.
- Link requirements to implementation and tests.

## Approval boundaries

Ask before deleting or overwriting user data, running destructive migrations, deploying to a live server, spending money, bypassing access controls, or publishing releases.

## Completion report

Summarize changed files, requirement IDs addressed, tests actually run, results, known limitations, and remaining work.
