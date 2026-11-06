# Skill Catalog

All skills remain **Draft** until reproducible behavioral evaluations pass. CI validates repository structure, not artistic quality or real MCP execution.

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

## Minecraft art direction and design foundations
| Skill | Responsibility |
|---|---|
| `minecraft-art-direction` | Define a coherent visual direction and style system |
| `minecraft-visual-design-foundations` | Hierarchy, balance, proportion, contrast and readability |
| `minecraft-silhouette-shape-language` | Recognizable silhouettes and shape language |
| `minecraft-color-theory-palettes` | Color roles, value hierarchy and reusable palettes |
| `minecraft-pixel-art-craft` | Deliberate pixel clusters, shading and edge craft |
| `minecraft-material-surface-design` | Readable wood, stone, metal, cloth, glass and organic surfaces |
| `minecraft-composition-camera-lighting` | Diagnostic/presentation camera and lighting |
| `minecraft-visual-critique-iteration` | Evidence-based critique and iterative refinement |
| `minecraft-style-guide-continuity` | Versioned style guide and cross-asset consistency |

## MCP and model asset production
| Skill | Responsibility |
|---|---|
| `minecraft-mcp-integration` | Select and safely evaluate Minecraft world/client/server MCPs |
| `blockbench-mcp-orchestration` | Discover and operate the actual Blockbench MCP implementation |
| `minecraft-model-brief` | Turn an idea into measurable model specifications |
| `reference-image-to-model` | Interpret authorized visual references |
| `blockbench-modeling` | Create structured geometry in Blockbench |
| `pixel-texture-uv` | Create and validate texture assignments and UVs |
| `minecraft-rig-animation` | Rig bones and create target-format animations |
| `model-validation-export` | Validate, render, review and export models |
| `minecraft-asset-integration` | Integrate assets into a named Minecraft runtime |

## Release and skill engineering
| Skill | Responsibility |
|---|---|
| `release-maintenance` | Package, publish, support and deprecate releases |
| `skill-authoring` | Create and evaluate reusable agent Skills |

## Recommended visual production sequence
`minecraft-art-direction -> minecraft-visual-design-foundations -> minecraft-silhouette-shape-language -> minecraft-model-brief -> reference-image-to-model -> blockbench-mcp-orchestration -> blockbench-modeling -> minecraft-color-theory-palettes -> minecraft-pixel-art-craft -> minecraft-material-surface-design -> pixel-texture-uv -> minecraft-rig-animation (when needed) -> minecraft-composition-camera-lighting -> minecraft-visual-critique-iteration -> model-validation-export -> minecraft-asset-integration`

`minecraft-style-guide-continuity` runs across the entire asset family. Texture, rigging and animation are conditional stages; critique is iterative and must not be skipped. Keep technical validation, visual review and in-game verification as separate evidence gates.

## Skill activation rule
Agents should route by user intent and current production stage, load the smallest sufficient skill set, and escalate to specialist skills when acceptance criteria require them. Do not invoke MCP writes for analysis-only requests.
