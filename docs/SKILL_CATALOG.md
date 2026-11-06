# Skill Catalog

The repository is a composable Minecraft plugin engineering workflow. Every Skill remains **Draft** until behavior evaluations have passed; repository structure CI is not a substitute for task-level validation.

## Product and discovery
| Skill | Responsibility |
|---|---|
| `market-opportunity` | Market, competitor, demand and solo-maintainer opportunity research |
| `brainstorming-spec` | Clarify user problem and choose a solution direction |
| `feature-planning` | Requirements, acceptance criteria, architecture, risks and tasks |

## Engineering workflow
| Skill | Responsibility |
|---|---|
| `implementation-planning` | Dependency-aware implementation breakdown |
| `paper-api-research` | Authoritative Paper API/version research |
| `paper-plugin-engineering` | Plugin architecture and implementation |
| `test-driven-development` | Regression-first test workflow |
| `systematic-debugging` | Evidence-based root-cause diagnosis |
| `paper-performance` | Profiling and performance optimization |
| `security-review` | Threat modeling and security findings |
| `version-compatibility` | Paper/Minecraft/Java/dependency compatibility matrix |
| `plugin-qa` | Risk-based quality and release verification |

## MCP, skills and release operations
| Skill | Responsibility |
|---|---|
| `minecraft-mcp-integration` | Select, secure and evaluate MCP tools for world/client/server control and live plugin QA |
| `skill-authoring` | Create and evaluate reusable agent Skills |
| `release-maintenance` | Package, publish, support and deprecate releases |

## Recommended end-to-end sequence

```text
market-opportunity
  -> brainstorming-spec
  -> feature-planning
  -> implementation-planning
  -> paper-api-research
  -> paper-plugin-engineering <-> test-driven-development
  -> systematic-debugging (when defects occur)
  -> paper-performance + security-review + version-compatibility
  -> minecraft-mcp-integration (when live-world/client/server interaction is required)
  -> plugin-qa
  -> release-maintenance
```

Select only relevant specialist Skills, but never skip critical compatibility, security or runtime checks. MCP is optional for ordinary unit tests and mandatory only when the acceptance criteria require live player/world/server behavior.
