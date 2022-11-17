package wikipedia.config;

import org.openqa.selenium.WebDriver;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Lazy
@Scope("prototype")
public interface IDriver {

    WebDriver firefoxDriver();
    WebDriver chromeDriver();

}
