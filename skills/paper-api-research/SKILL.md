---
name: paper-api-research
description: Research Paper, Bukkit, Adventure, and version-specific plugin APIs using authoritative documentation and repository metadata before implementing unfamiliar APIs.
---

# Paper Api Research

## Status

Draft. The workflow is defined but must pass its behavioral scenarios before being labeled validated.

## Purpose

Avoid hallucinated, deprecated, or version-incompatible API usage.

## Trigger

Use when an API is unfamiliar, version-sensitive, experimental, deprecated, or involves Paper lifecycle, commands, events, components, data components, or NMS.

## Inputs

Exact task; target Paper/Minecraft version; Java version; build dependencies; current code context.

## Outputs

Source-backed API decision; version compatibility notes; minimal example; alternatives/fallback; implementation constraints.

## Workflow

1. Identify the exact API surface and target version.
2. Search PaperMC official documentation and Javadocs first.
3. Check dependency coordinates and API signatures for the project's actual version.
4. Inspect release notes or migration guides when behavior changed between versions.
5. Use third-party examples only as secondary evidence and check their version/license.
6. Distinguish stable public API from experimental API, internals, reflection, and NMS.
7. Record thread requirements, lifecycle constraints, and relevant deprecations.
8. Provide a minimal compilable example or a focused verification experiment.
9. If evidence conflicts, prefer target-version official docs and a compile check.

## Safety

Never claim an API exists based only on a search snippet. Do not copy substantial third-party source code without checking license and attribution requirements. Do not recommend bypassing access controls or using internals without a clear version-risk explanation.

## Failure handling

If official docs are unavailable or ambiguous, mark the API conclusion provisional and propose a compile probe against the declared dependency. If the build cannot run, mark compilation BLOCKED.

## Acceptance criteria

Every material API claim has an authoritative source or is labeled provisional; target version is explicit; thread/lifecycle constraints are documented; example compiles or is marked NOT_RUN/BLOCKED.
