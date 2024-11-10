package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:${env}.properties",
        "classpath:android.properties"
})

public interface MobileConfig extends Config {

    @Key("device")
    String getDevice();

    @Key("osVersion")
    String getOsVersion();

    @Key("app")
    String getApp();
}