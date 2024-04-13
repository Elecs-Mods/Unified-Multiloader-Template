package com.example.minecraft.unified.fabric.mixin;

import net.minecraft.client.renderer.entity.ItemRenderer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/**
 * Created by Elec332 on 25-03-2024
 */
@Mixin(ItemRenderer.class)
public class ItemRendererMixin {

    private static final Logger LOGGER = LogManager.getLogger("FABRIC ITEMRENDERER");

    @Inject(method = "<init>", at = @At("TAIL"))
    public void jo(CallbackInfo ci) {
        LOGGER.info("Fabric-Only ItemRenderer Init");
    }

}
