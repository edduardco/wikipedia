package wikipedia.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import wikipedia.pages.HomePage;
import wikipedia.utils.WikipediaPOJO;

public class HomeSteps {

    @Autowired
    @Lazy
    private HomePage homePage;

    private WikipediaPOJO wikiPOJO = new WikipediaPOJO();

    @Given("User searches article of {string}")
    public void searchArticle(String articleName){
        wikiPOJO.setArticleTitle(articleName);
        this.homePage.searchArticle(articleName);
    }

    @When("User selects the first result")
    public void selectFirstResult(){
        this.homePage.selectFirstResult();
    }

    @Then("User verifies article title")
    public void verifyTitle(){
        this.homePage.verifyTitle(wikiPOJO.getArticleTitle());
    }

}
