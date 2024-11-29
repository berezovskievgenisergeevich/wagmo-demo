package web.test;

import com.codeborne.selenide.Configuration;
import config.TestsConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.remote.DesiredCapabilities;
import web.data.TestData;

import java.util.HashMap;
import java.util.Map;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static helpers.Attach.*;

public class BaseTest {

    public TestData testData = new TestData();
    static TestsConfig config;

    @BeforeAll
    static void setUp() {
        config = ConfigFactory.create(TestsConfig.class, System.getProperties());

        Configuration.baseUrl = config.baseUrl();
        Configuration.browserSize = config.browserSize();
        Configuration.browser = config.browser();

        if (config.isRemote()) {
            //Configuration.browserVersion = config.browserVersion();
            Configuration.remote = config.getRemoteUrl() + "/wd/hub";

            Map<String, Object> map = new HashMap<>();
            map.put("enableVNC", true);
            map.put("enableVideo", true);
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("selenoid:options", map);
            Configuration.browserCapabilities = capabilities;
        }
    }

    @AfterEach
    public void afterEach() {
        screenshotAs("Last screenshot");
        pageSource();
        browserConsoleLogs(config);
        addVideo(config);
        closeWebDriver();
    }


}
