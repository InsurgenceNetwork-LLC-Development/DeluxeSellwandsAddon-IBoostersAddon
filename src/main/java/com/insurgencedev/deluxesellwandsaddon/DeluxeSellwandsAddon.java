package com.insurgencedev.deluxesellwandsaddon;

import com.insurgencedev.deluxesellwandsaddon.listeners.DeluxeSellwandsEventListener;
import org.insurgencedev.insurgenceboosters.api.addon.IBoostersAddon;
import org.insurgencedev.insurgenceboosters.api.addon.InsurgenceBoostersAddon;

@IBoostersAddon(name = "DeluxeSellwandsAddon", version = "1.0.0", author = "InsurgenceDev", description = "DeluxeSellwands Support")
public class DeluxeSellwandsAddon extends InsurgenceBoostersAddon {

    @Override
    public void onAddonReloadablesStart() {
        registerEvent(new DeluxeSellwandsEventListener());
    }
}
