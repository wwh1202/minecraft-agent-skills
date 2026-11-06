---
name: version-compatibility
description: Plan and verify Minecraft, Paper, Java, and dependency compatibility for plugin releases and upgrades.
---

# Version Compatibility

## Status

Draft. The workflow is defined but must pass its behavioral scenarios before being labeled validated.

## Purpose

Prevent unsupported version claims and reduce breakage across server upgrades.

## Trigger

Use when selecting a baseline, adding a supported version, upgrading Paper or Java, replacing dependencies, or debugging version-specific behavior.

## Inputs

Current supported versions; desired target matrix; build files; plugin dependencies; source/API usage; release constraints.

## Outputs

Compatibility matrix; migration impact; version-specific changes; build/test evidence; support and deprecation policy.

## Workflow

1. Inventory current Minecraft/Paper, Java, build tool, and dependency versions.
2. Define the exact target matrix and support policy.
3. Review official Paper release notes, API docs, Java requirements, and dependency release notes.
4. Search code for removed/deprecated APIs, NMS, reflection, packet internals, and version conditionals.
5. Separate public API compatibility from NMS/protocol compatibility.
6. Build each declared target with its required JDK and dependency set.
7. Run automated tests and a startup/command smoke test on each available runtime.
8. Record unsupported combinations and migration steps.
9. Update metadata, docs, and release notes only for verified combinations.

## Safety

Do not infer compatibility from successful compilation against one version. Do not claim Folia support unless scheduler and region-thread semantics are designed and tested. Do not silently drop support for an existing declared version.

## Failure handling

If a target runtime is unavailable, mark that matrix cell BLOCKED. If upstream APIs are ambiguous, create a compile probe or ask for the target build artifact.

## Acceptance criteria

Every supported combination is explicitly listed; each has build and runtime status; untested cells are visible; breaking changes and migration steps are documented.
