package wikipedia.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;
import wikipedia.utils.ApplicationProperties;

import java.net.MalformedURLException;
import java.net.URL;

@Component
@ConditionalOnProperty(name = "context", havingValue = "remote")
@Configuration
@Lazy
@Scope("prototype")
public class RemoteDriver implements IDriver {

    @Autowired
    private ApplicationProperties properties;

    @Override
    public WebDriver firefoxDriver() {
        return new org.openqa.selenium.remote.RemoteWebDriver(getHost(), new FirefoxOptions());
    }

    @Override
    public WebDriver chromeDriver() {
        return new org.openqa.selenium.remote.RemoteWebDriver(getHost(), new ChromeOptions());
    }

    public URL getHost(){
        try {
            return new URL(String.format("%s:%s/wd/hub", properties.getDockerHost(), properties.getSeleniumPort()));
        } catch (MalformedURLException e) {
            e.getCause().getMessage();
            e.printStackTrace();
            throw new RuntimeException();
        }
    }
}
