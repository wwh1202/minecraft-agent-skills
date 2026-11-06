---
name: minecraft-visual-critique-iteration
description: Critique and improve Minecraft models, textures, icons and scenes through evidence-based visual iteration. Use when the user asks whether an asset looks good, requests polish, or expects AI to detect and fix visual flaws.
---

# Minecraft Visual Critique and Iteration

## Purpose
Turn subjective feedback into a prioritized, repeatable correction loop.

## Trigger
Use after a first draft, when matching a reference, or whenever visual quality must be improved before delivery.

## Workflow
1. Capture the current artifact at native size and required angles.
2. Compare it with the brief, style card and reference.
3. Score 0-2 for silhouette, proportion, hierarchy, palette/value, material readability, texture craft, consistency and target-scale readability.
4. Record concrete defects with evidence and severity; separate objective defects from taste.
5. Select the single highest-impact fix (or a tightly coupled group).
6. Change only that issue, render again and compare before/after.
7. Keep a short iteration log and stop when gates pass or budget is exhausted.
8. Request human review for subjective style choices and unresolved trade-offs.

## Non-negotiable rules
- Never say "looks good" without inspected evidence.
- Do not change many unrelated variables in one iteration.
- Do not hide defects with camera angle, lighting or post-processing.
- A high score cannot compensate for a failed critical requirement.
- Preserve failed attempts when they explain a design decision.

## Outputs
Scored critique, annotated defect list, before/after evidence, iteration log and final review status.

## Safety
Do not overwrite the original; use checkpoints and reversible edits.

## Failure handling
If no render/screenshot can be inspected, mark visual review NOT RUN and do not claim the asset passed.

## Acceptance criteria
Every critical defect is fixed or explicitly accepted, the same review rubric is applied before and after, and the final artifact is inspectable.
