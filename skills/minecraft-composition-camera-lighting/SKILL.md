---
name: minecraft-composition-camera-lighting
description: Present Minecraft models and assets with effective composition, camera angles, lighting and renders for critique, showcases and documentation. Use when a model looks flat, is hard to inspect or needs a professional preview.
---

# Minecraft Composition, Camera and Lighting

## Purpose
Show the model clearly and attractively without hiding defects or misrepresenting in-game appearance.

## Trigger
Use for turntable renders, multi-view model reviews, promotional previews, screenshots and visual debugging.

## Inputs
Model, purpose of image, target audience, style card, required views and actual runtime lighting constraints.

## Workflow
1. Choose a camera that communicates the subject; use orthographic views for proportion checks and perspective for presentation.
2. Keep focal subject dominant and background quiet.
3. Use key/fill/rim lighting only when consistent with the art direction; record light direction and relative intensity.
4. Avoid dramatic shadows that conceal geometry, texture or UV defects.
5. Capture front, side, rear and three-quarter diagnostic views.
6. Capture a native-game-scale preview and, where possible, an in-game screenshot.
7. Keep presentation renders separate from technical evidence.

## Outputs
Camera/light setup, diagnostic view set, presentation render and notes on differences from in-game appearance.

## Safety
Do not use misleading renders as proof of runtime compatibility. Preserve source scene/camera settings.

## Failure handling
If lighting or camera makes the model difficult to judge, switch to neutral orthographic lighting before editing geometry.

## Acceptance criteria
All required parts are visible in diagnostic views, focal hierarchy is clear in presentation images, and no render is misrepresented as an in-game test.
