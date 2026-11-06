# Skill Catalog

The repository is a composable Minecraft engineering and asset-production workflow. Every Skill remains **Draft** until behavioral evaluations pass; repository CI is not proof of task-level effectiveness.

## Product and discovery
| Skill | Responsibility |
|---|---|
| `market-opportunity` | Market, competitor, demand and solo-maintainer research |
| `brainstorming-spec` | Clarify user problem and solution direction |
| `feature-planning` | Requirements, acceptance criteria, architecture, risks and tasks |

## Plugin engineering
| Skill | Responsibility |
|---|---|
| `implementation-planning` | Dependency-aware implementation breakdown |
| `paper-api-research` | Authoritative Paper API/version research |
| `paper-plugin-engineering` | Plugin architecture and implementation |
| `test-driven-development` | Regression-first test workflow |
| `systematic-debugging` | Evidence-based root-cause diagnosis |
| `paper-performance` | Profiling and performance optimization |
| `security-review` | Threat modeling and security findings |
| `version-compatibility` | Paper/Minecraft/Java/dependency compatibility |
| `plugin-qa` | Risk-based quality and release verification |

## MCP and model asset production
| Skill | Responsibility |
|---|---|
| `minecraft-mcp-integration` | Select and safely evaluate Minecraft world/client/server MCPs |
| `blockbench-mcp-orchestration` | Discover and operate the actual Blockbench MCP implementation |
| `minecraft-model-brief` | Turn an idea into a measurable model specification |
| `reference-image-to-model` | Interpret user-authorized visual references and review similarity |
| `blockbench-modeling` | Create structured geometry in Blockbench |
| `pixel-texture-uv` | Create and validate pixel textures and UVs |
| `minecraft-rig-animation` | Rig bones and create target-format animations |
| `model-validation-export` | Validate, render, review and export models |
| `minecraft-asset-integration` | Integrate assets into a named Minecraft runtime |

## Release and skill engineering
| Skill | Responsibility |
|---|---|
| `release-maintenance` | Package, publish, support and deprecate releases |
| `skill-authoring` | Create and evaluate reusable agent Skills |

## Recommended plugin sequence
`market-opportunity -> brainstorming-spec -> feature-planning -> implementation-planning -> paper-api-research -> paper-plugin-engineering <-> test-driven-development -> systematic-debugging (when needed) -> paper-performance + security-review + version-compatibility -> minecraft-mcp-integration (when live interaction is needed) -> plugin-qa -> release-maintenance`

## Recommended model sequence
`minecraft-model-brief -> reference-image-to-model -> blockbench-mcp-orchestration -> blockbench-modeling -> pixel-texture-uv -> minecraft-rig-animation -> model-validation-export -> minecraft-asset-integration`

Texture, rigging, and animation are conditional stages. Validation/export and target-runtime checks remain mandatory. Read [the Blockbench MCP research](BLOCKBENCH_MCP_AND_MODEL_SKILLS_RESEARCH.md) and [model benchmarks](../evals/MODEL_ASSET_BENCHMARKS.md).
