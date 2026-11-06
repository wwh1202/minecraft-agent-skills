## Purpose
Prevent invalid or visually defective model files from being treated as deliverables.

## Trigger
Activate before model delivery/export or when diagnosing geometry, texture, UV, rig, animation, or runtime import defects.

## Inputs
Native project, target format/runtime version, expected outputs, and acceptance checklist.

## Outputs
Validation findings, multi-view screenshots, exported files, runtime test evidence, and known limitations.

## Workflow
Run the validation layers above in order; separate static validator findings, AI visual review, and runtime import results.

## Safety
Export to a temporary directory first. Preserve original files and request approval before replacing or deleting deliverables.

## Failure handling
If a validator is unavailable, mark that layer NOT RUN. Do not infer runtime compatibility from a successful native export.

## Acceptance criteria
All applicable validation layers have evidence, target runtime import is tested or explicitly marked blocked, and the final bundle includes source plus exports.
