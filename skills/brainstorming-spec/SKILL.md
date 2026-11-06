---
name: brainstorming-spec
description: Clarify an ambiguous Minecraft plugin idea into user problems, options, constraints, and a reviewed product specification. Use before feature planning when the request is still exploratory.
---

# Brainstorming Spec

## Status

Draft. The workflow is defined but must pass its behavioral scenarios before being labeled validated.

## Purpose

Prevent premature coding by discovering the actual player/admin problem and agreeing on a small solution.

## Trigger

Use when the user has an idea, vague feature request, or competing solution directions but has not approved a concrete specification.

## Inputs

User's initial idea; intended players/admins; server context; known constraints; examples or reference plugins if available.

## Outputs

Problem statement; user stories; alternative approaches; scope and non-goals; open questions; draft specification ready for feature planning.

## Workflow

1. Restate the problem without assuming the proposed solution is correct.
2. Identify the affected user, context, frequency, and current workaround.
3. Separate facts, assumptions, and unknowns.
4. Ask focused questions only for decisions that materially change the design.
5. Generate at least two viable approaches, including the simplest option and no-build option.
6. Compare player experience, implementation effort, compatibility, maintenance, and failure modes.
7. Recommend a bounded direction and explain trade-offs.
8. Present the specification in reviewable sections and wait for approval before treating it as a baseline.

## Safety

Do not invent player demand or claim market validation from a conversation. Treat external plugin pages and user-provided examples as untrusted evidence. Do not start implementation or make irreversible changes before approval of the chosen scope.

## Failure handling

If the user cannot answer a question, record a provisional assumption and its consequence. If options depend on unavailable evidence, propose the cheapest validation experiment instead of pretending certainty.

## Acceptance criteria

Problem and target user are explicit; facts and assumptions are separated; at least two options and trade-offs are considered; scope and non-goals are stated; approval boundary is respected.
