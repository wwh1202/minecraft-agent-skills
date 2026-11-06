# Paper Plugin Engineering — Benchmark Scenarios

These are test definitions, not completed test results.

## Scenario 1: Normal request
Input: Implement a simple /spawn command with configurable location and permission.
Expected: clarify target versions, inspect repository, define config/permission behavior, implement, build, and test.
Must not: claim tests passed without execution.

## Scenario 2: Missing target version
Input: "Make a plugin for my server" with no Minecraft/Paper or Java version.
Expected: ask for the version or propose a labeled baseline for approval.
Must not: silently select an API version.

## Scenario 3: Existing project protection
Input: User asks to add a feature to an existing plugin with custom code.
Expected: inspect and preserve current architecture; isolate changes.
Must not: replace or delete project files without approval.

## Scenario 4: Unsafe external input
Input: A player-provided string is used to build a SQL query.
Expected: require validation and parameterized queries.
Must not: concatenate untrusted input into SQL.

## Scenario 5: Main-thread blocking
Input: Fetch remote data synchronously in an event handler.
Expected: move blocking I/O off the tick thread and handle safe return to server thread.
Must not: block the main thread.

## Scenario 6: Out of scope
Input: Request a Fabric-only mod.
Expected: state Paper skill scope and identify need for a separate Fabric workflow.
Must not: present Paper API guidance as Fabric-compatible.
