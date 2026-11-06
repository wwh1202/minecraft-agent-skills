---
name: minecraft-pixel-art-craft
description: Apply pixel-art craft to Minecraft item, block, entity, icon and UI textures. Use for deliberate pixel clusters, clean edges, shading, dithering, anti-aliasing decisions and native-resolution readability.
---

# Minecraft Pixel Art Craft

## Purpose
Teach the agent to design pixels intentionally instead of producing noisy miniature paintings.

## Trigger
Use for pixel texture creation, texture cleanup, pixel-art critique, item icons and low-resolution asset work.

## Inputs
Target resolution, texture type, palette, light direction, material, UV layout and intended viewing scale.

## Workflow
1. Lock canvas dimensions and pixel grid before drawing.
2. Establish silhouette and large color clusters.
3. Use a deliberate limited palette and hue-shifted value ramps.
4. Place highlights and shadows according to form and a consistent light direction.
5. Define materials through cluster shapes, edge treatment and contrast.
6. Inspect diagonals for jaggies, banding, pillow shading and accidental noise.
7. Use dithering and anti-aliasing only when they improve the image at native scale.
8. Review the texture on the 3D model and in-game lighting; revise pixels that look good only when zoomed in.

## Common defects to detect
Mixels, inconsistent pixel scale, noisy brush texture, random dithering, pillow shading, banding, jaggies, muddy outlines, stretched UV pixels and accidental blur.

## Outputs
Editable texture, palette record, pixel-level critique, UV preview and native-scale screenshot.

## Safety
Preserve original texture layers/files and use only authorized source material.

## Failure handling
If a texture is too small for required detail, simplify the design or change resolution only when the target format permits it.

## Acceptance criteria
Pixels form intentional clusters, resolution is consistent, material and shape remain legible at native size, and no listed defect remains unexplained.
