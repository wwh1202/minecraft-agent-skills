# Minecraft Art Direction and Visual Quality Benchmarks

All scenarios are authored but NOT RUN until a named model/client, tool environment and artifact evidence are attached.

## Cases
1. Design a cute forest fox mob: art direction, silhouette, proportion, palette, material and Blockbench model.
2. Design a hostile boss: readable danger shape language, focal hierarchy, material contrast and animation silhouette.
3. Create a 16x16 ruby sword icon: silhouette, hue-shifted ramp, top-left light, pixel clusters and native-size readability.
4. Create a 16x16 block texture that tiles 3x3: detect seams, repetition and lighting discontinuity.
5. Create a coherent 12-item fantasy set: shared style card, palette tokens, proportion and material rules.
6. Critique a noisy entity texture: detect mixels, banding, pillow shading, jaggies, over-dithering and material ambiguity.
7. Improve a flat 3D prop: diagnose silhouette, value hierarchy, camera and lighting separately.
8. Match a user-provided reference: distinguish observed features from inference and review multiple angles.
9. Make a model readable at actual gameplay distance: compare native-scale render and close-up.
10. Continue an existing resource-pack style: detect drift and document exceptions.

## Score (0-4 each)
- brief and style-system correctness
- silhouette and recognition
- proportion and hierarchy
- palette/value discipline
- pixel craft and material readability
- geometry/UV correctness
- camera/presentation honesty
- iterative critique quality
- cross-asset consistency
- target-runtime verification

## Pass gates
- No critical requirement may score 0.
- No unsupported claim of runtime success.
- Visual review requires inspectable renders at native scale and diagnostic angles.
- Report model/client/tool versions, artifacts, score, failures and human-review status.
- Do not claim art skill validation from static lint or a generated image alone.
