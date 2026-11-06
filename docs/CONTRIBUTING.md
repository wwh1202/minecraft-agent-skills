# Contributing

## Before opening a pull request

- Read the project charter and skill specification.
- Explain the recurring problem the change solves.
- Add or update at least one scenario test for behavior changes.
- Cite sources for market claims and record access dates.
- Use synthetic data in examples and tests.
- Do not include credentials, private server configs, player data, or copyrighted assets without permission.

## Pull request checklist

- [ ] Scope is focused and consistent with the charter.
- [ ] Skill contract and instructions are complete.
- [ ] Safety and failure behavior are documented.
- [ ] Tests or examples demonstrate the change.
- [ ] Links and references are checked.
- [ ] Status labels are accurate (draft / validated / released).
- [ ] Changelog is updated when behavior changes.

## Commit style

Use concise conventional-style messages, for example:
- `docs: define skill development workflow`
- `feat: add paper plugin QA skill`
- `test: add market research scenarios`
- `fix: clarify compatibility stop conditions`

## Versioning

Use semantic versioning for released skill packages. A breaking change to required inputs, output contract, or workflow semantics is a major change.
