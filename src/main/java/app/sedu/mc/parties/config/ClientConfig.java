package app.sedu.mc.parties.config;

import net.minecraftforge.common.ForgeConfigSpec;

import java.util.function.Supplier;

public class ClientConfig {

    public static ClientConfig INSTANCE;
    private final Supplier<Boolean> endPotionEffects;
    private final Supplier<RenderType> playerRenderType;
    private final Supplier<Boolean> forceModelRotation;
    private final Supplier<Integer> rotationOffset;

    public enum RenderType {
        ON, PARTY, OFF
    }

    /**
     * Creates a new {@link ForgeConfigSpec} for the Client Configuration.
     *
     * @return a new {@link ForgeConfigSpec}
     */
    public static ForgeConfigSpec build() {
        ForgeConfigSpec.Builder builder = new ForgeConfigSpec.Builder();
        INSTANCE = new ClientConfig(builder);
        return builder.build();
    }

    private ClientConfig(ForgeConfigSpec.Builder builder) {
        builder.comment(
            "--------------------------------------------------------",
            "Client Party Settings",
            "Type /party reload in-game to reload this configuration.",
            "--------------------------------------------------------")
        .push("party-ui");

        endPotionEffects = builder.comment("End the potion effects on the client without the server packet",
            "If true, the client won't wait for the server to send a potion effect packet to remove the potion effects from the UI.",
            "If false, the potion effects will stay on the client until the server says the client no longer has it.")
            .define("endPotionEffects", true);

        playerRenderType = builder.comment("Enables the Player Frame under specific conditions.",
            "ON - Enables the Player Frame.",
            "PARTY - Enables the Player Frame only when the player is in a party.",
            "OFF - Disables the Player Frame.")
            .defineEnum("playerRender", RenderType.ON);

        forceModelRotation = builder.comment("Makes all the models drawn on the party frame face forward if true.",
            "Player Model is drawn when the head element has Head Type at 1, or 2 for the entire party.")
            .define("forceModelRotation", false);
        
        rotationOffset = builder.comment("Offset of the front-facing model if forceModelRotation is enabled.",
            "Negative values make the model face right, while positive values make the model face left.")
            .defineInRange("rotationOffset", -20, -180, 180);

        builder.pop();
    }

    /**
     * Determines if the potion effects should end on the client without waiting
     * for the server packet. If true, potion effects are removed from the UI 
     * immediately; otherwise, they persist until the server updates.
     *
     * @return true if potion effects should end without server packet, false otherwise
     */
    public boolean shouldEndPotionEffects() {
        return endPotionEffects.get();
    }

    /**
     * Retrieves the current value for the {@link RenderType} of the player model.
     *
     * @return the current value for the player model render type
     */
    public RenderType getPlayerRenderType() {
        return playerRenderType.get();
    }

    /**
     * Checks if the model rotation should be forced to face forward in the party frame.
     * When true, all models in the party frame will face forward regardless of their
     * default orientation.
     *
     * @return true if model rotation is forced, false otherwise
     */
    public boolean shouldForceModelRotation() {
        return forceModelRotation.get();
    }

    /**
     * Retrieves the current value of the rotation offset of the front-facing model
     * when {@link #shouldForceModelRotation()} is enabled.
     *
     * @return the current rotation offset in degrees
     */
    public int getRotationOffset() {
        return rotationOffset.get();
    }
}
