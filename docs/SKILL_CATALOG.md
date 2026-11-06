# Skill Catalog

The repository is organized as a composable plugin-development workflow. Status is Draft unless a validation report explicitly says otherwise.

## Product and discovery

| Skill | Responsibility | Handoff |
|---|---|---|
| `market-opportunity` | Competitor, demand, gap, pricing, and solo-maintainer opportunity research | Opportunity brief |
| `brainstorming-spec` | Clarify user problem and choose a solution direction | Approved feature brief |
| `feature-planning` | Requirements, acceptance criteria, architecture, risks, tasks | Traceable implementation baseline |

## Engineering workflow

| Skill | Responsibility | Handoff |
|---|---|---|
| `implementation-planning` | Dependency-aware task breakdown | Executable task plan |
| `paper-api-research` | Authoritative API and version research | API decision note |
| `paper-plugin-engineering` | Plugin architecture and implementation | Code change + build evidence |
| `test-driven-development` | Red/green/refactor and regression tests | Test evidence |
| `systematic-debugging` | Root-cause diagnosis and repair | Defect report + regression test |
| `paper-performance` | Profiling and performance optimization | Before/after profile report |
| `version-compatibility` | Paper/Minecraft/Java/dependency matrix | Compatibility report |
| `security-review` | Threat model and security findings | Findings + remediation |
| `plugin-qa` | Risk-based quality and release verification | QA report |

## Skill and release operations

| Skill | Responsibility | Handoff |
|---|---|---|
| `skill-authoring` | Create and evaluate new reusable skills | Skill package + eval report |
| `release-maintenance` | Package, publish, support, deprecate | Release record + runbook |

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
  -> plugin-qa
  -> release-maintenance
```

Not every change needs every specialist. Select only the skills relevant to the change, but never skip critical safety, compatibility, or runtime checks.
