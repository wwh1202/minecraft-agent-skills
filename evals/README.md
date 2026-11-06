# Skill Evaluation Suite

This directory is for behavioral evaluations, not only Markdown structure checks.

## Current evaluation cases
- `COMPOSITION_BENCHMARKS.md`: ten cross-skill scenario definitions; each remains NOT_RUN until executed and scored.
- `challenges/paper-plugin-lifecycle/README.md`: PAPER-E2E-001, a synthetic Paper 1.21.11 plugin repair and real-player acceptance challenge. Status: SPEC_READY / NOT_RUN.

## Required case format
Each case must include:
- unique case ID and skill IDs;
- prompt/input and environment/tool availability;
- expected behaviors and forbidden behaviors;
- scoring rubric;
- status: NOT_RUN / PASS / FAIL / BLOCKED;
- evidence report path or URL.

Do not claim agent effectiveness from structure CI. A full PASS for PAPER-E2E-001 requires a real disposable Paper server and live bot-player assertions; mocked tests alone are insufficient.
