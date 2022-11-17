package wikipedia.config;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import wikipedia.utils.ApplicationProperties;

@Component
public class WebDriverFactory {

    @Autowired
    private ApplicationProperties properties;

    @Autowired
    private IDriver iDriver;

    public WebDriver getDriver() {
        switch(properties.getBrowser()){
            case "chrome":
                return iDriver.chromeDriver();
            case "firefox":
                return iDriver.firefoxDriver();
            default:
                throw new IllegalArgumentException("Unexpected value: " + properties.getBrowser());
        }
    }

}
