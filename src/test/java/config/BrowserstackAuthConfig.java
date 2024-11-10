package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:browserstack.properties"
})

public interface BrowserstackAuthConfig extends Config {

    @Key("userName")
    String getUserName();

    @Key("key")
    String getKey();

    @Key("remoteUrl")
    @DefaultValue("https://hub.browserstack.com/wd/hub")
    String getRemoteUrl();

    @Key("projectName")
    String getProjectName();

    @Key("buildName")
    String getBuildName();
}