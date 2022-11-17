package wikipedia.steps;

import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import wikipedia.pages.HomePage;

public class HomeSteps {


    @Autowired
    @Lazy
    private HomePage homePage;

    @When("User searches {string}")
    public void goToPage(String articleName){
        this.homePage.searchArticle(articleName);
    }

}
