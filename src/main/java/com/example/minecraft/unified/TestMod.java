package com.example.minecraft.unified;

import nl.elec332.minecraft.loader.api.distmarker.Dist;
import nl.elec332.minecraft.loader.api.modloader.IModLoader;
import nl.elec332.minecraft.loader.mod.Mod;
import nl.elec332.minecraft.loader.mod.event.CommonSetupEvent;
import nl.elec332.minecraft.repackaged.net.neoforged.bus.api.IEventBus;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by Elec332 on 26-03-2024
 */
@Mod(TestMod.MOD_ID)
public class TestMod {

    public TestMod(Dist dist, IEventBus eventBus) {
        LOGGER.info("Loading on " + dist + " for loader " + IModLoader.INSTANCE.getModLoaderName());
        eventBus.addListener(this::preInit);
    }

    public static final String MOD_ID = "unifiedtestmod";
    public static final Logger LOGGER = LogManager.getLogger(IModLoader.INSTANCE.getModMetaData(MOD_ID).getModName());

    private void preInit(CommonSetupEvent event) {
        LOGGER.info("All loaded mods: " + IModLoader.INSTANCE.getMods());
    }

}
