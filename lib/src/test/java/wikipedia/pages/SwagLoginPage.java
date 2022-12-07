package wikipedia.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

@Component
public class SwagLoginPage extends BasePage {

    @FindBy(id = "user-name" )
    WebElement userNameTxt;

    @FindBy(id = "password" )
    WebElement passwordTxt;

    @FindBy(id = "login-button")
    WebElement loginBtn;

    public void login(String userName, String password) {
        userNameTxt.sendKeys(userName);
        passwordTxt.sendKeys(password);
        loginBtn.click();
    }
}
