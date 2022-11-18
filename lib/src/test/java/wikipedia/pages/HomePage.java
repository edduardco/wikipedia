package wikipedia.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.springframework.stereotype.Component;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToIgnoringCase;

@Component
public class HomePage extends BasePage {

    @FindBy(id = "searchInput")
    private WebElement searchBar;

    @FindBy(css = "div[class='suggestions-results']>a:first-child")
    private WebElement firstSearchSuggestions;

    @FindBy(css = "span[class='mw-page-title-main']")
    private WebElement mainTitle;

    /**
     * Search for an article with name provided
     * @param articleName
     */
    public void searchArticle(String articleName){
        searchBar.sendKeys(articleName);
    }

    /**
     * Clicks the first result presented in search suggestions
     */
    public void selectFirstResult(){
        wait.until(ExpectedConditions.elementToBeClickable(firstSearchSuggestions));
        firstSearchSuggestions.click();
    }

    /**
     * Verifies if article title equals to article name searched
     */
    public void verifyTitle(String articleTitle){
        assertThat(articleTitle, equalToIgnoringCase(mainTitle.getText()));
    }

}
