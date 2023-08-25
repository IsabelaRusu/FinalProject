package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactInformation {
    //EmailField
    @FindBy(xpath = "//*[@id=\"email\"]")
    private WebElement EmailField;

    @FindBy(xpath = "//*[@id=\"phone\"]")
    private WebElement PhoneField;

    @FindBy(xpath = "//*[@id=\"phone\"]")
    private WebElement CountryField;

    @FindBy(xpath = "//*[@id=\"city\"]")
    private WebElement CityField;

    @FindBy(xpath = "//*[@id=\"postCode\"]")
    private WebElement PostCodeField;
    @FindBy (xpath = "/html/body/div/div/section/div/form/div[2]/button[2]")
    private WebElement contactInformationNextButton;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[2]/h3")
    private WebElement contactInformationHeader;

    //Constructorul
    public ContactInformation(WebDriver driver) {
        this.contactInformationHeader = contactInformationHeader;
        PageFactory.initElements(driver,this);
    }
    public void writeInTheEmailField (String string) {EmailField.sendKeys(string);}
    public void writeInThePhoneField (String string) {PhoneField.sendKeys(string);}
    public void writeInTheCountryField (String string) {CountryField.sendKeys(string);}
    public void writeInTheCityField (String string) {CityField.sendKeys(string);}
    public void writeInThePostCodeField (String string) {PostCodeField.sendKeys(string);}
    public void clickOnContactInformationNextButton () {clickOnContactInformationNextButton();}

    public String getContactInformationHeaderText() {
        return contactInformationHeader.getText();
    }

}
