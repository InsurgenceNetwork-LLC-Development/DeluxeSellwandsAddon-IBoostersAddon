package com.insurgencedev.deluxesellwandsaddon;

import com.insurgencedev.deluxesellwandsaddon.listeners.DeluxeSellwandsEventListener;
import org.bukkit.Bukkit;
import org.insurgencedev.insurgenceboosters.api.addon.IBoostersAddon;
import org.insurgencedev.insurgenceboosters.api.addon.InsurgenceBoostersAddon;

@IBoostersAddon(name = "DeluxeSellwandsAddon", version = "1.0.1", author = "InsurgenceDev", description = "DeluxeSellwands Support")
public class DeluxeSellwandsAddon extends InsurgenceBoostersAddon {

    @Override
    public void onAddonReloadablesStart() {
        if (Bukkit.getPluginManager().isPluginEnabled("DeluxeSellwands")) {
            registerEvent(new DeluxeSellwandsEventListener());
        }
    }
}
