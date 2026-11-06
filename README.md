# Minecraft Agent Skills

Open-source, reusable agent skills for discovering, designing, building, testing, and releasing Minecraft Paper/Java plugins.

**Project status:** Foundation initialized. Engineering governance, starter skills, structural CI, and the validation architecture are committed. Skill behavior evaluations and a real Paper plugin pilot are still pending; no production-readiness claim is made.

## Goals

- Find plugin opportunities using evidence from real player/developer markets.
- Turn validated opportunities into traceable Paper/Java requirements and designs.
- Build plugins with explicit compatibility, security, performance, and migration standards.
- Test skills and code independently and reproducibly.
- Publish reusable skills that work across agent environments with minimal assumptions.

## Repository map

- `AGENTS.md` — repository-level contract for AI-assisted changes.
- `docs/PROJECT_CHARTER.md` — scope, principles, milestones, and governance.
- `docs/DEVELOPMENT_GUIDE.md` — end-to-end skill development method.
- `docs/ENGINEERING_GOVERNANCE.md` — requirements, risks, traceability, and phase gates.
- `docs/SKILL_SPECIFICATION.md` — required skill structure and quality rules.
- `docs/VALIDATION_ARCHITECTURE.md` — multi-layer verification and behavioral evaluation.
- `docs/MARKET_RESEARCH.md` — market research method and source register.
- `docs/TESTING.md` — validation strategy and release gates.
- `templates/requirements/` — reusable feature/change brief.
- `skills/` — reusable skill packages.
- `evals/` — behavioral evaluation plan and future challenge fixtures.
- `scripts/` — deterministic validation tools.
- `.github/workflows/` — automated repository checks.

## Initial skills

| Skill | Purpose | Status |
|---|---|---|
| `feature-planning` | Turn requests into requirements, architecture, risks, tasks, and acceptance tests | Draft |
| `market-opportunity` | Research plugin markets and score opportunities | Draft |
| `paper-plugin-engineering` | Plan and implement Paper/Java plugins | Draft |
| `plugin-qa` | Build reproducible test and release gates | Draft |

## Engineering model

The project reuses the requirement-to-release discipline from the owner's earlier [PC Radar engineering project](https://github.com/wwh1202/pc-radar-collector): requirements and acceptance criteria, architecture decisions, risk registers, implementation traceability, independent tests, scenario evaluations, and CI gates. Minecraft-specific constraints are added for Paper API compatibility, server-thread safety, lifecycle, permissions, persistence, and server runtime behavior.

Traceability chain: `REQ -> AC -> TASK -> code/change -> TEST -> result`.

## How to use

1. Open the relevant skill's `SKILL.md` in your agent environment.
2. Provide project context, target Minecraft/Paper versions, constraints, and expected output.
3. Require the agent to follow evidence, implementation, and verification steps.
4. Keep generated plugin code and test results in the target plugin repository; this repository stores reusable methods, templates, and checks.

No universal installer or agent-specific package format is claimed yet. Compatibility adapters will be added only after they are tested in their target environments.

## Quality promise

Structural CI proves package consistency, not agent effectiveness. A skill is only labeled validated after its scenario suite and real pilot pass. A plugin compatibility claim requires tests on the declared runtime matrix. See [Validation Architecture](docs/VALIDATION_ARCHITECTURE.md).

## License

MIT. See [LICENSE](LICENSE).
