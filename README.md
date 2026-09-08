<p align="center">
  <img src="/img/main_logo.png" alt="Project Banner" width="100%" />
</p>

![Downloads](https://img.shields.io/curseforge/dt/358243?logo=curseforge&logoColor=white&color=f16436)
![CurseForge Version](https://img.shields.io/curseforge/v/358243?logo=curseforge&logoColor=white&color=f16436)
![Minecraft Version](https://img.shields.io/badge/Minecraft-1.20.1-brightgreen?style=flat)
![Loader](https://img.shields.io/badge/Loader-Forge-orange?style=flat&color=f16436)
![Environment](https://img.shields.io/badge/Side-Client%20%26%20Server-blue?style=flat)

[![GitHub Issues](https://img.shields.io/badge/Github-Issues-238636?logo=github&logoColor=white)](https://github.com/JaydenLyte/Parties/issues)
![License](https://img.shields.io/badge/License-All%20Rights%20Reserved-red)

---

NOTE: Since v2.0.0, this mod bundles the LyteCore library and Parties: Dynamics. 

The Parties mod introduces a party system built to integrate smoothly with other mods for a unified solo or multiplayer 
RPG experience. It updates vanilla and modded mechanics to improve group dynamics, includes a highly customizable Team 
UI, and is built with a minimal footprint to keep your game smooth. Nearly everything added can be tweaked or turned 
off completely, all detailed below.

---

<p align="center">
  <img src="/img/title_features.png" alt="Features" width="100%" />
</p>

Parties adds a fully customizable, ever-expanding UI system that allows you to customize how you want your party UI to look like.
Parties: Dynamics is bundled with this mod as well, which adds or enhances social mechanics/interactions for a better experience.

<table style="border: none; border-collapse: collapse; width: 100%;">
  <tr style="border: none;">
    <td style="border: none; vertical-align: top; width: 45%; padding-right: 16px;">
      <img src="./img/feature_ui.gif" alt="HUD Preview" width="100%" />
    </td>
    <td style="border: none; vertical-align: top; width: 55%;">
      <h3>Extensive HUD Overlay</h3>
      <p>Renders player & party member health bars, status effects, and more in the form of 'elements'.</p>
      <p>Every single element can be hovered for tooltip information, and configured to your heart's desire.</p>
      <p>There are currently 11 different elements with more in the works as more mod support gets added.</p>
    </td>
  </tr>
</table>

<table style="border: none; border-collapse: collapse; width: 100%;" width="100%">
  <tr style="border: none;">
    <td style="border: none; vertical-align: top; width: 55%;" width="55%" valign="top">
      <h3>In-Depth Element Customization</h3>
      <p>
        Each element has a myriad of customization options allowing you to create unique and meaningful designs.
        They can also be disabled if preferring a more minimalist look or emphasis on specific elements.
      </p>
      <p>
        <img src="./img/feature_minimal.png" alt="Minimal Preview" width="128" align="left" hspace="12" style="margin-right: 12px;" />
        The customized layout can be exported as a file or a string of characters to share with others!
      </p>
    </td>
    <td style="border: none; vertical-align: top; width: 45%; padding-left: 16px;" width="45%" valign="top">
      <img src="./img/feature_editor.gif" alt="HUD Preview" width="100%" />
    </td>
  </tr>
</table>

<table style="border: none; border-collapse: collapse; width: 100%;">
  <tr style="border: none;">
    <td style="border: none; vertical-align: top; width: 45%; padding-right: 16px;">
      <img src="./img/feature_layout.gif" alt="HUD Preview" width="100%" />
    </td>
    <td style="border: none; vertical-align: top; width: 55%;">
      <h3>Full-Fledged Display Configuration</h3>
      <p>Modify the look of the player and party frame in the display editor, with support for other types of frames as well.
The layouts previously saved in the layout editor (displayed above) can be attached to a frame in this menu.</p>
      <p>These layouts persist across launches, allowing you to ship the mod with completely customized layouts for any theme and purpose!</p>
    </td>
  </tr>
</table>

### Extensive Party Mechanics & Features with Parties: Dynamics
Parties: Dynamics is a bundled add-on focused on non-UI party infrastructure mechanics. It currently features:
- **XP Sharing** - Proximity-based (configurable) xp splitting mechanics. Obtained experience is shared evenly across party members, according to configuration.
- **Friendly-fire Protection** - Extended definitions on what a "teammate" is, to prevent unwanted friendly-fire. Now covers pets, summons, and leashed mobs. Also extended protection to cover unwanted potion effect applications and more!
- **[Iron's Spellbooks] Hostile Spell tag** - A new data tag that allows you to define targeted spells from Iron's Spellbooks. If friendly-fire is disabled, these spells will no longer target allies.
- More features to come! See below.
---

<p align="center">
  <img src="img/title_commands.png" alt="Commands & Setup" width="100%" />
</p>

### Commands

The following commands are available from the mod:
<details>
<table>
  <thead>
    <tr>
      <th>Command</th>
      <th>Description</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td><code>/parties invite</code></td>
      <td></td>
    </tr>
    <tr>
      <td><code>/parties accept</code></td>
      <td>Accepts a party invite from a player. If receiving an invitation, you can also click on the respective chat link.</td>
    </tr>
    <tr>
      <td><code>/parties decline</code></td>
      <td>Declines the last party invite from a player. Clicking on the respective chat link also allows you to decline a specific invitation as well.</td>
    </tr>
    <tr>
      <td><code>/parties disband</code></td>
      <td>Disbands the party you're currently in. Can only be done by the party leader.</td>
    </tr>
    <tr>
      <td><code>/parties kick</code></td>
      <td>Removes a player from your current party. If no other players were to remain, it disbands the party instead. Can only be done by the party leader.</td>
    </tr>
    <tr>
      <td><code>/parties leave</code></td>
      <td>Leaves your current party. If leader, it passes leadership to someone else. If party would be left with one player, the party disbands instead.</td>
    </tr>
    <tr>
      <td><code>/parties promote</code></td>
      <td>Transfers leadership to another player. Note that if the leader is offline, leadership may automatically be transferred depending on settings in `parties-common.toml`</td>
    </tr>
    <tr>
      <td><code>/parties help</code></td>
      <td>Provides a little bit of info as to how party works. Will be overhauled soon.</td>
    </tr>
    <tr>
      <td><code>/partiescfg reload</code></td>
      <td>Reloads client side configuration, like from <code>/dimensions/active.json</code></td>
    </tr>
  </tbody>
</table>
Note that the <code>/parties</code> prefix also has the following as options: <code>/p, /party</code>
</details>



### Setup
Parties comes bundled with its core library (LyteCore) along with its core addon (Parties: Dynamics), meaning that setup is as simple as downloading the mod and adding it to your game!
All the configuration options are housed within the `minecraft_root/config/parties` directory. A brief description of each file/directory is shown below:

<details>
<table>
  <thead>
    <tr>
      <th>Directory/File Name, all within <code>minecraft_root/config/parties/</code></th>
      <th>Description</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td><code>parties-common.toml</code></td>
      <td>Contains simple party configuration options, including max party size, automatic leader transfer timers, and an option to use a different party system for the UI (although only supports the Parties mod for now).</td>
    </tr>
    <tr>
      <td><code>parties-client.toml</code></td>
      <td>Contains several client-side rendering options, ranging from radar arrow modifications, UI rendering options, player colorizing, and the HUD Editor button position.</td>
    </tr>
    <tr>
      <td><code>parties_dynamics-common.toml</code></td>
      <td>Contains an option to enable friendlyFire, along with configuring the XP Sharing distance.</td>
    </tr>
    <tr>
      <td><code>lytecore-common.toml</code></td>
      <td>Provides the core Team alliance providers and ownership/damage resolvers. Also dictates the range that "vicinity" means.</td>
    </tr>
    <tr>
      <td><code>/dimensions/active.json</code> &amp; <code>/dimensions/known_cache.json</code></td>
      <td>Contains the active list that the UI pulls dimension data from, along with the known cache dump of dimensions found in the game.</td>
    </tr>
    <tr>
      <td><code>/layouts/</code></td>
      <td>The root directory of custom layout files. These files allow you to create your own unique, sharable party layouts.</td>
    </tr>
    <tr>
      <td><code>active_layouts.json</code></td>
      <td>This file contains the active frame positioning and layout attachment for the current game.</td>
    </tr>
    <tr>
      <td><code>mixins.properties</code></td>
      <td>This file contains options for disabling specific code alterations. The functionality of the Parties mod depends on these changes, so only modify this as a last resort.</td>
    </tr>
    <tr>
      <td><code>modules.properties</code></td>
      <td>This file contains a list of "addon modules" that are used in the Parties mod. This allows you to toggle any specific mod compatibility currently made for the Parties mod.</td>
    </tr>
  </tbody>
</table>
</details>

---

<p align="center">
  <img src="/img/title_config.png" alt="Configuration Banner" width="100%" />
</p>

Parties has a ton of customization options, ranging from an extensive layout editor to complete control on what features you would like enabled.

<table style="border: none; border-collapse: collapse; width: 100%;">
  <tr style="border: none;">
    <td style="border: none; vertical-align: top; width: 70%; padding-right: 16px;">
      <img src="./img/config_numbered.png" alt="HUD Preview" width="100%" />
    </td>
    <td style="border: none; vertical-align: top; width: 55%;">
      <h3>Layout Editor</h3>
      <p>The Layout Editor is the place where you're able to customize the party UI to your liking. Each layout can be saved to a file, exported as a string for sharing, and applied to different frames in the HUD editor.</p>
      <p>You can open the layout editor directly through an optional keybind, or through the HUD screen that brings up the mouse (default <code>Left Alt</code>).</p>
      <p>The left image shows the Layout Editor, with areas of interest numbered from 1 through 9. They are explained below.</p>
    </td>
  </tr>
</table>

### Layout Editor Components
<details>
<table width="100%">
  <tbody>
    <!-- Row 1 -->
    <tr>
      <td align="center" valign="middle" width="10%"><h2>1</h2></td>
      <td align="center" valign="middle" width="30%">
        <img src="./img/layout_1.png" alt="Layout 1" width="250" />
      </td>
      <td align="left" valign="middle" width="60%">
        <h3>Editor File Menu</h3>
        <p>This menu allows you to <span style="color: #01a1a1;">load</span> or <span style="color: #218921;">save</span> your current edited preset to a new file, or to the clipboard. From left to right, each button does the following:</p>
        <ul>
          <li><span style="color: #01a1a1;"><strong>Load From File:</strong></span> Loads a previously saved layout from your local directory into the editor. The directory is located in <code>minecraft_root/config/parties/layouts/</code>.</li>
          <li><span style="color: #01a1a1;"><strong>Import from Clipboard:</strong></span> Attempts to create a layout from your system's clipboard, allows you to save it, and then loads it into the active workspace.</li>
          <li><span style="color: #218921;"><strong>Save (Overwrite):</strong></span> Saves the layout back to the active file, replacing the old data.</li>
          <li><span style="color: #218921;"><strong>Save to File:</strong></span> Saves the layout to a completely new file on your drive in the same directory shown above.</li>
          <li><span style="color: #218921;"><strong>Export to Clipboard:</strong></span> Compiles the current layout into a data string and copies it to your clipboard for rapid sharing.</li>
        </ul>
        <p>The menu can also be clicked on to minimize the buttons and reduce footprint, as shown below:</p>
        <img src="./img/layout_1-1.png" alt="Layout 1" width="150" />
      </td>
    </tr>
    <!-- Row 2 -->
    <tr>
      <td align="center" valign="middle" width="10%"><h2>2</h2></td>
      <td align="center" valign="middle" width="30%">
        <img src="./img/layout_2.png" alt="Layout 2" width="350" />
      </td>
      <td align="left" valign="middle" width="60%">
        <h3>Party UI Display</h3>
        <p>This UI display shows how the entire UI configuration would look like when applied to a frame.</p>
        <p>The entire view area the display resides in can be dragged to move the UI display around. Scrolling the wheel also changes the scale, although this type of scale change is only for viewing purposes.</p>
        <p>Selecting the Frame Layout in the element list displays two preview copies to help fine-tune padding and alignment for group layouts like the Party Frame.</p>
      </td>
    </tr>
    <!-- Row 3 -->
    <tr>
      <td align="center" valign="middle" width="10%"><h2>3</h2></td>
      <td align="center" valign="middle" width="30%">
        <img src="./img/layout_3.png" alt="Layout 3" width="250" />
      </td>
      <td align="left" valign="middle" width="60%">
       <h3>Stage View Settings</h3>
        <p>These buttons don't apply changes to the layout, but rather allow you to change how the staging view displays the layout.</p>
         <p>From left to right, each button does the following:</p>
        <ul>
          <li><span style="color: #01a1a1;"><strong>Toggle Grid:</strong></span> Toggles the visibility of the grid layout markers. The grid is 8x8 pixels while the thicker grid is 32x32 pixels.</li>
          <li><span style="color: #01a1a1;"><strong>Lock Stage View:</strong></span> Toggles the ability to drag the UI Display around, in case you want to prevent accidental movement.</li>
          <li><span style="color: #01a1a1;"><strong>Center Stage View:</strong></span> Re-centers and scales the UI preset to fit the provided Stage View space.</li>
          <li><span style="color: #01a1a1;"><strong>Toggle Animations:</strong></span> Toggles UI animations. When selecting an element from the Element List, animations play for that specific element (or all, depending on the button below). This allows you to see how the animations look like in action.</li>
          <li><span style="color: #01a1a1;"><strong>Toggle Single Animations:</strong></span> Toggles single UI animations - determines whether to only play the animations for the selected element or for everything.</li>
        </ul>
      </td>
    </tr>
    <!-- Row 4 -->
    <tr>
      <td align="center" valign="middle" width="10%"><h2>4</h2></td>
      <td align="center" valign="middle" width="30%">
        <img src="./img/layout_4.png" alt="Layout 4" width="250" />
      </td>
     <td align="left" valign="middle" width="60%">
  <h3>Element List</h3>
  <p>The element list allows you to select what specific element of the party UI to modify. It also includes the Layout Settings of the frame.</p>
   <p>From top to bottom, the displayed elements are as follows:</p>
  <ul>
    <li><span style="color: #eff2cb;"><strong>Layout:</strong></span> The layout element controls the padding and size of the entire layout, per entity.</li>
    <li><span style="color: #c9e1f5;"><strong>Background:</strong></span> The background element allows you to adjust the transparent glass-like backdrop of the UI.</li>
    <li><span style="color: #f5dd00;"><strong>Leader:</strong></span> The leader element allows you to modify the leader icon that appears for a party leader.</li>
    <li><span style="color: #f6d8bd;"><strong>Avatar:</strong></span> The avatar element controls the head (or paper doll) and the name of the entity in the UI. It allows you to adjust the head into several modes, including a compass, simple head, and a paper doll.</li>
    <li><span style="color: #c999df;"><strong>Dimension:</strong></span> The dimension element controls the dimension icon as well as the animation that plays when you change dimensions.</li>
    <li><span style="color: #7af320;"><strong>Experience:</strong></span> The experience element allows you to adjust how the vanilla-styled experience bar is displayed.</li>
    <li><span style="color: #f70000;"><strong>Health:</strong></span> The health element, an "overflowing bar" type element, allows you to adjust the display of the health along with absorption. You can also toggle between a bar, a flat bar, a single icon, or an icon array (like vanilla's Health display).</li>
    <li><span style="color: #c9651d;"><strong>Hunger:</strong></span> The hunger element, also the same type as health, has similar options to choose from but defaults to a simple icon display.</li>
    <li><span style="color: #dde2f5;"><strong>Armor:</strong></span> The armor element allows you to modify the armor display in the UI. Note that hovering over the icon also shows the toughness level.</li>
    <li><span style="color: #6cf5ec;"><strong>Toughness:</strong></span> The toughness element allows you to modify the toughness display in a similar manner to Armor, except that hides itself when it is zero.</li>
    <li><span style="color: #d7bcf5;"><strong>Effects:</strong></span> The effects element allows you to configure a ton of different style options for how mob effects are rendered on players.</li>
  </ul>
   <p>More elements are definitely coming in the future, with some already implemented! Details below.</p>
   <p>The Element list also has a couple of buttons and displays with some functionality/information, detailed below</p>
  <ul>
    <li><span style="color: #aa906e;"><strong>Element List Expand Button (top-left):</strong></span> It expands and contracts the element list to show names or just icons.</li>
    <li><span style="color: #aa906e;"><strong>Element Configuration Texture Toggle (bottom-left):</strong></span> Toggles the display of textures on the interface, with it reverting to a transparent look if disabled.</li>
    <li><span style="color: #aa906e;"><strong>Move List Up/Down Buttons (top-right/bottom-right):</strong></span> When the element list overflows, these buttons allow you to go up and down the list. You are also able to use mouse scrolling (or the scrollbar that appears).</li>
    <li><span style="color: #656565;"><strong>Version number (bottom-left):</strong></span> Shows the current version number of the layout editor. Different version numbers have different compatibilities with each other.</li> 
</ul>
</td>
    </tr>
    <!-- Row 5 -->
    <tr>
      <td align="center" valign="middle" width="10%"><h2>5</h2></td>
      <td align="center" valign="middle" width="30%">
        <img src="./img/layout_5.png" alt="Layout 5" width="250" />
      </td>
      <td align="left" valign="middle" width="60%">
        <h3>Element Settings</h3>
        <p>This panel allows you to configure different settings for the selected element. If the number of options exceeds the physical space, a scroll bar appears allowing you to drag it or use the mouse wheel.</p>
        <p>The footer consists of a series of three buttons that allow you to <span style="color: #aa5151;">reset the layout to default values, </span><span style="color: #01a1a1;">revert the layout to last saved state,</span> and <span style="color: #aa906e;">undo/redo changes</span>. From left to right, the buttons are as follows:</p>
         <ul>
<li><span style="color: #aa5151;"><strong>Reset All:</strong></span> Resets all elements to the default values.</li>
    <li><span style="color: #aa5151;"><strong>Reset Selected:</strong></span> Resets the selected element to its default values.</li>
    <li><span style="color: #01a1a1;"><strong>Revert All:</strong></span> Reverts all elements to the last saved state.</li>
    <li><span style="color: #01a1a1;"><strong>Revert Selected:</strong></span> Reverts the selected element to the last saved state.</li>
    <li><span style="color: #aa906e;"><strong>Undo:</strong></span> Undoes the last modified value. The tooltip indicates what it will change.</li>
    <li><span style="color: #aa906e;"><strong>Redo:</strong></span> Redoes the previously undone item. The tooltip indicates what it will change.</li> 
</ul>      
</td>
    </tr>
  </tbody>
</table>
</details>

---
<table style="border: none; border-collapse: collapse; width: 100%;">
  <tr style="border: none;">
    <td style="border: none; vertical-align: top; width: 70%; padding-right: 16px;">
      <img src="./img/hud_editor.png" alt="HUD Editor Preview" width="100%" />
    </td>
    <td style="border: none; vertical-align: top; width: 55%;">
      <h3>HUD Editor</h3>
      <p>You can access the HUD editor with the default keybind <code>Left Alt</code>, which brings up a singular brown button with a flag, that then opens up this editor with the menu as shown in component #2 below.</p>
<p>The brown button can be dragged with right click across the screen for better accessibility in case it's covering a UI component.</p>
<p>The left image shows areas of interest labeled 1 to 3, where each is explained below.</p>
    </td>
  </tr>
</table>

### HUD Editor Components
<details>
<table width="100%">
  <tbody>
    <!-- Row 1 -->
    <tr>
      <td align="center" valign="middle" width="10%"><h2>1</h2></td>
      <td align="center" valign="middle" width="30%">
        <img src="./img/hud_1.png" alt="HUD Component 1" width="250" />
      </td>
      <td align="left" valign="middle" width="60%">
        <h3>UI Frames</h3>
        <p>These are the frames that can be configured in many ways including <span style="color: #fca800;">position, scale, chosen layout, or anchoring.</span> Details are shown below.</p>
<p>You can select a frame by clicking on them, denoted by its white outline.</p>
      </td>
    </tr>
    <!-- Row 2 -->
    <tr>
      <td align="center" valign="middle" width="10%"><h2>2</h2></td>
      <td align="center" valign="middle" width="30%">
        <img src="./img/hud_2.png" alt="HUD Component 2" width="250" />
      </td>
      <td align="left" valign="middle" width="60%">
        <h3>Hud Editor Menu</h3>
        <p>The menu consists of three different buttons represented in different states. When opening the screen, only the left button is present until interacted with. The buttons from top to bottom are as follows:</p>
        <ul>
    <li><span style="color: #aa906d;"><strong>Open HUD Editor:</strong></span> Opens the HUD Editor for layout configuration. Turns <span style="color: #aa5151;">red</span> when the button changes to close the editor. </li>
    <li><span style="color: #464646;"><strong>Open Layout Editor:</strong></span> Opens the layout editor without directly opening any file for editing, allowing you to use a fresh slate. The layout editor's session persists while the game is running to allow the ability to close the screen when in danger.</li>
        <li><span style="color: #aa906d;"><strong>Open Menu:</strong></span> Opens the rest of the menu to unlock different options. Turns <span style="color: #aa5151;">red</span> when the button changes to close menu. This button can be dragged while holding right click to change the location of the persistent button whenever the base HUD Editor is opened (default <code>Left Alt</code>).</li>
</ul>
      </td>
    </tr>
    <!-- Row 3 -->
    <tr>
      <td align="center" valign="middle" width="10%"><h2>3</h2></td>
      <td align="center" valign="middle" width="30%">
        <img src="./img/hud_3.png" alt="HUD Component 3" width="250" />
      </td>
      <td align="left" valign="middle" width="60%">
        <h3>HUD Frame Configuration Menu</h3>
        <p>After pressing the HUD Editor button (explained above), this menu appears next to the buttons. This menu allows you to change the <span style="color: #01a1a1;">position, scale, layout, and anchor location</span> of frames that support these options. The actual configuration values are in <span style="color: #ee9f02;">orange.</span></p>
        <p>There is also a button right above the menu that allows you to swap the position of the entire menu to the top of the screen, in case you want to align something near the bottom. There are also two more buttons above the layout selector, explained below, from left to right:</p>
        <ul>
 <li><span style="color: #01a1a1;"><strong>Toggle Grid:</strong></span> Toggles the visibility of the grid layout markers. The grid is 8x8 pixels while the thicker grid is 32x32 pixels. </li>
    <li><span style="color: #aa5151;"><strong>Reset Layout:</strong></span> Resets the currently selected frame's <span style="color: #01a1a1;">position, scale, and anchors</span> to default values.</li>
        </ul>
        <p>When clicking on the Layout selector, a new window pops up allowing you to Select a Layout for the current frame. Next to the <span style="color: #ee9f02;">selected layout indicator</span>, the buttons, from left to right, are as follows:</p>
              <ul>
 <li><span style="color: #01a1a1;"><strong>Open Layout Directory</strong></span> Opens the layout directory on your computer. The directory is at <code>minecraft_root/config/parties/layouts/</code>.</li>
<li><span style="color: #3939aa;"><strong>Rename Layout:</strong></span> Allows you to rename the currently selected layout, provided that a selected one isn't a default layout.</li>
 <li><span style="color: #178817;"><strong>Open Editor:</strong></span> Opens the Layout Editor with the currently selected layout, allowing you to fine tweak things or create a new layout from it.</li>
    <li><span style="color: #aa5151;"><strong>Delete Layout:</strong></span> Deletes the currently selected layout. Note that after the warning screen, <span style="color: #aa5151;">there is no going back after deletion</span></li>
</ul>
<p>The <span style="color: #01a1a1;">anchor selector</span> resides right next to the layout selector, and allows you to select a different anchor point to build offsets from. When hovering the selector, nine different anchor points are available to choose from. These are useful for configuration layouts that support different screen sizes.</p>
</td>
    </tr>
  </tbody>
</table>
</details>

### Compatibility Module Configuration
Parties is a mod that integrates with other mods at its core, so these integrations will always be expanded upon. Since you can't guarantee that an integration that works today will work tomorrow, all of these integrations have been made modular. The following integrations are found in `minecraft_root/config/parties/modules.properties` and are as follows:

<details>
<table width="100%" style="border-collapse: collapse; text-align: left;">
  <thead>
    <tr style="background-color: #2a2a2a;">
      <th style="padding: 10px;" width="40%">Module Id</th>
      <th style="padding: 10px;" width="60%">Description</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td style="padding: 10px; border-bottom: 1px solid #444;"><code>irons_spellbooks.element_castbar</code></td>
      <td style="padding: 10px; border-bottom: 1px solid #444;">Enables the Cast Bar element for Iron's Spells n Spellbooks. It is visible when casting any spell with or without a duration, for all members.</td>
    </tr>
    <tr>
      <td style="padding: 10px; border-bottom: 1px solid #444;"><code>irons_spellbooks.element_manabar_is</code></td>
      <td style="padding: 10px; border-bottom: 1px solid #444;">Enables the Mana Bar element for Iron's Spells n Spellbooks. It syncs and displays your mana and max mana across the party.</td>
    </tr>
    <tr>
      <td style="padding: 10px; border-bottom: 1px solid #444;"><code>irons_spellbooks.hostile_spell_registry</code></td>
      <td style="padding: 10px; border-bottom: 1px solid #444;">Adds a new tag for spells of Iron's Spells n Spellbooks. If the spell is targeted (can lock onto someone), adding this tag allows for filtering team members, preventing friendly fire or wasted targeting.</td>
    </tr>
    <tr>
      <td style="padding: 10px; border-bottom: 1px solid #444;"><code>irons_spellbooks.resolver_summons</code></td>
      <td style="padding: 10px; border-bottom: 1px solid #444;">Adds Iron's Spells n Spellbooks summon entities as an owner resolving type for team member filtering. It allows for friendly-fire protection of your summons.</td>
    </tr>
  </tbody>
</table>
</details>

### Mixin Module Configuration
As mentioned above, integrations between mods could be quite fragile. Therefore, almost every coded change can also be configured in this file, found at `minecraft_root/config/parties/mixins.properties`. Most of these are necessary to achieve full functionality of the mod, where disabling them might break things. However, the option is available as a workaround for compatibility with other mods, as a last resort. The settings are as follows: 

<details>
<table width="100%" style="border-collapse: collapse; text-align: left;">
  <thead>
    <tr style="background-color: #2a2a2a;">
      <th style="padding: 10px;" width="30%">Module Id</th>
      <th style="padding: 10px;" width="40%">Description</th>
      <th style="padding: 10px;" width="30%">Changes if Disabled</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td style="padding: 10px; border-bottom: 1px solid #444;"><code>accessor.minecraft.chunk_map.entity_tracker</code></td>
      <td style="padding: 10px; border-bottom: 1px solid #444;">Provides EntityMap/seenBy() access for party proximity checks regarding stat tracking.</td>
      <td style="padding: 10px; border-bottom: 1px solid #444;">Defaults to marking players as distant, server-side tracking.</td>
    </tr>
    <tr>
      <td style="padding: 10px; border-bottom: 1px solid #444;"><code>mixin.minecraft.living_entity_health_effects</code></td>
      <td style="padding: 10px; border-bottom: 1px solid #444;">Provides LivingEntity access for party health updates.</td>
      <td style="padding: 10px; border-bottom: 1px solid #444;">Breaks any health updates and tracking for the Party UI.</td>
    </tr>
    <tr>
      <td style="padding: 10px; border-bottom: 1px solid #444;"><code>mixin.ironsspellbooks.entity.spell_ownership</code></td>
      <td style="padding: 10px; border-bottom: 1px solid #444;">Keeps track of spell ownership for the given spell entity to figure out alliance mechanics.</td>
      <td style="padding: 10px; border-bottom: 1px solid #444;">Spells with no traceable owner will affect allies.</td>
    </tr>
    <tr>
      <td style="padding: 10px; border-bottom: 1px solid #444;"><code>mixin.ironsspellbooks.entity.allied_mechanics</code></td>
      <td style="padding: 10px; border-bottom: 1px solid #444;">Intercepts targeted spells utilizing a hostile spell filter, passing it through an Alliance check.</td>
      <td style="padding: 10px; border-bottom: 1px solid #444;">Targeted hostile spells could still be cast on allies.</td>
    </tr>
    <tr>
      <td style="padding: 10px; border-bottom: 1px solid #444;"><code>mixin.minecraft.online_state</code></td>
      <td style="padding: 10px; border-bottom: 1px solid #444;">Provides Online tracking hooks for the Party UI</td>
      <td style="padding: 10px; border-bottom: 1px solid #444;">Breaks online-tracking UI updates for the Party UI.</td>
    </tr>
    <tr>
      <td style="padding: 10px; border-bottom: 1px solid #444;"><code>mixin.minecraft.client_packet_listener</code></td>
      <td style="padding: 10px; border-bottom: 1px solid #444;">Intercepts incoming packets to synchronize health, attributes, and mob effects.</td>
      <td style="padding: 10px; border-bottom: 1px solid #444;">Breaks synchronization of health, stats, and mob effects in the Party UI.</td>
    </tr>
    <tr>
      <td style="padding: 10px; border-bottom: 1px solid #444;"><code>mixin.minecraft.entity.allied_mechanics</code></td>
      <td style="padding: 10px; border-bottom: 1px solid #444;">Intercepts alliance (isAlliedTo) mechanics for anything using the Team Alliance API.</td>
      <td style="padding: 10px; border-bottom: 1px solid #444;">Uses standard team alliance checks, unless modified externally.</td>
    </tr>
    <tr>
      <td style="padding: 10px; border-bottom: 1px solid #444;"><code>mixin.minecraft.render_type</code></td>
      <td style="padding: 10px; border-bottom: 1px solid #444;">Overrides armor and entity render materials to enforce translucency.</td>
      <td style="padding: 10px; border-bottom: 1px solid #444;">Causes ghost party members to render fully opaque instead of with the intended translucency.</td>
    </tr>
    <tr>
      <td style="padding: 10px; border-bottom: 1px solid #444;"><code>mixin.minecraft.attribute_map</code></td>
      <td style="padding: 10px; border-bottom: 1px solid #444;">Provides AttributeMap access for party attribute syncing.</td>
      <td style="padding: 10px; border-bottom: 1px solid #444;">Breaks any attribute-related UI update for the Party UI.</td>
    </tr>
    <tr>
      <td style="padding: 10px; border-bottom: 1px solid #444;"><code>accessor.minecraft.item_entity.age</code></td>
      <td style="padding: 10px; border-bottom: 1px solid #444;">Allows access to ItemEntity's age value for loot despawn overrides.</td>
      <td style="padding: 10px; border-bottom: 1px solid #444;">Only overrides ItemEntity age when set to infinite.</td>
    </tr>
    <tr>
      <td style="padding: 10px; border-bottom: 1px solid #444;"><code>mixin.minecraft.player.player_color</code></td>
      <td style="padding: 10px; border-bottom: 1px solid #444;">Tracks player ownership colors for UI, names, and loot via LocatorBar-style assignment.</td>
      <td style="padding: 10px; border-bottom: 1px solid #444;">Everyone's color is white.</td>
    </tr>
    <tr>
      <td style="padding: 10px; border-bottom: 1px solid #444;"><code>mixin.minecraft.food_data</code></td>
      <td style="padding: 10px; border-bottom: 1px solid #444;">Provides FoodData access for party saturation/hunger updates.</td>
      <td style="padding: 10px; border-bottom: 1px solid #444;">Breaks any food-related UI updates for the Party UI.</td>
    </tr>
    <tr>
      <td style="padding: 10px; border-bottom: 1px solid #444;"><code>mixin.minecraft.chat_screen</code></td>
      <td style="padding: 10px; border-bottom: 1px solid #444;">Adds tooltip integration on the Party UI while the chat screen is open</td>
      <td style="padding: 10px; border-bottom: 1px solid #444;">Tooltips no longer render in the Chat Screen for the party ui.</td>
    </tr>
    <tr>
      <td style="padding: 10px; border-bottom: 1px solid #444;"><code>mixin.minecraft.living_entity.text_render</code></td>
      <td style="padding: 10px; border-bottom: 1px solid #444;">Disables extra text rendering on entities when rendering the player in the Party UI.</td>
      <td style="padding: 10px; border-bottom: 1px solid #444;">Allows flat text to render on the player in the party UI, which is only visible at certain angles.</td>
    </tr>
    <tr>
      <td style="padding: 10px; border-bottom: 1px solid #444;"><code>mixin.minecraft.synched_entity_data</code></td>
      <td style="padding: 10px; border-bottom: 1px solid #444;">Enables client-side synchronization for health and absorption across party members nearby.</td>
      <td style="padding: 10px; border-bottom: 1px solid #444;">Forces separate, server-sided information packets</td>
    </tr>
    <tr>
      <td style="padding: 10px; border-bottom: 1px solid #444;"><code>mixin.minecraft.living_entity.renderer</code></td>
      <td style="padding: 10px; border-bottom: 1px solid #444;">Intercepts character rendering and geometry for the Party UI and transparent models.</td>
      <td style="padding: 10px; border-bottom: 1px solid #444;">Breaks 3D character rendering and ghost overlays in the Party UI.</td>
    </tr>
    <tr>
      <td style="padding: 10px; border-bottom: 1px solid #444;"><code>mixin.minecraft.local_player.xp</code></td>
      <td style="padding: 10px; border-bottom: 1px solid #444;">Intercepts local player experience updates to sync with the party data handler.</td>
      <td style="padding: 10px; border-bottom: 1px solid #444;">Prevents the local player's XP bar from syncing and updating within the Party UI.</td>
    </tr>
    <tr>
      <td style="padding: 10px; border-bottom: 1px solid #444;"><code>mixin.minecraft.social.player_entry</code></td>
      <td style="padding: 10px; border-bottom: 1px solid #444;">Injects a custom party invite button into the vanilla Social Interactions screen.</td>
      <td style="padding: 10px; border-bottom: 1px solid #444;">Removes the ability to invite players to a party directly from the social menu.</td>
    </tr>
    <tr>
      <td style="padding: 10px; border-bottom: 1px solid #444;"><code>mixin.minecraft.player.sync</code></td>
      <td style="padding: 10px; border-bottom: 1px solid #444;">Links player instances to food/attribute data and sends out experience and absorption updates for server-sided party syncing.</td>
      <td style="padding: 10px; border-bottom: 1px solid #444;">Stops the server from tracking and broadcasting experience, food, and absorption changes to the party.</td>
    </tr>
    <tr>
      <td style="padding: 10px; border-bottom: 1px solid #444;"><code>mixin.minecraft.living_entity.effects_check</code></td>
      <td style="padding: 10px; border-bottom: 1px solid #444;">Negative mob effect checks for living entity application of allied team members. Also includes Iron's Spell Projectile support.</td>
      <td style="padding: 10px; border-bottom: 1px solid #444;">Ignores allied members for negative effect applications.</td>
    </tr>
    <tr>
      <td style="padding: 10px; border-bottom: 1px solid #444;"><code>mixin.minecraft.level.tick_entity_tracker</code></td>
      <td style="padding: 10px; border-bottom: 1px solid #444;">Tracks the currently ticking Entity on the level. Used to determine MobEffect application sources.</td>
      <td style="padding: 10px; border-bottom: 1px solid #444;">Mob effects will usually not be traceable to the source entity automatically, preventing friendly-fire protection for mob effects.</td>
    </tr>
  </tbody>
</table>
</details>

---

<p align="center">
  <img src="/img/title_support.png" alt="Mod Support" width="100%" />
</p>

Older versions of this mod had a different subset of mod compatibility. Starting from 2.0.0, the mod compatibility along with future support is as follows:

<table>
  <thead>
    <tr>
      <th>Mod Name</th>
      <th>Target Version</th>
      <th>Support Description</th>
      <th>✅</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td><code>Iron's Spells n' Spellbooks</code></td>
      <td>~v1.20.1-3.4.0.9+</td>
      <td>A Cast Bar element, a Mana Bar element, summon, spells, and projectile spell integration for friendly fire prevention.</td>
      <td>🟢</td>
    </tr>
    <tr>
      <td><code>Ars Nouveau</code></td>
      <td>-</td>
      <td>A Mana Bar element, considering Cast Bar integration for spells that meet the requirements.</td>
      <td>🟡</td>
    </tr>
    <tr>
      <td><code>Simple Voice Chat</code></td>
      <td>-</td>
      <td>Voice Chat Element/border, party synchronization, and automatic group creations.</td>
      <td>⚪</td>
    </tr>
    <tr>
      <td><code>Epic Fight</code></td>
      <td>-</td>
      <td>A Stamina bar element, considering Cast Bar integration for Epic Fight skills.</td>
      <td>⚪</td>
    </tr>
  </tbody>
</table>

---
<p align="center">
  <img src="/img/title_faq.png" alt="FAQ Banner" width="100%" />
</p>

### Can I use this mod in a modpack or playthrough?
> **Of course!** You are completely free to include this mod in any public or private modpack, server, video, or stream.

---

### How do I disable or edit the UI?
> Full instructions are listed in the **Configuration** section above.
>
> There are two distinct configuration modes:
> - **Layout:** Controls visual positioning, anchors, and scaling.
> - **HUD:** Controls visibility, toggles, and element behaviors.
>
> *Keybinds for both menus can be customized directly in your Minecraft **Options → Controls** menu.*

---

### This mod is conflicting with another mod or causing a crash!
> Please file a report on the **Issue Tracker** with your crash log (`crash-reports` or `latest.log`).
>
> Because this mod focuses heavily on custom rendering and data handling, cross-mod quirks are usually straightforward to patch once a log and reproduction steps are provided.

---

### Can you add support for another mod?
> Submit a request on the **Issue Tracker** with details about the mod and how you'd like them to integrate, and it will be taken into consideration!

---

### Is there a Fabric version available?
> **Not right now.** The focus remains on Forge and NeoForge, but definitely in the future!

---

### Can you backport changes or support older Minecraft versions?
> **No backports, yet.** Development priorities are focused on modern support and moving forward to the latest Minecraft releases first.

---
Questions? Send me a message! I am reachable on CurseForge :)
