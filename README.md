# Minecraft Agent Skills

Open-source, reusable agent skills for Minecraft **plugin engineering, AI-assisted art direction, Blockbench modeling, textures, animation, MCP automation, validation and release**.

**Project status:** Draft skill library with structural CI. CI does not prove agent behavior, artistic quality, MCP connectivity or in-game compatibility. Individual skills remain Draft until their behavioral evaluations pass.

## Capability groups

- **Plugin engineering:** opportunity research, requirements, implementation planning, Paper API research, TDD, debugging, security, performance, compatibility, QA and release.
- **Art direction and design foundations:** visual hierarchy, composition, silhouette, shape language, color theory, palette systems, pixel-art craft, material design, camera, lighting, critique and style continuity.
- **Model and asset production:** reference interpretation, Blockbench geometry, UVs, textures, rigs, animations, export and runtime integration.
- **MCP orchestration:** discover the actual installed Minecraft/Blockbench MCP tools and schemas; use least-privilege workflows.

## Recommended visual asset pipeline

`minecraft-art-direction -> minecraft-visual-design-foundations -> minecraft-silhouette-shape-language -> minecraft-model-brief -> reference-image-to-model -> blockbench-mcp-orchestration -> blockbench-modeling -> minecraft-color-theory-palettes -> minecraft-pixel-art-craft -> minecraft-material-surface-design -> pixel-texture-uv -> minecraft-rig-animation (when needed) -> minecraft-composition-camera-lighting -> minecraft-visual-critique-iteration -> model-validation-export -> minecraft-asset-integration`

`minecraft-style-guide-continuity` governs consistency across the entire asset family. See [Skill Catalog](docs/SKILL_CATALOG.md), [Art foundation research](docs/ART_FOUNDATION_RESEARCH.md), [Art quality benchmarks](evals/ART_DIRECTION_BENCHMARKS.md), [MCP/model research](docs/BLOCKBENCH_MCP_AND_MODEL_SKILLS_RESEARCH.md), and [AI routing benchmarks](evals/SKILL_ROUTING_BENCHMARKS.md).

## Upstream projects and references

- [Blockbench Minecraft Style Guide](https://blockbench.net/wiki/guides/minecraft-style-guide/) — Minecraft-specific geometry, pixel scale, shading, UV and texture craft.
- [ForgeSkills](https://github.com/sekaikx/ForgeSkills) — game art direction, reference reconstruction, lighting and measured visual iteration.
- [Gamezxz Pixel Art Studio](https://github.com/Gamezxz/pixel-art-studio) — deterministic pixel drawing, palettes, animation and critique.
- [Scenario Agent Skills](https://github.com/scenario-labs/skills) — game assets, textures, 3D and style-consistent asset workflows.
- [ProkStudio Skills](https://github.com/ProkStudio/skills) — pixel-art fundamentals and color/palette craft.
- [sosadly/blockbench-mcp](https://github.com/sosadly/blockbench-mcp) — live Blockbench MCP bridge.
- [Mishaadevv/blockbench-mcp](https://github.com/Mishaadevv/blockbench-mcp) — typed model operations and headless workflows.

We study public architecture and independently author our procedures. We do not copy upstream skill prose, code, or model assets without a license permitting it. Third-party projects retain their own licenses.

## Skill activation

Agents should infer the current task and production stage from the user's request, load the smallest sufficient skill set, and follow its trigger/acceptance criteria. An analysis-only request must not trigger MCP write operations. MCP tool names and schemas must be discovered from the installed server at runtime; never assume different servers are interchangeable.

## Validation

- `evals/SKILL_ROUTING_BENCHMARKS.md` tests whether an agent selects the right skills.
- `evals/ART_DIRECTION_BENCHMARKS.md` tests visual judgment and design workflow.
- `evals/MODEL_ASSET_BENCHMARKS.md` tests model and export workflows.

A scenario is not Passed until the agent, model/client version, tool environment, artifacts, scores and failures are recorded. Do not infer artistic quality from markdown lint or CI structure checks.

## License

MIT for original content in this repository. Upstream projects, third-party code and art assets retain their own licenses.
