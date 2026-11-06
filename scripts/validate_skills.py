#!/usr/bin/env python3
"""Dependency-free structural validator for repository skill packages."""
from pathlib import Path
import re
import sys

ROOT = Path(__file__).resolve().parents[1]
REQUIRED_HEADINGS = {
    "Purpose": r"Purpose",
    "Trigger": r"Trigger",
    "Inputs": r"(?:Required )?Inputs",
    "Outputs": r"Outputs",
    "Workflow": r"Workflow",
    "Safety": r"Safety(?: and [\w -]+)?",
    "Failure handling": r"Failure handling",
    "Acceptance criteria": r"Acceptance criteria",
}
errors = []
skill_files = sorted((ROOT / "skills").glob("*/SKILL.md"))

if not skill_files:
    errors.append("No skills/*/SKILL.md files found.")

for path in skill_files:
    rel = path.relative_to(ROOT)
    text = path.read_text(encoding="utf-8")
    match = re.match(r"^---\s*\n(.*?)\n---\s*\n", text, re.S)
    if not match:
        errors.append(f"{rel}: missing YAML frontmatter.")
        continue
    frontmatter = match.group(1)
    name = re.search(r"^name:\s*([a-z0-9-]+)\s*$", frontmatter, re.M)
    desc = re.search(r"^description:\s*(.+)$", frontmatter, re.M)
    if not name:
        errors.append(f"{rel}: missing or invalid name.")
    elif name.group(1) != path.parent.name:
        errors.append(f"{rel}: name '{name.group(1)}' must match directory '{path.parent.name}'.")
    if not desc or len(desc.group(1).strip()) < 20:
        errors.append(f"{rel}: description must be present and meaningful.")
    for label, pattern in REQUIRED_HEADINGS.items():
        if not re.search(rf"^##\s+{pattern}\s*$", text, re.M | re.I):
            errors.append(f"{rel}: missing required section '{label}'.")
    if re.search(r"\b(TODO|TBD|FIXME)\b", text):
        errors.append(f"{rel}: unresolved TODO/TBD/FIXME marker.")
    for target in re.findall(r"\[[^\]]+\]\(([^)]+)\)", text):
        if target.startswith(("http://", "https://", "mailto:", "#")):
            continue
        resolved = (path.parent / target.split("#", 1)[0]).resolve()
        if not resolved.exists():
            errors.append(f"{rel}: broken relative link '{target}'.")

if errors:
    print("SKILL VALIDATION: FAIL")
    for error in errors:
        print(f"- {error}")
    sys.exit(1)

print(f"SKILL VALIDATION: PASS ({len(skill_files)} skill packages)")
