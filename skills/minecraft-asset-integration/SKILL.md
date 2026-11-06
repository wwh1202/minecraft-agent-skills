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
