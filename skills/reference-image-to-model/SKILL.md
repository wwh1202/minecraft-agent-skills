---
name: reference-image-to-model
description: Turn user-provided concept art, screenshots, sketches, or reference images into an evidence-based Minecraft voxel model plan. Use when AI must interpret visual references before building a Blockbench model or when visual similarity must be reviewed.
---

# Reference Image to Model

## Rules
- Use only images supplied by the user or images they explicitly authorize. Do not claim a single screenshot reveals hidden sides.
- Separate observed facts from inferred geometry. Maintain an uncertainty list.
- Identify view direction, perspective distortion, lighting, shadows, background, and scale cues before estimating dimensions.
- Extract silhouette, major masses, color regions, material cues, and distinctive features.
- Build a part map with proposed cubes/meshes, pivots, and hierarchy; state which dimensions are approximate.
- For multiple views, align landmarks and resolve conflicts; prefer orthographic views for dimensions.
- Preserve recognizable features while adapting detail to the target Minecraft format and texture resolution.

## Iterative visual loop
1. Describe the reference and its visible views.
2. Draft a silhouette/blockout plan.
3. Create a low-detail blockout in Blockbench.
4. Capture front, side, rear, and three-quarter screenshots.
5. Compare proportions and landmark positions against the reference.
6. List concrete mismatches, prioritize silhouette before micro-detail, then revise.
7. Repeat until acceptance criteria or iteration budget is reached.

## AI visual review rubric
Score 0-2 each: silhouette, proportions, orientation, major feature placement, palette, material readability, and consistency across views. A score is not a substitute for human approval. Do not mark a model complete if critical landmarks are missing or the screenshot angle hides a defect.

## Deliverable
Reference breakdown, uncertainty notes, part map, model review images, mismatch list, and final human-review status.
