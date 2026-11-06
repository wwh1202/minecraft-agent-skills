# Art Foundation Research and Adaptation

Research snapshot: 2026-11-06. This is a design/architecture review, not a claim that every upstream project was executed locally.

## Why the previous model pipeline was incomplete

Blockbench operations can create geometry, UVs, textures and animations, but they do not automatically provide visual judgment. A useful AI art workflow also needs:
- art direction and a reusable style system;
- visual-design fundamentals (hierarchy, balance, proportion, contrast, negative space);
- silhouette and shape language;
- color/value and palette design;
- pixel-art craft and material readability;
- composition, camera and lighting;
- critique, evidence and iterative refinement;
- continuity across asset families.

## Upstream references

### Blockbench Minecraft Style Guide
https://blockbench.net/wiki/guides/minecraft-style-guide/

Use as a Minecraft-specific baseline for simplicity, element economy, pixel-to-model scale, UV ratios, hue-shifted ramps, deliberate pixel placement, banding, pillow shading, dithering and tiling. Do not universalize vanilla rules to every stylized pack; use a project style card to define justified exceptions.

### ForgeSkills
https://github.com/sekaikx/ForgeSkills

Useful patterns: dedicated art-direction and lighting skills, reference reconstruction, visual iteration, measurable gates, and recording failed attempts rather than claiming success. Its own README describes a small A/B and explicitly limits the strength of that evidence; we preserve that caution.

### Gamezxz Pixel Art Studio
https://github.com/Gamezxz/pixel-art-studio

Useful patterns: deterministic pixel placement, editable scripts, palette locking, pixel-art analysis, reference-to-style-card learning, and a see/critique/fix/re-render loop. Adapt the craft principles to Minecraft's texture and UV constraints.

### Scenario Agent Skills
https://github.com/scenario-labs/skills

Useful patterns: separating game asset, texture, 3D, sprite animation and consistency tasks into specialized skills, with model/tool selection and explicit workflow handoffs. External MCP/API use must remain optional and permission-aware.

### ProkStudio Skills
https://github.com/ProkStudio/skills

Useful patterns: pixel-art fundamentals, silhouette-first design, deliberate edges, shading, and separate color/palette expertise.

## Our adaptation

We authored nine Minecraft-specific foundation skills:
1. minecraft-art-direction
2. minecraft-visual-design-foundations
3. minecraft-silhouette-shape-language
4. minecraft-color-theory-palettes
5. minecraft-pixel-art-craft
6. minecraft-material-surface-design
7. minecraft-composition-camera-lighting
8. minecraft-visual-critique-iteration
9. minecraft-style-guide-continuity

They are designed to complement—not replace—the existing Blockbench, UV, texture, rigging, animation, export and runtime integration skills.

## License and attribution boundary

Public GitHub availability does not mean public-domain content. This repository links to upstream sources and independently writes its own procedures. Before copying any upstream code, prose, examples, textures, images or other assets, inspect the exact license and comply with its terms. Where no license is confirmed, do not copy the material.

## Validation still required

The nine skills and benchmark cases are currently Draft/authored. Required next steps:
- run routing benchmarks in at least one named agent client;
- execute art benchmark prompts with a fixed model and tool environment;
- retain source files, native-size previews, multi-angle renders, critique logs and score sheets;
- run Blockbench MCP operations against a disposable project;
- import at least one exported asset into its declared Minecraft runtime;
- record failures and update skills before claiming validation.
