package listeners;

import com.codeborne.selenide.Configuration;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.remote.DesiredCapabilities;
import config.ProjectConfig;

public class DriverSettings {
    static ProjectConfig ProjectConfig = ConfigFactory.create(ProjectConfig.class);

    public static void configure() {
        String remoteUrl = System.getProperty("remoteUrl", ProjectConfig.remoteUrl());
        String login = System.getProperty("login", ProjectConfig.login());
        String password = System.getProperty("pass", ProjectConfig.password());
        String browser = System.getProperty("browser", ProjectConfig.browser());
        String version = System.getProperty("browserVersion", ProjectConfig.browserVersion());
        String size = System.getProperty("browserSize", ProjectConfig.browserSize());

        String url = "https://" + login + ":" + password + "@" + remoteUrl;
        Configuration.remote = url;
        Configuration.browser = browser;
        Configuration.browserVersion = version;
        Configuration.browserSize = size;

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", true);
        Configuration.browserCapabilities = capabilities;

        AllureAttachments.attachAsText("Browser: ", browser);
        AllureAttachments.attachAsText("Version: ", version);
        AllureAttachments.attachAsText("Remote Url: ", remoteUrl);
    }
}