## Purpose
Produce clean, editable, format-correct Minecraft geometry in Blockbench.

## Trigger
Activate when creating or modifying model geometry, groups, cubes, meshes, pivots, or model hierarchy.

## Inputs
Model brief, target format/version, reference views, scale/origin, geometry limits, and existing project path.

## Outputs
Native editable model, named hierarchy, geometry summary, multi-view screenshots, and validation report.

## Workflow
Follow the preflight and build order above. Work from silhouette to primary masses to detail, then inspect from multiple angles.

## Safety
Preserve a copy before destructive edits. Do not overwrite user assets or run arbitrary scripts without explicit approval.

## Failure handling
If the codec, coordinate system, or tool schema is unclear, stop and inspect documentation/status. If geometry IDs become stale, re-query the project rather than guessing IDs.

## Acceptance criteria
The model opens in Blockbench, hierarchy and pivots are intentional, no unexplained zero-size/duplicate elements remain, required views are reviewed, and the native file is saved.
