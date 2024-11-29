package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:${env}.properties",
        "classpath:local.properties"
})
public interface TestsConfig extends Config {
    @Key("browser")
    String browser();

    @Key("browser.size")
    String browserSize();

    @Key("app.url")
    String baseUrl();

    @Key("browser.version")
    String browserVersion();

    @Key("api.url")
    String apiUrl();

    @Key("remote")
    Boolean isRemote();

    @Key("remote.url")
    String getRemoteUrl();
}
