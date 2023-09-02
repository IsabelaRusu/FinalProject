package org.example;

import PageObjects.*;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class StepDefinitions {
    private WebDriver driver;
    ChromeOptions options = new ChromeOptions();

    // Am creat un obiect cu denumirea mainPage in interiorul clasei MainPage
    private MainPage mainPage;

    //Am creat un obiect cu denumirea personalInformation in interiorul clasei PersonalInformation
    private PersonalInformation personalInformation;

    //Am creat un obiect cu denumirea contactInformation in interiorul clasei ContactInformation
    private ContactInformation contactInformation;

    // Am creat un obiect cu denumirea courseOptions in interiorul clasei CourseOptions
    private CourseOptions courseOptions;
    private PaymentInformation paymentInformation;

    // am creat un obiect cu denumirea confirmationOfRegistration in interiorul clasei ConfirmationOfRegistration
    private ConfirmationOfRegistrationPage confirmationOfRegistrationPage;


    //Constructor
    public StepDefinitions(){
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        //Am adaugat obiectul creat in interiorul contructorului
        mainPage = new MainPage(driver);
        personalInformation = new PersonalInformation(driver);
        contactInformation = new ContactInformation(driver);
        courseOptions = new CourseOptions(driver);
        paymentInformation = new PaymentInformation(driver);
        confirmationOfRegistrationPage = new ConfirmationOfRegistrationPage(driver);
    }
    //Main Page
    //driver desfasoara actiuni pe browser
    @Given("I am on the Main Page")
        public void iAmOnTheMainPage() {
            driver.get("file:///D:/Rusu/SW%20tester/Testing-Env-master/Testing-Env-master/index.html");
        }

    @Given("I am on the Personal information page")
    public void iAmOnThePersonalPage () {
        //driver desfasoara actiuni pe browser
        driver.get("file:///D:/Rusu/SW%20tester/Testing-Env-master/Testing-Env-master/routes/enrollment.html");
    }
    @Given("I am on Contact Information page")
    public void iAmOnContactInformationPage() {
        driver.get("file:///D:/Rusu/SW%20tester/Testing-Env-master/Testing-Env-master/routes/enrollment.html");
        personalInformation.fillInPersonalInformationWithData();
    }
    @Given("I am on Course Options page")
    public void iAmOnTheCourseOptionsPage () {
        driver.get("file:///D:/Rusu/SW%20tester/Testing-Env-master/Testing-Env-master/routes/enrollment.html");
        personalInformation.fillInPersonalInformationWithData();
        contactInformation.fillInContactInformationWithData();
    }

    @Given("I am on the Payment Information page")
    public void iAmOnThePaymentInformationPage() {
        driver.get(("file:///D:/Rusu/SW%20tester/Testing-Env-master/Testing-Env-master/routes/enrollment.html"));
        personalInformation.fillInPersonalInformationWithData();
        contactInformation.fillInContactInformationWithData();
        courseOptions.selectInCourseOptionsOneVariant();
    }
    @Given("I am on registration confirmation page")
    public void iAmOnRegistrationConfirmationPage() {
        driver.get("file:///D:/Rusu/SW%20tester/Testing-Env-master/Testing-Env-master/routes/enrollment.html");
        personalInformation.fillInPersonalInformationWithData();
        contactInformation.fillInContactInformationWithData();
        courseOptions.selectInCourseOptionsOneVariant();
        paymentInformation.introduceInPaymentInformationWithData();
    }

    @When("{string} is written in the First name field")
    public void isWrittenInTheFirstNameField(String string) {
        personalInformation.writeInTheFirstNameField(string);
    }
    @When("{string} is written in the Email field")
    public void isWrittenInTheEmailField(String string) {
        contactInformation.writeInTheEmailField(string);
    }

        @When("The Manual Tester Certificate is selected") //e ok asa?
            public void ButtonManualTester(){
            courseOptions.clickOnButtonManualTester();
            }
        @When("The Automation Tester Certificate is selected")
        public void ButtonAutomationTester() {
        courseOptions.clickOnButtonAutomationTester();
        }
        @When ("The Manual&Automation Tester Certificate is selected")
        public void ButtonAutomationAndManualTester(){
        courseOptions.clickOnButtonAutomationAndManualTester();
        }
        @When("The Security Tester Certificate is selected")
        public void ButtonSecurityTester(){
        courseOptions.clickOnButtonSecurityTester();
        }

    @When("{string} is written in the Card holder name field")
    public void isWrittenInTheCardHolderNameField(String string) {
        paymentInformation.writeCardHolderName(string);
    }
    @When("The e-mail {string} is written")
    public void theEMailIsWritten(String string) {
        mainPage.writeInTheEmailFieldForNewsLetter(string);
    }

    @When("I click to Homepage button")
    public void iClickToHomepageButton() {
        confirmationOfRegistrationPage.setClickOnReturnToHomePage();
    }
    @When("{string} is written in the e-mail field")
    public void isWrittenInTheEMailField(String string) {
        mainPage.writeInTheEmailFieldForNewsLetter(string);
    }

    @And("{string} is written in the Second name field")
    public void isWrittenInTheSecondNameField(String string) {
        personalInformation.writeInTheLastNameField(string);
    }
    @And("{string} is written in the Username field")
    public void isWrittenInTheUsernameField(String string) {
        personalInformation.writeInTheUserNameField(string);
    }
    @And("{string} is written in the PasswordField field")
    public void isWrittenInThePasswordFieldField(String string) {
        personalInformation.writeInThePasswordField(string);
    }

    @And("{string} is written in the ConfirmPasswordField field")
    public void isWrittenInTheConfirmPasswordFieldField(String string) {
        personalInformation.writeInTheConfirmPasswordField(string);
    }

    @And("ThePersonalInformationNextButton is clicked")
    public void thepersonalinformationnextbuttonIsClicked() {
        personalInformation.clickOnPersonalInformationNextButton();
    }
    @And("{string} is written in the Phone filed")
    public void isWrittenInThePhoneFiled(String string) {
        contactInformation.writeInThePhoneField(string);
    }
    @And("{string} is written in the Country field")
    public void isWrittenInTheCountryField(String string) {
        contactInformation.writeInTheCountryField(string);
    }
    @And("{string} is written in the City filed")
    public void isWrittenInTheCityFiled(String string) {
        contactInformation.writeInTheCityField(string);
    }
    @And("{string} is written in the Post Code filed")
    public void isWrittenInThePostCodeFiled(String string) {
        contactInformation.writeInThePostCodeField(string);
    }
    @And("TheContactInformationNextButton is clicked")
    public void thecontactinformationnextbuttonIsClicked() {
        contactInformation.clickOnContactInformationNextButton();
    }
    @And("TheCourseOptionsNextButton is clicked")
    public void thecourseoptionsnextbuttonIsClicked() {
        courseOptions.clickOnCourseOptionsNextButton();
    }
    @And("{string} is written in Card number field")
    public void isWrittenInCardNumberField(String string) {
     paymentInformation.writeCardNumber(string);
    }
    @And("{string} in CVC number field")
    public void inCVCNumberField(String string) {
        paymentInformation.CVC(string);
    }
    @And("I click Month dropdown button")
    public void iClickMonthDropdownButton() {
        paymentInformation.setClickOnDropDownMonth();
    }
    @And("I click on January month from dropdown list")
    public void iClickOnJanuaryMonthFromDropdownList() {
        paymentInformation.setClickOnJanuaryMonth();
    }
    @And("I click on Year dropdown button")
    public void iClickOnYearDropdownButton() {
        paymentInformation.setClickOnDropDownYear();
    }
    @And("I click on 2023 year from dropdown list")
    public void iClickOnYearFromDropdownList() {
        paymentInformation.setClickOn2023Year();
    }
    @And("I click on Next button on Payment Information page")
    public void iClickOnNextButtonOnPaymentInformationPage() {
        paymentInformation.setClickOnPaymentInformationNextButton();
    }
    @And("The Submit button is clicked")
    public void theSubmitButtonIsClicked() {
        mainPage.clickOnSubmitButtonForNewsLetter();
    }

    @Then("the Contact information page opens")
    public void theContactInformationPageOpens() {
        Assertions.assertEquals("Contact information",contactInformation.getContactInformationHeaderText());
    }

    @Then("I remain on Personal information page")
    public void iAmNotAllowedToOpenTheContactInformationPage() {
        Assertions.assertEquals("Personal information", personalInformation.getPersonalInformationHeaderText());
    }

    @Then("The Course options page opens")
    public void theCourseOptionsPageOpens() {
        Assertions.assertEquals("Course options", courseOptions.getCourseOptionsHeader());
    }
    @Then("the Payment Information page opens")
    public void thePaymentInformationPageOpens() {
        Assertions.assertEquals("Payment information",paymentInformation.getHeaderText());
    }
    @Then("I remain on Course Options page")
    public void iRemainOnCourseOptionsPage() {
        Assertions.assertTrue(driver.findElement(By.xpath("/html/body/div/div/section/div/form/div[3]/h3")).isDisplayed());

    }
    @Then("the success message for registration appears")
    public void theMessageForRegistrationAppears() {
        Assertions.assertTrue(driver.findElement(By.xpath("/html/body/div/div/section/div/form/div[5]/h3")).isDisplayed());
    }
    @Then("I remain on Payment Information page")
    public void iRemainOnPaymentInformationPage() {
        Assertions.assertTrue(driver.findElement(By.xpath("/html/body/div/div/section/div/form/div[4]/h3")).isDisplayed());
    }
    @Then("The Homepage opens")
    public void theHomepageOpens() {
        Assertions.assertEquals("Software Testing Course", driver.getTitle());
    }
    @Then("The newsletter confirmation pop-up appears")
    public void theNewsletterConfirmationPopUpAppears() {
        driver.switchTo().alert().accept();
    }

    @Then("The error message appears")
    public void theErrorMessageAppears() {
        Assertions.assertTrue(driver.getPageSource().contains("error"));
    }

    @After
    public void cleanUp(Scenario scenario) {
        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/jpg", "");
        }
        driver.quit();
    }
}