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

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[3]/h3")
    private WebElement courseOptionsHeader;

    //Constructorul
    public CourseOptions(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    //e ok cum e mai jos?
    public void clickOnButtonManualTester() {
        ManualTtesterCertificate.click();
    }
  public void clickOnButtonAutomationTester () {
      AutomationTesterCertificate.click();
    }
    public void clickOnButtonAutomationAndManualTester(){
        AutomationAndManualTesterCertificate.click();}
    public void clickOnButtonSecurityTester(){
        SecurityTesterCertificate.click();
    }
    public void clickOnCourseOptionsNextButton(){
        //WebElement CourseOptionsNextButton = null;
        CourseOptionsNextButton.click();
    }
    public void selectInCourseOptionsOneVariant() {
        clickOnButtonManualTester();
        clickOnCourseOptionsNextButton();
    }

    public String getCourseOptionsHeader() {
        return courseOptionsHeader.getText();
    }

}
