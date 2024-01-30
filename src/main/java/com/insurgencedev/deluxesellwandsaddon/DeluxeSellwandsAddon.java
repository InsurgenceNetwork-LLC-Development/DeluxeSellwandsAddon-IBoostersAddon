package com.insurgencedev.deluxesellwandsaddon;

import com.insurgencedev.deluxesellwandsaddon.listeners.DeluxeSellwandsEventListener;
import org.insurgencedev.insurgenceboosters.api.addon.IBoostersAddon;
import org.insurgencedev.insurgenceboosters.api.addon.InsurgenceBoostersAddon;
import org.insurgencedev.insurgenceboosters.libs.fo.Common;

@IBoostersAddon(name = "DeluxeSellwandsAddon", version = "1.0.3", author = "InsurgenceDev", description = "DeluxeSellwands Support")
public class DeluxeSellwandsAddon extends InsurgenceBoostersAddon {

    @Override
    public void onAddonReloadAblesStart() {
        if (Common.doesPluginExist("DeluxeSellwands")) {
            registerEvent(new DeluxeSellwandsEventListener());
        }
    }
}
