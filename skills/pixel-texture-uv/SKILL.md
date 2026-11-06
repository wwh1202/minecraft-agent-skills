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
