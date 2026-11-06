---
name: implementation-planning
description: Break an approved Minecraft Paper plugin specification into small, dependency-aware engineering tasks with file boundaries, tests, and checkpoints. Use before multi-step implementation.
---

# Implementation Planning

## Status

Draft. The workflow is defined but must pass its behavioral scenarios before being labeled validated.

## Purpose

Produce an executable plan that a junior developer or coding agent can follow without guessing architecture or silently skipping tests.

## Trigger

Use after a feature specification is approved and before coding a feature, refactor, migration, or plugin module.

## Inputs

Approved requirements and acceptance criteria; repository tree; build system; target Paper/Minecraft and Java versions; known dependencies and constraints.

## Outputs

Task sequence; dependency graph; expected files/modules; test-first checkpoints; risk notes; definition of done.

## Workflow

1. Inspect the repository and existing patterns before planning changes.
2. Trace each task to requirement and acceptance-criterion IDs.
3. Split work into small changes with one observable outcome each.
4. Identify dependencies, likely files, APIs, config/storage changes, and migration needs.
5. Order tasks so foundational contracts precede dependent features.
6. Add tests before or alongside implementation tasks; specify exact commands where known.
7. Include build, server smoke, compatibility, and rollback checkpoints when relevant.
8. Mark uncertain API or version details as research tasks, not coding assumptions.
9. Estimate complexity as a range and identify the largest uncertainty.
10. Present the plan for approval; update it when evidence changes.

## Safety

Do not claim a task is complete because it is listed. Do not hide destructive data migrations, production deployment, or release actions inside a normal implementation task. Ask approval for those actions.

## Failure handling

If the repository cannot be inspected, produce a provisional plan with explicit unknowns. If tasks are too large to verify independently, split them further. If no test can verify a requirement, flag the acceptance gap.

## Acceptance criteria

Every task traces to a requirement; tasks are ordered and bounded; likely files and dependencies are named; tests and checkpoints are included; risky actions require approval.
