---
name: paper-performance
description: Find and reduce Paper server tick-time and plugin performance problems using profiling, workload isolation, and measurable before/after evidence.
---

# Paper Performance

## Status

Draft. The workflow is defined but must pass its behavioral scenarios before being labeled validated.

## Purpose

Prevent lag caused by blocking I/O, expensive event handlers, excessive entity work, unbounded tasks, or inefficient data access.

## Trigger

Use when a plugin causes TPS/MSPT degradation, spikes, memory growth, slow commands, or scaling issues with players/worlds.

## Inputs

Observed symptom; Paper build; Java runtime; plugin list and versions; workload/player count; timings or profiler data; reproduction environment.

## Outputs

Performance baseline; ranked hotspots; low-risk optimization plan; measured before/after results; trade-offs and regression checks.

## Workflow

1. Establish a reproducible workload and baseline MSPT/TPS, CPU, memory, and relevant operation latency.
2. Collect profiler evidence (for example spark) before changing code.
3. Attribute cost to a plugin, method, event frequency, task, database query, or allocation pattern.
4. Inspect main-thread blocking, synchronous disk/network/database calls, large loops, entity scans, and repeated serialization.
5. Prioritize by measured cost and frequency, not intuition.
6. Propose the smallest optimization that preserves semantics.
7. Keep Bukkit/Paper world and entity access on the correct scheduler/thread; offload safe I/O and computation only.
8. Re-profile under the same workload and compare equivalent metrics.
9. Test correctness, concurrency, shutdown, and cancellation after optimization.
10. Document residual cost and the tested scale.

## Safety

Never promise a fixed TPS improvement without measurements. Do not move Bukkit API calls to async threads indiscriminately. Do not run load tests on production without explicit approval. Protect player data and server identifiers in profiling artifacts.

## Failure handling

If profiling tools are unavailable, mark diagnosis as provisional and use bounded instrumentation. If workload differs between runs, do not present the comparison as a controlled result.

## Acceptance criteria

Hotspot is supported by profiling evidence; before/after workload is comparable; correctness and thread safety are rechecked; measured results and limitations are recorded.
