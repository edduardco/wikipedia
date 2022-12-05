package wikipedia.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import wikipedia.config.WebDriverWaitConfig;

public class BasePage {

    @Autowired
    WebDriverWaitConfig waitConfig;

    protected WebDriverWait wait;

    public void setWait(WebDriver driver) {
        wait = waitConfig.webdriverWait(driver);
    }
}
