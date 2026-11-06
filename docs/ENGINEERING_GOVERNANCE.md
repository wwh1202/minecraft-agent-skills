# Engineering Governance

## Why this exists

This project adopts the proven project-engineering pattern from the owner's earlier PC Radar work: explicit requirements, architecture and risk records, implementation traceability, independent verification, and CI gates. The Minecraft-specific constraints below extend that baseline; this document is not a claim that PC Radar's domain rules apply unchanged.

Reference implementation: https://github.com/wwh1202/pc-radar-collector

## 1. Delivery lifecycle

```text
Problem discovery
  -> Market / user evidence
  -> Product brief
  -> Requirements + acceptance criteria
  -> Architecture + risk review
  -> Implementation plan
  -> Code + review
  -> Unit / integration / server tests
  -> Compatibility verification
  -> Release approval
  -> Monitoring / support / maintenance
```

A phase cannot be marked complete merely because its document exists. Each phase needs evidence appropriate to its exit criteria.

## 2. Requirement traceability

Use stable IDs:
- `REQ-###`: requirement
- `AC-###`: acceptance criterion
- `TASK-###`: implementation task
- `TEST-###`: test case
- `RISK-###`: risk
- `ADR-###`: architecture decision record

Maintain the chain:

`REQ -> AC -> TASK -> code/change -> TEST -> result`

A requirement without an acceptance criterion is not ready for implementation. A critical acceptance criterion without a test or documented verification gap blocks release.

## 3. Risk management

Every meaningful change considers:
- Paper/Minecraft/Java compatibility;
- server tick performance and async safety;
- permissions and trust boundaries;
- persistence, backups, and migration;
- dependency and API stability;
- failure recovery and plugin lifecycle;
- maintenance/support cost.

Rate likelihood and impact (1–5), record mitigation, owner, and residual risk. Do not hide high-impact risks inside a generic checklist.

## 4. Change discipline

- Inspect before editing; do not rebuild a feature that already exists.
- Keep changes small and reviewable.
- Avoid unrelated refactors.
- Add regression tests for fixed defects.
- Document config and storage migrations.
- Update docs and changelog when behavior or contracts change.
- Keep test evidence independent from implementation claims.

## 5. Verification status vocabulary

- `NOT_RUN`: defined but not executed.
- `PASS`: executed and observed to meet criteria.
- `FAIL`: executed and did not meet criteria.
- `BLOCKED`: could not execute because an environment, tool, permission, or dependency was unavailable.
- `WAIVED`: explicitly accepted residual risk with approver and reason recorded.

Never convert BLOCKED or NOT_RUN into PASS.

## 6. Phase gates

| Gate | Required evidence | Exit |
|---|---|---|
| G0 Discovery | target user, problem, source evidence | problem is bounded |
| G1 Requirements | REQ/AC, scope, non-goals | testable baseline approved |
| G2 Design | architecture, ADRs, risk register | feasible and risks understood |
| G3 Implementation | code, review, build | change is reviewable |
| G4 Verification | tests, compatibility, security/performance checks | critical tests pass |
| G5 Release | release notes, artifact, rollback/support plan | explicit release approval |
| G6 Maintenance | issue triage, compatibility watch, deprecation plan | support remains sustainable |

## 7. Public repository hygiene

Only generic methods, synthetic fixtures, and intentionally public examples belong here. Never copy private configs, server addresses, tokens, player data, paid assets, or third-party source without a compatible license.
