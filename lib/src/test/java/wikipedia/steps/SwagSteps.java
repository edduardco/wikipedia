package wikipedia.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import wikipedia.pages.SwagLoginPage;
import wikipedia.pages.SwagProductPage;
import wikipedia.pages.SwagShoppingPage;

import java.util.ArrayList;
import java.util.List;

public class SwagSteps {

    @Autowired
    @Lazy
    SwagLoginPage swagLoginPage;

    @Autowired
    @Lazy
    SwagProductPage swagProductPage;

    @Autowired
    @Lazy
    SwagShoppingPage swagShoppingPage;

    String itemsOnCart;

    @Given("User login with user {string} and password {string}")
    public void loginSwagPage(String userName, String password) {
        this.swagLoginPage.login(userName, password);
    }

    @When("User add {string} to shopping cart")
    public void addProduct(String product) {
        this.swagProductPage.addToCart(product);
        itemsOnCart = product;
    }

    @Then("User validates item was added to shopping cart")
    public void checkShoppingCart() {
        this.swagShoppingPage.checkCart(itemsOnCart);
    }
}

