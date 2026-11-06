---
name: blockbench-modeling
description: Build and edit Minecraft-style 3D geometry in Blockbench using typed MCP tools or documented Blockbench APIs. Use for block/item models, mobs, props, cosmetics, low-poly assets, and structured model edits.
---

# Blockbench Modeling

## Preflight
Inspect project format, version, coordinate system, current selection, groups, elements, and available codecs. Save or duplicate the source before destructive edits.

## Build order
1. Create or open the correct project format.
2. Establish origin, pivots, bounding box, and main groups.
3. Block out primary masses with simple geometry.
4. Check silhouette from front/side/rear/three-quarter views.
5. Add secondary forms, bevel-like stepped details, and deliberate asymmetry.
6. Name groups and elements consistently; keep hierarchy semantic.
7. Use symmetry/mirroring/array operations for repeated parts when supported.
8. Validate element limits and format-specific constraints before adding detail.

## Geometry quality
- Keep coordinates and dimensions within target format limits.
- Avoid zero-size elements, accidental overlaps, z-fighting surfaces, disconnected fragments, and unexplained duplicate geometry.
- Use meshes only when cubes cannot represent the shape cleanly or target format supports them.
- Keep model complexity appropriate for runtime and target platform.
- Never assume an MCP tool succeeded; inspect returned IDs and re-query project state.

## Completion
Capture multiple views, run validation, save a native project file, and export the target runtime format. Preserve source and exported copies separately.
