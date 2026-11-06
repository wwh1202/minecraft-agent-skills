---
name: model-validation-export
description: Validate, review, render, and export Blockbench/Minecraft model assets. Use before delivery or when diagnosing invalid geometry, missing textures, bad UVs, broken rigs, wrong codecs, or runtime import failures.
---

# Model Validation and Export

## Validation layers
1. **Project**: file opens, expected format/version, no missing linked resources.
2. **Geometry**: bounds, element count, zero-size elements, duplicates, overlaps, face directions, origin and pivots.
3. **Texture/UV**: texture references resolve, dimensions/alpha are valid, UVs are in bounds, seams and atlas are intentional.
4. **Rig/animation**: parent references, pivots, channels, animation names and loops are valid.
5. **Export**: correct codec, expected filenames, no unintended path overwrite, output files exist and are non-empty.
6. **Runtime**: import into the actual Minecraft/loader/plugin environment and verify appearance and behavior.

## Review protocol
- Run the MCP/server validator and record raw findings.
- Capture front, side, rear, top (when relevant), and three-quarter views.
- Use AI visual inspection to identify visible defects, but keep machine checks and visual checks separate.
- Export to a temporary directory first; reopen/import before replacing final deliverables.
- Report unsupported checks explicitly; do not translate “validator passed” into “runtime works”.

## Release bundle
Include native editable source, exported runtime asset, textures, animation files, target version/format, validation report, screenshots, attribution/license notes, and known limitations.
