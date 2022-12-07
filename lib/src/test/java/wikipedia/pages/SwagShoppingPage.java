package wikipedia.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsStringIgnoringCase;

@Component
public class SwagShoppingPage {

    @FindBy(css = "a[class='shopping_cart_link']")
    WebElement shoppingCartBtn;

    @FindBy(css = "div[class='inventory_item_name']")
    WebElement inventoryItemName;


    public void checkCart(String itemsOnCart) {
        assertThat(inventoryItemName.getText(), containsStringIgnoringCase(itemsOnCart));
    }
}
