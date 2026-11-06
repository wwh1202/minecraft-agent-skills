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
