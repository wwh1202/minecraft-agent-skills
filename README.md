# Minecraft Agent Skills

Open-source, reusable agent skills for discovering, designing, building, testing, and releasing Minecraft Paper/Java plugins **and Minecraft 3D assets**.

**Project status:** Engineering foundation and draft skill library. CI structure checks do not prove agent behavior or production readiness. Every skill remains Draft until its behavioral evaluation passes.

## What is included

- Plugin engineering: opportunity research, requirements, planning, Paper API research, implementation, TDD, debugging, security, performance, compatibility, QA, release and maintenance.
- Minecraft MCP integration: safe discovery and evaluation of world/client/server MCP tools.
- Blockbench/model pipeline: model briefs, visual-reference interpretation, geometry, pixel textures/UVs, rigging/animation, validation/export, and runtime integration.

## Model and Blockbench skill chain

`minecraft-model-brief -> reference-image-to-model -> blockbench-mcp-orchestration -> blockbench-modeling -> pixel-texture-uv -> minecraft-rig-animation -> model-validation-export -> minecraft-asset-integration`

The agent must discover the installed MCP tool schemas at runtime. It must not assume that different Blockbench MCP servers expose identical tool names or capabilities. See [MCP and model research](docs/BLOCKBENCH_MCP_AND_MODEL_SKILLS_RESEARCH.md), [model benchmarks](evals/MODEL_ASSET_BENCHMARKS.md), and [AI skill-routing benchmarks](evals/SKILL_ROUTING_BENCHMARKS.md).

## Upstream projects reviewed

- [sosadly/blockbench-mcp](https://github.com/sosadly/blockbench-mcp) — MIT, live Blockbench bridge and end-to-end model workflows.
- [Mishaadevv/blockbench-mcp](https://github.com/Mishaadevv/blockbench-mcp) — MIT, typed geometry/texture/UV/animation/export tools and headless workflow.
- [jasonjgardner/blockbench-mcp-plugin](https://github.com/jasonjgardner/blockbench-mcp-plugin) — GPL-3.0-only, desktop and headless MCP approaches.
- [iMasterProX/mcbemodelingmasterAI](https://github.com/iMasterProX/mcbemodelingmasterAI) — MIT, Bedrock model-focused agent knowledge.

We study public architectures and independently author our own skill procedures. We do not copy upstream skill prose, code, or model assets without a license permitting it.

## Repository map

- `skills/` — individual agent skills with trigger descriptions.
- `docs/` — architecture, research, governance and catalogs.
- `evals/` — reproducible behavioral benchmark scenarios.
- `scripts/` and `.github/workflows/` — deterministic validation and CI.

## How to use

Give your coding agent the relevant `SKILL.md` file(s), project context, exact Minecraft/Blockbench/runtime versions, and acceptance criteria. For MCP-based operations, connect an MCP server separately and allow only the tools required by the task. Review security guidance before enabling file writes, plugin installation, or arbitrary code execution.

No universal installer or cross-agent compatibility claim is made until each target agent environment is tested.

## License

MIT for original content in this repository. Third-party projects and assets retain their own licenses.
