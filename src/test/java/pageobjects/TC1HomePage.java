package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TC1HomePage extends pageObjectBase{

    @FindBy (xpath = "//a[contains(text(),'SIGN-ON')]")
    private WebElement linkSignOn;


    @FindBy (xpath = "//button[@id='save']/span/div/span")
    private WebElement btnAccept;

    public TC1HomePage(WebDriver dr) {
        super(dr);
    }

    public void clickSignOn(){
        linkSignOn.click();
    }

    public void clickAcceptAll(){
        btnAccept.click();
    }
}
