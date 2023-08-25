package org.example;

import PageObjects.*;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.*;
import io.cucumber.java.en_scouse.An;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
    @Given("I am on the SoftwareTestingCoursePage")
    public void iAmOnTheMainPage (){
        //driver desfasoara actiuni pe browser
        driver.get("file:///D:/Rusu/SW%20tester/Testing-Env-master/Testing-Env-master/index.html");
    }

    @Given("I am on the Personal information page")
    public void iAmOnThePersonalPage () {
        //driver desfasoara actiuni pe browser
        driver.get("file:///D:/Rusu/SW%20tester/Testing-Env-master/Testing-Env-master/routes/enrollment.html");
    }

        @Given("I am on the Contact information page")
        public void iAmOnContactInformationPage () {
            //driver desfasoara actiuni pe browser
            driver.get("file:///D:/Rusu/SW%20tester/Testing-Env-master/Testing-Env-master/routes/enrollment.html");
        }
        @Given("I am on Course Options page")
        public void iAmOnTheCourseOptionsPage () {
        driver.get("file:///D:/Rusu/SW%20tester/Testing-Env-master/Testing-Env-master/routes/enrollment.html");

        }
        @Given("I am on Payment Information page")
        public void iAmOnThePaymentInformationPage () {
        driver.get("file:///D:/Rusu/SW%20tester/Testing-Env-master/Testing-Env-master/routes/enrollment.html");
        }

            /*
         trebuie given si pentru courseOptions
         ..
         trebuie given si pentru confirmationOfRegistration
        */


    @When("theFirstName {string} is written in the First name field")
    public void writeTheFirstName(String string){
            // TODO: Add the class
            personalInformation.writeInTheFirstNameField(string);
        }

        @When("theEmail {string} is written in the Email field")
        public void writeTheEmail(String string) {
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
        @When("The CardHolderName {string} is written in the card holder name field")
        public void writeTheCardHolderName(){
            paymentInformation.writeCardHolderName();
        }

    @And("theSecondName {string} is written in the Second name field")
    public void writeTheLastName (String string) {
        personalInformation.writeInTheLastNameField(string);
    }
    @And("theUserName {string} is written in the Username field")
    public void writeTheUsername (String string){
            personalInformation.writeInTheUserNameField(string);
        }
    @And("thePasswordField {string} is written in the PasswordField field")
    public void writeThePasswordField (String string){
     personalInformation.writeInThePasswordField(string);
    }
   @And("theConfirmPasswordField {string} is written in the Username field")
   public void writeTheConfirmPassword (String string) {
       personalInformation.writeInTheConfirmPasswordField(string);
    }
    @And("ThePersonalInformationNextButton is clicked")
    public void clickOnPersonalInformationNextButton () {
        personalInformation.clickOnPersonalInformationNextButton();
            }
    @And("ThePhoneField {string} is written in the Phone field")
    public void writeThePhoneField (String string) {
        contactInformation.writeInThePhoneField(string);
    }
    @And("TheCountryField {string} is written in the Country field")
    public void writeTheCountryField (String string) {
      contactInformation.writeInTheCountryField(string);
    }
    @And("TheCityField {string} is written in the City field")
    public void writeTheCityField (String string) {
        contactInformation.writeInTheCityField(string);
                }
    @And("ThePostCode {string} is written in the PostCode field ")
            public void writeThePostCode (String string) {
        contactInformation.writeInThePostCodeField(string);
                }
     @And("The Course Options Next Button is clicked")
     public void clickOnCourseOptionsNextButton () {
        courseOptions.clickOnCourseOptionsNextButton();
     }
     @And("TheCardNumber {string} is written in the Card Number field")
     public void writeTheCradNumber (String string) {
        paymentInformation.writeCardNumber(string);
     }
     @And("TheCVC {string} is written in the CVC field")
     public void writeCVC (String string) {
        paymentInformation.CVC(string);
     }
     @And("I click Dropdown Button Month")
     public void clickOnDropDownMonthButton () {
        paymentInformation.setClickOnDropDownMonth();
    }
    @And("I click Dropdown January Button")
    public void clickOnDropDownJanuaryButton () {
        paymentInformation.setClickOnJanuaryMonth();
    }
    @And("I click Dropdown Button Year")
    public void clickOnDropDownYearButton () {
        paymentInformation.setClickOnDropDownYear();
    }
    @And("I click Dropdown 2023 Button")
    public void clickOnDropDown2023Button () {
        paymentInformation.setClickOn2023Year();
    }
    @And("clickOnPaymentInformationNextButton")
    public void clickOnPaymentInformationButton () {
        paymentInformation.setClickOnNextButtonPaymentInformation();
    }

    @Then("The Contact information page opens")
  public void TheContactInformationPageOpens () {
                Assertions.assertEquals("Contact information",contactInformation.getContactInformationHeaderText());
            }

    @Then("I remain on Personal information page")
    public void iAmNotAllowedToOpenTheContactInformationPage() {
        Assertions.assertEquals("Personal information", personalInformation);

    }

   // @Then("The Payment information opens ")
    //public void ThePaymentInformationPageOpens() {
     //   Assertions.assertEquals("Paymant information",paymantinformation);
    //}


    @Then("the scenario passes")
    public void theScenarioPasses() {

    }

}