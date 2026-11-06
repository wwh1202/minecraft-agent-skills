# Skill Evaluation Suite

This directory is for behavioral evaluations, not only markdown structure checks.

## Current status

Starter benchmark scenarios live under each skill's `tests/SCENARIOS.md`. They are test definitions and are **NOT_RUN** until an agent is actually given the task and its output is scored.

## Required case format

Each future machine-readable case should include:
- unique case ID and skill ID;
- prompt/input;
- environment and tool availability;
- expected behaviors;
- forbidden behaviors;
- scoring rubric;
- status: NOT_RUN / PASS / FAIL / BLOCKED;
- evidence link or report path.

## Next implementation

Convert the Markdown starter cases into JSON/YAML fixtures, add a deterministic schema validator, then add a repeatable runner for supported agent environments. Do not report agent effectiveness from structural CI alone.
