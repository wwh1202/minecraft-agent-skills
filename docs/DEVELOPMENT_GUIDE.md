# Skill Development Guide

This guide defines how a market observation becomes a tested, reusable agent skill.

## Workflow overview

1. Discover a recurring job or failure.
2. Research the ecosystem and collect evidence.
3. Define the skill's user, trigger, inputs, outputs, and boundaries.
4. Write the smallest useful workflow.
5. Add examples, checklists, templates, and tool contracts.
6. Validate structure and safety.
7. Run benchmark scenarios and a real pilot.
8. Record limitations, version, and maintenance owner.
9. Publish and review feedback.

## 1. Discover the problem

Describe the job in user language:
- Who needs the work done?
- What event triggers it?
- What inputs are available?
- What does a useful finished result look like?
- What makes the current process slow, expensive, or error-prone?
- How often does the task recur?

Reject vague goals such as "make AI better at plugins." Prefer bounded goals such as "evaluate a Paper plugin idea against comparable resources and produce a source-backed opportunity score."

## 2. Research before designing

Use primary sources wherever possible: official platform listings, documentation, release notes, issue trackers, source repositories, and developer documentation. Community discussions can reveal pain points but are anecdotal.

For every evidence item record:
- URL and platform
- date accessed and publication/update date if available
- observation or quoted metric
- sample window and collection method
- whether the item is a fact, claim, estimate, or hypothesis
- known bias, missing data, and confidence

Do not infer sales from downloads, active users from stars, or demand from a handful of comments.

## 3. Define the skill contract

Before writing instructions, define:
- **Name:** short, stable, action-oriented.
- **Trigger:** when an agent should use it.
- **Inputs:** required and optional context.
- **Outputs:** exact artifacts and format.
- **Workflow:** ordered steps and decision points.
- **Tools:** optional tools, prerequisites, permissions, and fallback.
- **Safety:** prohibited actions and untrusted input handling.
- **Acceptance criteria:** observable conditions for success.
- **Failure behavior:** what to do when evidence or access is missing.

If a skill requires credentials, paid APIs, destructive actions, or external publication, it must stop and request explicit user authorization.

## 4. Write instructions that execute

- Use imperative, concrete steps.
- Explain what to do when a required input is missing.
- Include at least one good example and one failure/edge case.
- Separate required behavior from optional enhancements.
- Avoid tool names that are not available in the target environment.
- Never claim a tool action succeeded until its result confirms success.
- Keep large references in nearby files and link to them from SKILL.md.
- Keep the main skill entry concise enough to follow in one pass.

## 5. Engineer supporting assets

Add only assets that materially improve repeatability:
- templates for market evidence and product briefs
- compatibility matrices
- test fixtures and expected outputs
- scripts for deterministic checks
- sample configuration with fake data
- release and migration checklists

Scripts must document runtime requirements, inputs, outputs, and failure codes. Never include real tokens, server addresses, player identifiers, or private configuration.

## 6. Validate in layers

### Layer A — Structure
Required files exist, metadata is valid, links resolve, no placeholders or contradictory instructions remain.

### Layer B — Instruction quality
A reviewer can identify triggers, inputs, steps, outputs, boundaries, and success criteria without guessing.

### Layer C — Scenario tests
Run fixed prompts covering normal, incomplete, conflicting, adversarial, and out-of-scope requests. Compare outputs against a rubric.

### Layer D — Tool/action tests
Where tools are used, test permission denial, unavailable tools, rate limits, malformed responses, and confirmation behavior. Use mocks for destructive operations.

### Layer E — Real-world pilot
Apply the skill to a small, bounded task. Preserve logs, build output, test results, and limitations.

## 7. Release and maintain

- Use semantic versioning for the skill package.
- Record behavior changes in CHANGELOG.
- Re-run affected tests after every instruction or asset change.
- Review market-source links and platform policy notes periodically.
- Deprecate stale workflows rather than silently leaving misleading instructions.
- Publish a test report with each release.

## Definition of done

A skill is done only when:
- its contract is explicit;
- instructions and supporting assets are complete;
- automated structure checks pass;
- scenario tests meet the documented threshold;
- limitations are documented;
- a maintainer can reproduce the validation.
