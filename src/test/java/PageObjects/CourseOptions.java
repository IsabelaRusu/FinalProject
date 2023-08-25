package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CourseOptions {
    @FindBy (xpath = "//*[@id=\"flexRadioButton1\"]")
    private WebElement ManualTtesterCertificate;

    @FindBy (xpath = "//*[@id=\"flexRadioButton2\"]")
    private WebElement AutomationTesterCertificate;

    @FindBy (xpath = "//*[@id=\"flexRadioButton3\"]")
    private WebElement AutomationAndManualTesterCertificate;

    @FindBy (xpath = "//*[@id=\"flexRadioButton4\"]")
    private WebElement SecurityTesterCertificate;

    @FindBy (xpath = "/html/body/div/div/section/div/form/div[3]/button[2]")
    private WebElement CourseOptionsNextButton;

    //Constructorul
    public CourseOptions(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    //e ok cum e mai jos?
    public void clickOnButtonManualTester() {
        WebElement ButtonManualTestar;
        ButtonManualTestar.click();
    }
  public void clickOnButtonAutomationTester () {
      WebElement ButtonAutomationTester;
      ButtonAutomationTester.click();}
    public void clickOnButtonAutomationAndManualTester(){
        WebElement ButtonAutomationAndManualTester;
        ButtonAutomationAndManualTester.click();}
    public void clickOnButtonSecurityTester(){
        WebElement ButonSecurityTester;
        ButonSecurityTester.click();
    }
    public void clickOnCourseOptionsNextButton(){
        WebElement CourseOptionsNextButton;
        CourseOptionsNextButton.click();
    }






}
