# Minecraft Agent Skills

Open-source, reusable agent skills for discovering, designing, building, testing, and releasing Minecraft Paper/Java plugins.

**Project status:** Foundation initialized. The repository structure and working standards are documented; the skills are currently **drafts** and must pass the documented validation before being called production-ready.

## Goals

- Find plugin opportunities using evidence from real player/developer markets.
- Turn validated opportunities into maintainable Paper/Java plugin specifications.
- Build plugins with explicit compatibility, security, performance, and data-migration standards.
- Test artifacts and workflows reproducibly instead of trusting generated code.
- Publish reusable skills that work across agent environments with minimal assumptions.

## Repository map

- `docs/PROJECT_CHARTER.md` — project scope, principles, milestones, and governance.
- `docs/DEVELOPMENT_GUIDE.md` — end-to-end method for developing a skill.
- `docs/SKILL_SPECIFICATION.md` — required skill structure and quality rules.
- `docs/TESTING.md` — validation strategy and release gates.
- `docs/MARKET_RESEARCH.md` — market research method and source register.
- `docs/CONTRIBUTING.md` — contribution workflow.
- `skills/` — reusable skill packages.

## Initial skills

| Skill | Purpose | Status |
|---|---|---|
| `market-opportunity` | Research plugin markets and score opportunities | Draft |
| `paper-plugin-engineering` | Plan and implement Paper/Java plugins | Draft |
| `plugin-qa` | Build reproducible test and release gates | Draft |

## How to use

1. Open the relevant skill's `SKILL.md` in your agent environment.
2. Provide the project context, target Minecraft/Paper versions, constraints, and expected output.
3. Require the agent to follow the skill's evidence, implementation, and verification steps.
4. Keep generated code and test results in the target plugin repository; this repository stores reusable methods, templates, and checklists.

No universal installer or agent-specific package format is claimed yet. Compatibility adapters will be added only after they are tested in their target environments.

## Quality promise

A skill is not considered validated merely because its instructions look complete. It must pass structure checks, scenario tests, tool/action checks where relevant, and a real end-to-end trial. See [Testing](docs/TESTING.md).

## License

MIT. See [LICENSE](LICENSE).
