---
name: minecraft-asset-integration
description: Integrate Blockbench models, textures, and animations into Minecraft Java resource packs, Bedrock packs, GeckoLib, ItemsAdder, Oraxen, or other explicitly selected runtimes. Use when an exported model must work in a real game/server/mod/plugin.
---

# Minecraft Asset Integration

## Identify target
Ask/derive the exact target: Java block/item model, vanilla resource pack, Bedrock entity, GeckoLib mod, ItemsAdder, Oraxen, ModelEngine, or another named plugin/mod. Record game version, loader, dependency versions, and asset folder conventions.

## Integration workflow
1. Read the target runtime's current official documentation and installed version; do not rely on old examples.
2. Map Blockbench project format and export codec to the target runtime.
3. Generate required JSON/configuration/model/texture/animation files using documented schemas.
4. Validate namespaces, identifiers, paths, case sensitivity, references, atlas/texture dimensions, and pack metadata.
5. Keep generated assets isolated from user production packs until validated.
6. Install to a disposable local test instance or staging server.
7. Verify load logs, in-game appearance, animation triggers, resource-pack delivery, and reload behavior.
8. Package a migration/rollback note and list dependencies.

## Safety and compatibility
Never edit a live production resource pack or server without explicit approval and backup. Never assume ItemsAdder, Oraxen, ModelEngine, GeckoLib, Bedrock, and vanilla formats are interchangeable. Record exact tested versions.

## Purpose
Deliver model assets that load in the explicitly requested Minecraft runtime, not just files that export successfully.

## Trigger
Activate when placing or configuring model assets in a resource pack, Bedrock pack, mod, or server plugin ecosystem.

## Inputs
Exported model/textures/animations, game version, loader/runtime, plugin/mod version, namespace, pack layout, and test environment.

## Outputs
Integrated asset bundle, configuration/metadata, version matrix, load-test logs, in-game screenshots, and rollback instructions.

## Failure handling
On load errors, isolate the failing layer (codec, path, metadata, dependency, texture, geometry, animation). Do not make unrelated format conversions as a guess; reproduce on a disposable instance first.

## Acceptance criteria
Assets load in the declared runtime/version, logs show no relevant missing-resource errors, in-game appearance/behavior is checked, and package/rollback steps are reproducible.
