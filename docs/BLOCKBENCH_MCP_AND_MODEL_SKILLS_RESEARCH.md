# Blockbench MCP and Minecraft Model Skill Research

Research snapshot: 2026-11-06. This is a source map and design synthesis, not an endorsement or claim that every project has been installed or independently tested.

## Repositories reviewed

| Project | Observed design/capabilities | License / reuse posture | How this project uses it |
|---|---|---|---|
| [jasonjgardner/blockbench-mcp-plugin](https://github.com/jasonjgardner/blockbench-mcp-plugin) | Desktop Blockbench plugin plus headless stdio server; direct .bbmodel editing, validation, conversion, rendering; documents plugin extension hooks. | GPL-3.0-only per project metadata. Do not copy code into this MIT repository without a deliberate compatible licensing decision. | Learn the live/headless split, MCP discovery, validation/render loop, and extension model at the workflow level. |
| [Mishaadevv/blockbench-mcp](https://github.com/Mishaadevv/blockbench-mcp) | Broad typed toolset for geometry, procedural textures, UV, animation, codecs/export, screenshots, project operations; headless file path. | MIT license verified from repository LICENSE. | Learn typed tool categories, batch/step execution, headless reproducibility, multi-angle review, and validation-before-export. |
| [sosadly/blockbench-mcp](https://github.com/sosadly/blockbench-mcp) | MCP server plus Blockbench plugin; modeling, texturing, rigs, keyframes, visual review, guidance/playbooks, plugin and export workflows. | MIT license verified from repository LICENSE. | Learn staged quality gates, guide/playbook retrieval, reference comparison, review panel and animation workflow. |
| [RenasDemirbas/BlockBenchMCP](https://github.com/RenasDemirbas/BlockBenchMCP) | Model/texture/rig/animation/render workflows; undo history, local bridge, headless option described in project docs. | Verify the current LICENSE before copying any code or documentation. | Candidate for future comparative tests; do not assume capability or security without version-pinned review. |
| [adhi-jp/minecraft-blockbench-mcp](https://github.com/adhi-jp/minecraft-blockbench-mcp) | Adapter/bridge architecture: MCP stdio adapter validates schemas while Blockbench plugin executes operations through Blockbench APIs. | Verify current license before copying. | Learn separation of protocol adapter and editor-side execution, version negotiation, undo/viewport refresh boundaries. |
| [zeroa234/game-asset-aesthetic-test](https://github.com/zeroa234/game-asset-aesthetic-test) | Describes game-art Agent Skills including Blockbench cube characters, pixel sprites, Spine and voice workflow. | No repository license found in the inspected license endpoint. Treat as reference-only; do not copy code, text, prompts, assets or skill files. | Learn the idea of cross-art-pipeline skill composition; independently author our own procedures. |
| [iMasterProX/mcbemodelingmasterAI](https://github.com/iMasterProX/mcbemodelingmasterAI) | Bedrock entity-modeling agent knowledge, tools and skills for code-based modeling of creatures/vehicles/props. | MIT license verified from repository LICENSE. | Learn platform-specific Bedrock modeling knowledge organization; keep format-specific validation separate. |
| [Animated-Java/animated-java](https://github.com/Animated-Java/animated-java) | Blockbench plugin focused on complex Minecraft Java Edition animation workflows. | Check current license before reuse. | Candidate integration target; animation export must be evaluated separately from Bedrock/GeckoLib. |

## Design conclusions

1. A single generic "3D model" skill is insufficient. Separate brief/specification, reference interpretation, geometry, pixel texture/UV, rig/animation, validation/export, and runtime integration.
2. MCP is a tool transport and capability surface, not a guarantee of correctness. The Skill must discover actual tools and schemas at runtime.
3. Prefer typed MCP tools and explicit result references over arbitrary eval/execute-JS. Arbitrary code and plugin-install tools are high-risk.
4. Support both live-editor and headless workflows, but do not mix their assumptions.
5. AI must inspect visual outputs from multiple angles and distinguish observed defects from inferred defects.
6. A model is not "done" because it exports. Runtime import and in-game verification are separate acceptance gates.
7. Use original instructions and tests. Public visibility does not waive copyright. Keep source links and license notes; never copy assets or skill prose from repositories without explicit permission/license.

## Recommended end-to-end chain

`minecraft-model-brief -> reference-image-to-model -> blockbench-mcp-orchestration -> blockbench-modeling -> pixel-texture-uv -> minecraft-rig-animation -> model-validation-export -> minecraft-asset-integration`

Skip optional stages only when the target asset does not require them. Always run validation/export and target-runtime checks.

## Candidate selection notes

- Best first hands-on MCP candidate: [sosadly/blockbench-mcp](https://github.com/sosadly/blockbench-mcp) because the inspected repository advertises a clear MIT license and end-to-end model/texture/rig/animation/review tools.
- Strong alternative for headless file operations: [Mishaadevv/blockbench-mcp](https://github.com/Mishaadevv/blockbench-mcp), also MIT; requires Node.js 18+ and Blockbench Desktop 4.9+ according to its README.
- Mature candidate with GPL constraints: [jasonjgardner/blockbench-mcp-plugin](https://github.com/jasonjgardner/blockbench-mcp-plugin). Evaluate separately; do not merge its code into this MIT project casually.
- For live operations, keep the bridge loopback-only, disable arbitrary eval unless required, and use a dedicated test project directory.

## Validation status

- Repository and README/license surfaces inspected: yes.
- Skill procedures authored independently: yes.
- MCP packages installed and connected in this environment: no.
- Real Blockbench modeling task executed: no.
- Minecraft runtime import tested: no.
- Therefore all new skills remain Draft pending behavioral evaluation.
