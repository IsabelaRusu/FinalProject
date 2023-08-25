package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PaymentInformation {
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[2]/input")
    private WebElement CardHolderName;
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[3]/div/div[1]/input")
    private WebElement CardNumber;
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[3]/div/div[2]/input")
    private WebElement CVC;
    @FindBy(xpath = "//*[@id=\"month\"]")
    private WebElement clickOnDropDownMonth;
    @FindBy(xpath = "//*[@id=\"month\"]/option[2]")
    private WebElement clickOnJanuaryMonth;
    @FindBy(xpath = "//*[@id=\"year\"]")
    private WebElement clickOnDropDownYear;
    @FindBy(xpath = "//*[@id=\"year\"]/option[4]")
    private WebElement clickOn2023Year;
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[4]/button[2]")
    private WebElement clickOnNextButtonPaymentInformation;

    //Constructorul
    public PaymentInformation(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public void writeCardHolderName() {CardHolderName.sendKeys();}
    public void writeCardNumber(String string) {CardNumber.sendKeys(string);
    }
    public void CVC(String string) {
        CVC.sendKeys(string);
    }
    public void setClickOnDropDownMonth() {clickOnDropDownMonth.click();}
    public void setClickOnJanuaryMonth(){
        clickOnJanuaryMonth.click();
    }
    public void selectMonthWithXPath(WebDriver driver,String month){
        WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"month\"]"));
        Select select = new Select(dropdown);
        select.selectByVisibleText(month);
    }
    public void setClickOnDropDownYear() {clickOnDropDownYear.click();}
    public void setClickOn2023Year() {clickOn2023Year.click();}
    public void selectYearWithXpath (WebDriver driver, String year) {
        WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"year\"]"));
        Select select = new Select(dropdown);
        select.selectByVisibleText(year);
    }

    public void setClickOnNextButtonPaymentInformation() {clickOnNextButtonPaymentInformation.click();}

}
