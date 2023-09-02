package PageObjects;

import io.cucumber.core.runtime.RunnerSupplier;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PersonalInformation {

    @FindBy(xpath = "//*[@id=\"firstName\"]")  //FirstName
    private WebElement firstnameField;

    @FindBy (xpath = "//*[@id=\"lastName\"]") //LastName
    private WebElement lastNameField;

    @FindBy (xpath = "//*[@id=\"username\"]")  //Username
    private WebElement userNameField;
    @FindBy (xpath = "//*[@id=\"password\"]") //Password
    private WebElement passWordField;

    @FindBy (xpath = "//*[@id=\"cpassword\"]") //confirmPassword
    private WebElement confirmPasswordField;
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[1]/button")
    private WebElement personalInformationNextButton;
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[1]/h3")
    private WebElement personalInformationHeader;

    //Constructorul
    public PersonalInformation(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }
    public void writeInTheFirstNameField (String string) {firstnameField.sendKeys(string);}
    public void writeInTheLastNameField (String string) {lastNameField.sendKeys(string);}

    public void writeInTheUserNameField (String string) {userNameField.sendKeys(string);}

    public void writeInThePasswordField (String string) {passWordField.sendKeys(string);}

    public void writeInTheConfirmPasswordField (String string) {confirmPasswordField.sendKeys(string);}

    public void clickOnPersonalInformationNextButton () { personalInformationNextButton.click();
    }
    public String getPersonalInformationHeaderText() {
        return personalInformationHeader.getText();
    }
    public void fillInPersonalInformationWithData(){
        writeInTheFirstNameField("Ioana-Isabela");
        writeInTheLastNameField("Rusu");
        writeInTheUserNameField("Isabelarusu");
        writeInThePasswordField("asdftjhytg1@");
        writeInTheConfirmPasswordField("asdftjhytg1@");
        clickOnPersonalInformationNextButton();
    }

}
