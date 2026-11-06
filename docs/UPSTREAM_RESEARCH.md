# Upstream Skill Research and Adaptation Record

Research date: 2026-11-06

This project studies public skills and official technical documentation. We write our own workflows and examples; we do not mirror upstream skill text or bundle third-party code without license review.

## Minecraft-specific references

| Source | Observed strengths | Adopted ideas | Boundary |
|---|---|---|---|
| [MrPippi/MJP-Paper-Skills](https://github.com/MrPippi/MJP-Paper-Skills) | 31 focused Paper API/NMS skills; registry; reusable references; versioned compile verification; thread rules | Small domain skills, registry, platform/version references, compile verification | Do not copy its skill content or assume its templates match our target versions |
| [GitHub Awesome Copilot: minecraft-plugin-development](https://github.com/github/awesome-copilot/tree/main/skills/minecraft-plugin-development) | Project discovery; architecture patterns; lifecycle registration; state modeling; config/persistence; runtime validation | Repository-first discovery, lifecycle checklist, explicit state, runtime test plans | Treat as a reference design; independently verify API and license before reusing code |
| [PaperMC Developer Documentation](https://docs.papermc.io/paper/dev/) | Primary source for setup, plugin lifecycle, APIs, scheduler and platform-specific behavior | Official docs-first research and version-aware implementation | API behavior must be checked for the project's exact Paper version |

## General software engineering references

| Source | Observed strengths | Adopted ideas | Boundary |
|---|---|---|---|
| [obra/superpowers](https://github.com/obra/superpowers) | Composable brainstorming, planning, TDD, debugging, review, branch completion; evidence-first workflow | Separate discovery, planning, TDD, debugging, review, verification skills | We use the workflow concepts, not a wholesale copy of its skills |
| [Agent Skills specification](https://agentskills.io/specification) | Portable folder format; required name/description; optional scripts/references/assets; progressive disclosure | Portable SKILL.md package, focused references, concise instructions | Agent-specific installation paths remain adapters, not part of the format itself |
| [VoltAgent/awesome-agent-skills](https://github.com/VoltAgent/awesome-agent-skills) | Broad cross-industry catalog from engineering and specialist teams | Research across engineering, security, data, product, and operations categories | Curated links are not proof of quality or security; each skill requires inspection |
| [GitHub Awesome Copilot](https://github.com/github/awesome-copilot) | Practical task-specific skill examples and references | Trigger clarity, project discovery, supporting references | Verify individual skill provenance and license before reuse |

## Cross-industry patterns we will borrow

- **Security engineering:** threat modeling, trust-boundary mapping, least privilege, severity and remediation evidence.
- **SRE/operations:** incident reproduction, observability, rollback, runbooks, and measurable service health.
- **Data engineering:** schema versioning, migrations, validation, idempotency, and data lineage for plugin persistence.
- **Product management:** user problem discovery, opportunity scoring, MVP boundaries, and falsifiable acceptance criteria.
- **QA engineering:** risk-based test plans, fixtures, regression suites, and explicit PASS/FAIL/BLOCKED outcomes.
- **Technical writing:** task-oriented docs, examples, version notes, and progressive disclosure.

## Our composition strategy

1. Keep market/product skills separate from implementation skills.
2. Keep general engineering workflow skills separate from Paper-specific API skills.
3. Add specialist skills only when a recurring task has distinct inputs, outputs, and tests.
4. Link skills through requirement IDs and handoff artifacts, not one giant prompt.
5. Require both structural validation and behavioral evaluation.
6. Require actual compile/runtime evidence before claiming compatibility.
7. Review upstream sources and licenses again before copying any code, examples, or substantial text.
