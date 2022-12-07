package wikipedia.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

@Component
public class SwagProductPage {

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    WebElement addBackpack;

    public void addToCart(String product) {
        switch (product.toLowerCase()) {
            case "backpack":
                addBackpack.click();
                break;
        }
    }
}
