package app.sedu.mc.parties;

import com.mojang.logging.LogUtils;

import app.sedu.mc.parties.config.ClientConfig;
import app.sedu.mc.parties.config.CommonConfig;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Parties.MODID)
public class Parties
{
    // Define mod id in a common place for everything to reference
    public static final String MODID = "parties";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    /**
     * Logs an informational message with optional formatting arguments.
     *
     * @param msg  the info message to log
     * @param args  optional arguments to format the message
     */
    public static void info(String msg, Object... args) {
        LOGGER.info(msg, args);
    }

/**
 * Logs a warning message with optional formatting arguments.
 *
 * @param msg  the warning message to log
 * @param args  optional arguments to format the message
 */

    public static void warn(String msg, Object... args) {
        LOGGER.warn(msg, args);
    }

    /**
     * Log an error with a {@link Throwable} cause.
     *
     * @param e  the exception to log. If null, a {@link NullPointerException} will be thrown
     * @param msg  the message to log
     * @param args  arguments to format the message
     */
    public static void err(Exception e, String msg, Object... args) {
        LOGGER.error(msg, e, args);
    }

    /**
     * Log an error with the given message and arguments.
     *
     * @param msg  the message to log
     * @param args  arguments to format the message
     */
    public static void err(String msg, Object... args) {
        LOGGER.error(msg, args);
    }

    public Parties(FMLJavaModLoadingContext context)
    {
        IEventBus modEventBus = context.getModEventBus();

        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);



        // Load Client and Common configuration
        context.registerConfig(ModConfig.Type.CLIENT, ClientConfig.build());
        context.registerConfig(ModConfig.Type.COMMON, CommonConfig.build());
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        // Some common setup code
    }


    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
        // Do something when the server starts
    }



    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            // Some client setup code
        }
    }
}
