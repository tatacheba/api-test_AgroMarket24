package config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "classpath:config/credentials.properties"
})
public interface ProjectConfig extends Config {
    //Selenoid property
    @DefaultValue("chrome")
    String browser();

    @DefaultValue("100.0")
    String browserVersion();

    @DefaultValue("1920x1080")
    String browserSize();

    String remoteUrl();

    String videoAttachUrl();

    String login();

    String password();
}