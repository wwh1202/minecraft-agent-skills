---
name: test-driven-development
description: Apply a red-green-refactor loop to Minecraft plugin logic and integrations, choosing unit, mock, integration, or live Paper tests appropriate to the behavior.
---

# Test Driven Development

## Status

Draft. The workflow is defined but must pass its behavioral scenarios before being labeled validated.

## Purpose

Make behavior testable before implementation and prevent unverified code from being reported as complete.

## Trigger

Use when adding behavior, fixing a defect, or changing a regression-prone plugin subsystem.

## Inputs

Requirement and acceptance criteria; code under test; build/test framework; target runtime and available Paper test environment.

## Outputs

Failing test demonstrating the requirement; minimal implementation; passing test evidence; refactoring notes; remaining untested runtime risks.

## Workflow

1. Identify the smallest behavior and its observable contract.
2. Choose the narrowest valid test layer: pure unit test, adapter test, integration test, or server test.
3. Write a test that fails for the intended reason; record the failure.
4. Implement the smallest change that makes it pass.
5. Run the focused test, then related regression tests.
6. Refactor while keeping tests green.
7. Add edge cases for invalid input, permissions, missing dependencies, and persistence when relevant.
8. Run clean build and server smoke tests for changes that depend on Paper runtime behavior.
9. Record exact commands, versions, and outcomes.

## Safety

Never fabricate test output or weaken assertions merely to get a green build. Do not mock away the behavior under test. Do not claim a unit test proves thread safety, server compatibility, or runtime behavior.

## Failure handling

If a test environment is unavailable, mark that layer BLOCKED and explain the missing dependency. If a test fails unexpectedly, preserve the failure and diagnose before changing assertions.

## Acceptance criteria

A meaningful test fails before the fix and passes after it; regressions are covered; exact commands and results are recorded; untested runtime claims remain explicit.
