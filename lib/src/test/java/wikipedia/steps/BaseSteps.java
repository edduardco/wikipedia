package wikipedia.steps;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import wikipedia.pages.BasePage;

import java.util.List;

import static org.openqa.selenium.support.PageFactory.initElements;

@Component
public class BaseSteps {

    @Autowired
    private List<BasePage> pages;

    public void setupPages(WebDriver driver) {
        // Initialize all page elements
        pages.forEach(page -> initElements(driver, page));
        pages.forEach(page -> page.setWait(driver));
    }

}
