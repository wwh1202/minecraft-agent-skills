# Repository Split Notice

The original combined repository is being separated into two independently maintained projects:

- [Minecraft Plugin Engineering Skills](https://github.com/wwh1202/minecraft-plugin-engineering-skills) — Paper/Java plugin product engineering, gameplay systems, implementation, testing, performance, security, and release.
- [Minecraft Game Asset Skills](https://github.com/wwh1202/minecraft-game-asset-skills) — art direction, fashion, weapons, bosses, mobs, Blockbench, textures, rigging, animation, export, and visual QA.

This repository is retained as the historical source during migration. Existing files are not deleted as part of the split. Skills are being transferred and reviewed by domain; do not assume that a new repository contains every historical skill until its migration checklist is complete.

## Migration rules

1. Preserve original skill intent and useful tests; rewrite only where needed for clearer boundaries or quality.
2. Do not copy third-party material unless its license permits it.
3. Keep gameplay behavior in the plugin repository and visual production in the asset repository.
4. Link both repositories through a documented asset handoff contract.
5. Verify the destination tree and CI before marking a skill as migrated.
