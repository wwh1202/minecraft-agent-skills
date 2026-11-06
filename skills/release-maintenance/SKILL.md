---
name: release-maintenance
description: Prepare Minecraft plugin releases with reproducible artifacts, versioning, changelogs, compatibility notes, rollback guidance, and sustainable maintenance planning.
---

# Release Maintenance

## Status

Draft. The workflow is defined but must pass its behavioral scenarios before being labeled validated.

## Purpose

Make releases installable, diagnosable, and supportable by a solo developer.

## Trigger

Use when packaging, publishing, updating, deprecating, or planning ongoing support for a Paper plugin.

## Inputs

Repository state; release scope; tested matrix; build outputs; license/dependency inventory; known issues; release target.

## Outputs

Release checklist; artifact provenance; changelog; installation/upgrade/rollback guide; support policy; maintenance estimate.

## Workflow

1. Confirm the release scope and clean working tree.
2. Run clean build and all required tests; record exact results.
3. Verify plugin metadata, version, dependencies, permissions, default configs, and generated resources.
4. Check license obligations for code, dependencies, assets, and bundled libraries.
5. Produce reproducible artifact metadata: commit, build command, toolchain, checksum.
6. Write user-facing changelog, supported-version matrix, installation, config, and migration notes.
7. Provide backup and rollback steps for persistent data changes.
8. Review permissions, secrets, logs, and known security issues.
9. Estimate support burden and define issue-response/deprecation policy.
10. Obtain explicit approval before publishing or deploying; after release, monitor feedback and triage regressions.

## Safety

Never publish or deploy without explicit approval. Never bundle assets or source code without compatible rights. Do not label a build tested if it was not run. Never include credentials, private server data, or player records in release artifacts.

## Failure handling

If a critical test is blocked or a license is unclear, hold the release or disclose the blocker and obtain an explicit risk waiver. If rollback is impossible, treat that as a release-blocking risk for data-changing updates.

## Acceptance criteria

Artifact is traceable to a commit; declared tests and compatibility evidence are accurate; license and migration notes are checked; rollback/support plan exists; publication approval is recorded.
