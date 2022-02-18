package com.brittank88.wsl;

import net.fabricmc.api.ModInitializer;

public class WSL implements ModInitializer {
    @Override
    public void onInitialize() {
        System.out.println("Initializing WSL!");
        System.out.println("Max player speed: " + 100.0F + " -> " + Float.MAX_VALUE);
        System.out.println("Max elytra speed: " + 300.0F + " -> " + Float.MAX_VALUE);
        System.out.println("Max vehicle speed: " + 100.0 + " -> " + Double.MAX_VALUE);
    }
}
