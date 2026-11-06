## Purpose
Provide a repeatable, least-privilege connection workflow between an AI agent and the user's actual Blockbench installation.

## Trigger
Activate when the request asks to connect an AI agent to Blockbench, inspect or edit an open model through MCP, compare Blockbench MCP servers, or automate Blockbench operations.

## Inputs
Blockbench version, operating system, MCP client, installed server/plugin version, transport and endpoint configuration, target project path, and requested operations.

## Outputs
Connection report, discovered tool inventory, verified project summary, operation log, changed asset paths, and validation evidence.

## Safety
Follow the loopback, authentication, filesystem-root, eval, plugin-install, and approval rules above. Never silently broaden network or filesystem access.

## Acceptance criteria
The actual installed server is identified; its tools and schemas are discovered; read-only inspection succeeds before writes; changes are checkpointed; validation and export evidence are recorded.
