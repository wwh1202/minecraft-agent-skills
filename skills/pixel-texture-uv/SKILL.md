---
name: pixel-texture-uv
description: Create, edit, unwrap, assign, and validate pixel-art textures and UVs for Minecraft Blockbench models. Use when generating texture atlases, painting faces, handling transparency/emissive layers, or fixing UV and texture assignment issues.
---

# Pixel Texture and UV

## Plan
Set texture resolution from target format and art direction before painting. Define palette, material regions, transparency, emissive usage, and naming. Prefer a coherent atlas over many tiny textures unless runtime constraints require separation.

## Workflow
1. Inspect model faces, UV layout, existing textures, and texture dimensions.
2. Create a texture template or atlas with a documented palette.
3. Assign UVs deliberately; avoid stretched, mirrored, or off-atlas faces unless intentional.
4. Paint large color regions first, then material separation, shadows/highlights, and distinctive pixels.
5. Use deterministic/seeded procedural generation where supported and record parameters.
6. Inspect texture pixels and model appearance under neutral lighting.
7. Validate missing texture references, alpha channel, dimensions, UV bounds, and face assignments.
8. Export texture files with stable names and verify they reopen.

## Quality checks
- Palette is limited and consistent; neighboring faces align at seams.
- Pixel scale is consistent and no accidental blur/resampling occurs.
- Transparent pixels are intentional and correct for the target runtime.
- UV islands do not overlap unless intentional.
- Every visible face has an expected texture/material.

## Purpose
Create consistent pixel-art textures and UV layouts that render correctly in the target Minecraft asset format.

## Trigger
Activate when creating/painting textures, editing UV islands, fixing seams, or validating face-to-texture assignments.

## Inputs
Native model, target format, texture resolution, palette/style, transparency/emissive requirements, and texture naming rules.

## Outputs
Texture atlas/files, UV assignments, palette notes, preview screenshots, and texture validation findings.

## Safety
Preserve source textures and do not overwrite user artwork without approval. Use only authorized source images and textures.

## Failure handling
If the format's UV or alpha behavior is unclear, inspect official format docs and create a minimal disposable test asset before changing the full model.

## Acceptance criteria
All visible faces resolve to intended textures, UVs remain in bounds, seams are reviewed, pixel sharpness is preserved, and exported textures reopen.
