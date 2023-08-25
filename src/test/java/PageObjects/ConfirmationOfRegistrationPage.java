package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmationOfRegistrationPage {
    @FindBy(xpath ="/html/body/div/div/section/div/form/div[5]/h3")
    private WebElement clickOnReturnToHomePage;

    //constructorul
    public ConfirmationOfRegistrationPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    public void setClickOnReturnToHomePage() {
        clickOnReturnToHomePage.click();
    }
}
