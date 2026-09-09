---
title: "Parties Mod - Configuration Guide"
theme: jekyll-theme-cayman
---

<p align="center">
  <img src="/img/title_config.png" alt="Configuration Banner" width="100%" />
</p>

Parties has a ton of customization options, ranging from an extensive layout editor to complete control on what features you would like enabled.

<table style="border: none; border-collapse: collapse; width: 100%;">
  <tr style="border: none;">
    <td style="border: none; vertical-align: top; width: 70%; padding-right: 16px;">
      <img src="/img/config_numbered.png" alt="HUD Preview" width="100%" />
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
<table width="100%">
  <tbody>
    <!-- Row 1 -->
    <tr>
      <td align="center" valign="middle" width="10%"><h2>1</h2></td>
      <td align="center" valign="middle" width="30%">
        <img src="/img/layout_1.png" alt="Layout 1" width="250" />
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
        <img src="/img/layout_1-1.png" alt="Layout 1" width="150" />
      </td>
    </tr>
    <!-- Row 2 -->
    <tr>
      <td align="center" valign="middle" width="10%"><h2>2</h2></td>
      <td align="center" valign="middle" width="30%">
        <img src="/img/layout_2.png" alt="Layout 2" width="350" />
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
        <img src="/img/layout_3.png" alt="Layout 3" width="250" />
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
        <img src="/img/layout_4.png" alt="Layout 4" width="250" />
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
        <img src="/img/layout_5.png" alt="Layout 5" width="250" />
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

---
<table style="border: none; border-collapse: collapse; width: 100%;">
  <tr style="border: none;">
    <td style="border: none; vertical-align: top; width: 70%; padding-right: 16px;">
      <img src="/img/hud_editor.png" alt="HUD Editor Preview" width="100%" />
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
<table width="100%">
  <tbody>
    <!-- Row 1 -->
    <tr>
      <td align="center" valign="middle" width="10%"><h2>1</h2></td>
      <td align="center" valign="middle" width="30%">
        <img src="/img/hud_1.png" alt="HUD Component 1" width="250" />
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
        <img src="/img/hud_2.png" alt="HUD Component 2" width="250" />
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
        <img src="/img/hud_3.png" alt="HUD Component 3" width="250" />
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

---
### Compatibility Module Configuration
Parties is a mod that integrates with other mods at its core, so these integrations will always be expanded upon. Since you can't guarantee that an integration that works today will work tomorrow, all of these integrations have been made modular. The following integrations are found in `minecraft_root/config/parties/modules.properties` and are as follows:

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

### Mixin Module Configuration
As mentioned above, integrations between mods could be quite fragile. Therefore, almost every coded change can also be configured in this file, found at `minecraft_root/config/parties/mixins.properties`. Most of these are necessary to achieve full functionality of the mod, where disabling them might break things. However, the option is available as a workaround for compatibility with other mods, as a last resort. The settings are as follows:

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
