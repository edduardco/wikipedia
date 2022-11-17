package wikipedia.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

@Component
public class HomePage extends BasePage {

//    public HomePage(WebDriver driver) {
//        PageFactory.initElements(driver, this);
//    }

    @FindBy(id = "searchInput")
    private WebElement searchBar;

    @FindBy(css = "span[class='mw-page-title-main']")
    private WebElement mainTitle;

    /**
     * Search for an article with name provided
     * @param articleName
     */
    public void searchArticle(String articleName){
        searchBar.sendKeys(articleName);
        searchBar.sendKeys(Keys.ENTER);
    }

}
