---
name: minecraft-color-theory-palettes
description: Build disciplined color palettes and value ramps for Minecraft pixel textures, items, entities, UI and resource packs. Use when choosing colors, improving contrast, matching a theme or unifying asset families.
---

# Minecraft Color Theory and Palettes

## Purpose
Create readable, material-aware color systems rather than arbitrary collections of attractive colors.

## Trigger
Use before painting textures, when palette consistency is poor, or when multiple assets need a shared color identity.

## Inputs
Style card, material list, biome/lighting context, texture resolution, reference colors and accessibility/readability needs.

## Workflow
1. Define palette roles: base, shadow, highlight, accent, outline, neutral, danger/reward/UI states.
2. Establish value hierarchy first; check the asset in grayscale.
3. Build compact hue-shifted ramps per material rather than only changing brightness.
4. Reserve saturated/high-contrast accents for focal details.
5. Check warm/cool balance and neighboring colors at native scale.
6. Test palette against common Minecraft backgrounds and adjacent tiled blocks.
7. Record named swatches and reuse them across the asset family.
8. Validate color count, contrast and consistency after export.

## Rules
- Avoid muddy adjacent shades that collapse at low resolution.
- Do not use random gradients or noise as a substitute for material definition.
- Avoid relying on color alone to communicate critical gameplay state.
- Keep intentional palette exceptions documented.

## Outputs
Palette sheet, named swatches, material ramps, contrast notes and texture-ready color map.

## Safety
Do not sample or reuse copyrighted game/artist palettes as a claimed original. Record references and use them as guidance within permitted bounds.

## Failure handling
If colors shift between preview and runtime, inspect color space, texture filtering, lighting and transparency before repainting.

## Acceptance criteria
The focal form reads in grayscale, material ramps remain distinct, palette roles are consistent, and textures look coherent at native resolution.
