## 2026-09-25 — Spells & Positions

### Parties Version 2.1.0 -> 2.2.0

Adds cast bar tracking for Iron's Spells and resolves a dedicated server crash.

- Added party cast bar support for Iron's Spells 'n Spellbooks.
- Fixed a dedicated server crash when loading the Mana module.
- Corrected default menu button position offsets.


Editor Layout Version: **1** _(No Changes)_

---

## 2026-09-23 — Colors, Bar Editor & Foundational Overhaul

### Parties Version 2.0.0 -> 2.1.0

Refactored internal libraries and removed other mod dependencies. Introduced a modular color picker and bar editor, and fixed several crashes and sided desyncs. Due to internal changes (like not needing two external addon/library mods to be bundled anymore), version 2.0.0 is archived. The Parties mod will now be self-contained.

*   Added a full color picker for text and custom bar styling, utilizing less bits in the layout export overall.
*   Made player head rendering and distance tracking update more responsively in party frames and the screen.
*   Fixed startup and attribute calculation crashes occurring during player initialization.
*   Fixed incorrect over-heal display values on party member health bars.
*   Optimized tracking arrow rendering and updated the arrow icon.
*   Disabled unused info stack element.
*   Added new party tracker configurations for arrow display & head/distance rendering types.
*   Added tooltip to player heads on screen map on hover.
*   Added a `updateJSONURL` entry to the `mods.toml` to notify of future updates and recommended versions.

### **Editor Layout Version 0 -> 1:**

Deprecated v0 layout serialization in favor of v1 traits, breaking v0 data formats. Starting with v1 (this version), layouts will automatically update to the latest layout version. (backwards compatibility support).  
Updated Text Color & Bar trait representations with a new editor, which affected the following:

*   Avatar
*   Experience
*   Health
*   Hunger
*   Armor
*   Toughness
*   Effects
*   Mana _(Iron's Spells)_
