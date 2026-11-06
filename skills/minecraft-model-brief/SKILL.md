---
name: minecraft-model-brief
description: Convert a Minecraft mob, item, block, cosmetic, prop, or character idea into a measurable 3D model specification. Use before creating Blockbench models, Bedrock geometry, Java item/block models, GeckoLib assets, rigs, or animations.
---

# Minecraft Model Brief

## Inputs
Capture target game/platform and loader, target format, intended in-game scale, reference images, silhouette, palette, style, texture resolution, animation needs, export destination, and performance constraints. Ask only for missing facts that materially change the asset.

## Produce a model brief
- Asset identity and in-game purpose.
- Target format and exact supported version.
- Front/side/back silhouette notes and coordinate/orientation convention.
- Bounding box, origin/pivot, proportions, symmetry, and level of detail.
- Named body parts and hierarchy proposal.
- Texture atlas dimensions, palette, transparency/emissive requirements.
- Required animations and states (idle, walk, attack, hurt, death, interaction).
- Export files and runtime integration target.

## Design constraints
- Prefer readable silhouettes and intentional negative space over unnecessary cube count.
- Reuse mirrored geometry where appropriate; avoid accidental duplicate/intersecting parts.
- Keep pivots and bone names stable for animation/runtime integration.
- Distinguish visual reference from licensed source assets. Record attribution and permission.
- Never infer exact geometry from one perspective; mark uncertain dimensions.

## Acceptance criteria
A brief is ready only when platform/format, scale/origin, parts hierarchy, texture plan, animation scope, and export target are explicit. Produce a checklist that can be evaluated from the model and exported files.
