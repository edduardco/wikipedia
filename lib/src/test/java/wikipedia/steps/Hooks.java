package wikipedia.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import wikipedia.config.WebDriverFactory;
import wikipedia.utils.ApplicationProperties;

@Slf4j
public class Hooks {

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
    public void setUp() {
        driver = webDriverFactory.getDriver();
        driver.get(properties.getUrl());
        baseSteps.setupPages(driver);
    }

    @After
    public void tearDown(Scenario scenario) {
        byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot, "image/png", scenario.getName());
        if (driver != null) {
            driver.quit();
        }
        LOGGER.info("[ENDED] Scenario: " + scenario.getName());
    }

}
