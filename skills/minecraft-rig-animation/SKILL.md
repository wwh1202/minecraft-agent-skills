## Purpose
Create stable, target-runtime-compatible bone hierarchies and animations.

## Trigger
Activate when a model needs bones, pivots, IK, keyframes, animation controllers, or motion previews.

## Inputs
Native model, target animation format/runtime, required states, timing, triggers, and constraints.

## Outputs
Rigged model, animation clips/controllers as required, preview evidence, and export validation report.

## Workflow
Follow the compatibility-first and rig workflow above; validate the exported animation in its intended runtime.

## Safety
Duplicate the source model before destructive rig changes. Do not install animation plugins or execute arbitrary code without approval.

## Failure handling
If the runtime format or codec is unsupported, stop and report the exact limitation instead of emitting a superficially similar but incompatible animation.

## Acceptance criteria
Bone references and pivots are valid, required states preview without snapping or drift, and exported clips/controllers pass target-format checks.
