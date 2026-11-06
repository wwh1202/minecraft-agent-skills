---
name: minecraft-rig-animation
description: Design bone hierarchies, pivots, rigs, keyframes, and Minecraft entity animations in Blockbench. Use for Bedrock animation controllers, GeckoLib, animated Java assets, mob motion, and cosmetic animation.
---

# Minecraft Rig and Animation

## Compatibility first
Identify target runtime and animation format before rigging: Bedrock geometry/animation, GeckoLib, Animated Java, or another codec. Do not transfer bone/animation assumptions across formats.

## Rig workflow
1. Define semantic bone hierarchy and stable names.
2. Place pivots at joints and verify local axes/orientation.
3. Parent geometry to the correct bones; avoid accidental double transforms.
4. Keep root/body/head/limb responsibilities clear.
5. Add IK only if supported and useful; bake or convert it when target runtime requires keyframes.
6. Define animation states, duration, loop behavior, transitions, and controller triggers.
7. Keyframe major motion first, then secondary motion.
8. Preview at target frame rate and inspect foot sliding, snapping, pivot drift, clipping, and asymmetry.

## Export checks
Validate bone references, animation names, keyframe channels, interpolation, Molang/controller references where relevant, and runtime-specific limits. Export and reopen the result in a clean project or target runtime when possible.

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
