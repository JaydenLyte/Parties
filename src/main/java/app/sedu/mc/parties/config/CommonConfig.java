package app.sedu.mc.parties.config;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

import app.sedu.mc.parties.Parties;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.common.Mod;

// An example config class. This is not required, but it's a good idea to have one to keep your config organized.
// Demonstrates how to use Forge's config APIs
@Mod.EventBusSubscriber(modid = Parties.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CommonConfig
{
    public static CommonConfig INSTANCE;
    private final Supplier<Integer> playerAcceptTimer;
    private final Supplier<Integer> fastInterval;
    private final Supplier<Integer> slowInterval;
    private final Supplier<Integer> partySize;
    private final Supplier<Boolean> hookVanillaTeams;
    private final Supplier<Boolean> friendlyFire;
    private final Supplier<Boolean> enableXpShare;
    private final Supplier<Boolean> enableGlobalShare;
    private final Supplier<Boolean> ignoreXpCommand;
    private final Supplier<Boolean> globalModPackets;
    private final Supplier<Boolean> useFTBTeams;
    private final Supplier<Boolean> bossModule;
    private final Supplier<List<? extends String>> markBosses;
    private final Supplier<CountType> playerCountType;
    private final Supplier<Integer> playerCountRadius;
    private final Supplier<Double> healthMod;
    private final Supplier<Double> damageMod;
    private final Supplier<Boolean> scaleLoot;
    private final Supplier<Boolean> scaleSpecialLoot;

    public enum CountType {
        SERVER, DIMENSION, RADIUS, PARTY
    }

    
        /**
         * Creates a new {@link ForgeConfigSpec} for the Common Configuration.
         *
         * @return a new {@link ForgeConfigSpec}
         */
    public static ForgeConfigSpec build() {
        ForgeConfigSpec.Builder builder = new ForgeConfigSpec.Builder();
        INSTANCE = new CommonConfig(builder);
        return builder.build();
    }

    private CommonConfig(ForgeConfigSpec.Builder BUILDER) {
        BUILDER.comment(
            "--------------------------------------------------------",
            "Common Party Settings",
            "Some of these settings may require a server/client restart to take effect.",
            "--------------------------------------------------------")
        .push("timers");

        playerAcceptTimer = BUILDER.comment("Delay (in seconds) for player to accept invite before it automatically expires.")
            .defineInRange("playerAcceptTimer", 30, 5, 60);

        fastInterval = BUILDER.comment("Delay (in ticks) for player packet syncing (hunger, xp)")
            .defineInRange("fastInterval", 10, 10, 200);
        
        slowInterval = BUILDER.comment("Delay (in ticks) for player packet syncing for less frequent items (World Temp, etc)")
            .defineInRange("playerSlowUpdateInterval", 40, 40, 800);

        BUILDER.pop();
        BUILDER.push("mechanics");

        partySize = BUILDER.comment("Max size for a party")
            .defineInRange("partySize", 5, 2, Integer.MAX_VALUE);
        
        hookVanillaTeams = BUILDER.comment("Makes the party system utilize the vanilla team system as well.")
            .define("useVanillaTeams", true);

        friendlyFire = BUILDER.comment("Allow players to attack each other in parties")
        .define("friendlyFire", false);

        BUILDER.pop();
        BUILDER.push("xp-share");

        enableXpShare = BUILDER.comment("Allow players to share XP in a party. This is a universal option.")
            .define("enableShare", true);

        enableGlobalShare = BUILDER.comment("Enables XP Sharing between party members regardless of distance from each other.")
        .define("globalShare", false);

        ignoreXpCommand = BUILDER.comment("Disables XP Sharing from vanilla commands that give experience *points*.",
        "(/xp add [name] [amount] points)").define("ignoreCommand", true);

        BUILDER.pop();
        BUILDER.push("mod-support");

        globalModPackets = BUILDER.comment("This allows for extra modded information (like cast bars) to update regardless of distance.",
            "true - Enables this feature.  Members have all information shared regardless of distance.",
            "false - Disables this feature. Members have to be within tracking range for updates.",
            "APPLIES TO: Cast Bar Element")
            .define("allowGlobalUpdates", true);

        useFTBTeams = BUILDER.comment("Uses FTB Teams to handle party management instead. Commands will be disabled.")
        .define("useFTBTeams", false);

        BUILDER.pop();
        BUILDER.push("boss-module");
        
        bossModule = BUILDER.comment("The boss module allows you to alter boss attributes and loot depending on the number of players from various types of sources.",
            "true - Enables the boss module.",
            "false - Disables the boss module.")
            .define("bossModuleEnabled", false);

        markBosses = BUILDER.comment("A list of entity IDs that the Parties mod treats as bosses. These entities will utilize the scaling of the Boss Module. Changes to this list require a restart.")
            .defineList("markBosses", Arrays.asList("minecraft:wither", "minecraft:ender_dragon", "minecraft:warden"), entry -> true);

        playerCountType = BUILDER.comment("Changes the way the player count is calculated to adjust the attributes and loot drops of bosses.",
            "SERVER - Counts all online players.",
            "DIMENSION - Counts all players in the same dimension.",
            "RADIUS - Counts all players in a defined radius from the spawned boss. (Not functional yet)",
            "PARTY - Counts all players in the nearest player's party.")
            .defineEnum("playerCountType", CountType.DIMENSION);

        playerCountRadius = BUILDER.comment("If playerCountType is RADIUS, this defines the radius size from the boss to look for players, in meters.")
            .defineInRange("playerCountRadius", 256, 1, Integer.MAX_VALUE);

        healthMod = BUILDER.comment("The health modifier multiplied by the player count above, as a total multiplier. (.5 * 3 players = 1.5 = 250% health)",
        "A value of 0 disables health modifiers.")
        .defineInRange("healthMod", .25, 0.0, Integer.MAX_VALUE);

        damageMod = BUILDER.comment("The damage modifier multiplied by the player count above, as a total multiplier. (.5 * 3 players = 1.5 = 250% damage)",
        "A value of 0 disables health modifiers.")
        .defineInRange("healthMod", .25, 0.0, Integer.MAX_VALUE);

        scaleLoot = BUILDER.comment("If true, scales the loot to the amount of players from the player count above.",
        "Setting this value to false disables this feature.")
        .define("scaleLoot", true);

        scaleSpecialLoot = BUILDER.comment("If true, scales special loot just like above.",
        "Currently determines whether you'd get more Affixed items from Apotheosis mini-bosses.")
        .define("scaleSpecialLoot", true);

        BUILDER.pop();
    }


/**
 * Retrieves the player accept timer duration.
 * 
 * @return the time in seconds a player has to accept an invite before it automatically expires.
 */

    public int getPlayerAcceptTimer() {
        return playerAcceptTimer.get();
    }

    /**
     * Retrieves the interval in ticks between each party update. This interval is 
     * used for updates that should generally be updated more quickly.
     * 
     * @return the time in ticks.
     */
    public int getFastInterval() {
        return fastInterval.get();
    }

    /**
     * Retrieves the interval in ticks between each party update. This interval is 
     * used for updates that do not need to be updated quickly.
     * 
     * @return the time in ticks.
     */
    public int getSlowInterval() {
        return slowInterval.get();
    }

    /**
     * Retrieves the maximum party size allowed.
     *
     * @return the maximum number of players that can be in a party.
     */

    public int getPartySize() {
        return partySize.get();
    }

    /**
     * Retrieves whether the vanilla team system should be hooked. This hook
     * will treat the mod's party system as part of a vanilla team.
     * 
     * @return true if the vanilla team system is hooked, false otherwise.
     */
    public boolean getHookVanillaTeams() {
        return hookVanillaTeams.get();
    }

    /**
     * Retrieves whether friendly fire is enabled. When true, players can attack
     * each other in parties.
     * 
     * @return true if friendly fire is enabled, false otherwise.
     */
    public boolean getFriendlyFire() {
        return friendlyFire.get();
    }

    /**
     * Retrieves whether experience sharing is enabled. When true, 
     * parties will share experience equally
     * among all online members.
     *
     * @return true if experience sharing is enabled, false otherwise.
     */
    public boolean getEnableXpShare() {
        return enableXpShare.get();
    }

    /**
     * Retrieves whether experience sharing is enabled globally. When true, all 
     * online players will share experience equally regardless of distance or 
     * dimension.
     * 
     * @return true if global experience sharing is enabled, false otherwise.
     */
    public boolean getEnableGlobalShare() {
        return enableGlobalShare.get();
    }

    /**
     * Retrieves whether the command to give experience points should be ignored.
     * <p>
     * When true, the command will be ignored if a player executes it. This prevents
     * xp from commands to be shared with the party.
     * 
     * @return true if the command should be ignored, false otherwise.
     */
    public boolean getIgnoreXpCommand() {
        return ignoreXpCommand.get();
    }

    /**
     * Retrieves whether mod packets should be sent globally to all party members.
     * <p>
     * When true, mod packets will be sent to all online players regardless of
     * distance or dimension. This is useful for features that could be syncronized
     * across all players. Utilized by Iron's Spells' cast bars.
     * <p>
     * When false, mod packets will only be sent to players in the same dimension
     * and within a certain range of the sending player.
     * 
     * @return true if mod packets are sent globally, false otherwise.
     */
    public boolean getGlobalModPackets() {
        return globalModPackets.get();
    }

    /**
     * Retrieves whether the mod should use FTB Teams' teams instead of creating
     * its own parties. When true, the mod will use FTB Teams' API to create and
     * manage teams, and all party functions will be disabled. When false, the
     * mod will create and manage its own parties.
     * 
     * @return true if the mod should use FTB Teams, false otherwise.
     */
    public boolean getUseFTBTeams() {
        return useFTBTeams.get();
    }

    /**
     * Retrieves whether the boss module is enabled. When true, the mod will
     * potentially adjust loot, health, and damage from provided mobs.
     * 
     * @return true if the boss module is enabled, false otherwise.
     */
    public boolean getBossModule() {
        return bossModule.get();
    }

    /**
     * Retrieves the list of bosses that should be marked.
     * <p>
     * This list can be used to determine which bosses are flagged for
     * special treatment, such as scaling hp/damage or enhanced loot drops.
     * 
     * @return a list of boss names that are marked.
     */

    public List<? extends String> getMarkBosses() {
        return markBosses.get();
    }

    /**
     * Retrieves the type of counting that should be used to scale bosses.
     * <p>
     * The type of counting determines how bosses are handled.
     * See {@link CountType} for the different types of counting.
     * 
     * @return the type of counting.
     */
    public CountType getPlayerCountType() {
        return playerCountType.get();
    }

    /**
     * Retrieves the radius (in blocks) that is used to count players when
     * scaling bosses.
     * 
     * @return the radius in blocks.
     */
    public int getPlayerCountRadius() {
        return playerCountRadius.get();
    }

    /**
     * Retrieves the health modifier for bosses that scales multiplicably
     * by the number of players counted.
     * <p>
     * This modifier will be applied to the boss's max health when
     * scaling bosses.
     * 
     * @return the health modifier.
     */
    public double getHealthMod() {
        return healthMod.get();
    }

/**
 * Retrieves the damage modifier for bosses that scales multiplicably
 * by the number of players counted.
 * <p>
 * This modifier will be applied to the boss's damage when
 * scaling bosses.
 * 
 * @return the damage modifier.
 */

    public double getDamageMod() {
        return damageMod.get();
    }

    /**
     * Retrieves whether the mod should scale loot drops based on the number
     * of players in the party.
     * 
     * @return true if loot should be scaled, false otherwise.
     */
    public boolean getScaleLoot() {
        return scaleLoot.get();
    }

    /**
     * Retrieves whether special loot drops should be scaled based on 
     * the number of players in the party. This currently includes
     * Apotheosis Affixed loot.
     * 
     * @return true if special loot should be scaled, false otherwise.
     */

    public boolean getScaleSpecialLoot() {
        return scaleSpecialLoot.get();
    }

}
