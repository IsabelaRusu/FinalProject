package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    @FindBy(xpath = "/html/body/section[2]/div/div/div/input")
    private WebElement EmailForNewsLetter;
    @FindBy(xpath = "/html/body/section[2]/div/div/div/button")
    private WebElement clickOnSubmitButton;


    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    public void writeInTheEmailFieldForNewsLetter(String string) {
        EmailForNewsLetter.sendKeys(string);
    }
    public void clickOnSubmitButtonForNewsLetter(){
       clickOnSubmitButton.click();
    }
}
