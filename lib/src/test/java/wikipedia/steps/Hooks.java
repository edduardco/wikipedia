package wikipedia.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.testng.annotations.BeforeClass;
import wikipedia.config.WebDriverFactory;
import wikipedia.utils.ApplicationProperties;

public class Hooks {

    @BeforeClass
    public static void setupWebdriver() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/resources/chromedriver");
        System.setProperty("webdriver.firefox.driver", System.getProperty("user.dir") + "/src/main/resources/geckodriver");
    }

    @Autowired
    @Lazy
    private ApplicationProperties properties;

    @Autowired
    @Lazy
    private WebDriverFactory webDriverFactory;

    @Autowired
    @Lazy
    private BaseSteps baseSteps;

    protected WebDriver driver;

    private static final Logger LOGGER = LoggerFactory.getLogger(Hooks.class);

    @Before(order = 1)
    public void logger(Scenario scenario){
        LOGGER.info("[STARTED] Scenario: " + scenario.getName());
    }

    @Before(order = 2)
    public void initDriver() {
        driver = webDriverFactory.getDriver();
        driver.get(properties.getUrl());
        baseSteps.setupPages(driver);
    }

    @After
    public void teardown(Scenario scenario) {
        byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot, "image/png", scenario.getName());
        if (driver != null) {
            driver.quit();
        }
        LOGGER.info("[ENDED] Scenario: " + scenario.getName());
    }

}
