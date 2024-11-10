package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:${env}.properties"
})
public interface LocalMobileConfig extends Config {

    @Key("deviceName")
    String getDeviceName();

    @Key("platformVersion")
    String getPlatformVersion();

    @Key("appPackage")
    String getAppPackage();

    @Key("appActivity")
    String getAppActivity();

    @Key("appVersion")
    String getAppVersion();

    @Key("appUrl")
    String getAppUrl();

    @Key("appPath")
    String getAppPath();

    @Key("appiumServer")
    String getAppiumServer();
}