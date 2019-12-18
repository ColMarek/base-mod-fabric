package com.colmarek.basemod

import net.fabricmc.api.ModInitializer

@Suppress("unused")
class BaseMod : ModInitializer {
    companion object {
        const val MODID = "basemod"
    }

    override fun onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.

        println("Hello Fabric world!")
    }
}
