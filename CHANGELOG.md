## 2026-09-13 — Mock Data Changes & Sided Compat
Switched up preview models, hid unused HUD elements, and added sided setup handling to mod compatibility patches.

### Parties @ 2.0.1
type: internal
bundles: LyteCore@1.1.0
- Swapped mock preview generators to use default player models instead of mobs to prevent confusion
- Hid the unused Info Stack element until the system is being used.
- Split mod compatibility setup into dedicated client and server phases.

### LyteCore @ 1.1.0
type: internal
- Added sided setup hooks to mod compatibility patches to prevent cross-side classloading issues.
