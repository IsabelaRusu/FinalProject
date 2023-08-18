package org.example;

import PageObjects.ContactInformation;
import PageObjects.MainPage;
import PageObjects.PersonalInformation;
import io.cucumber.java.en.*;
import org.junit.jupiter.api.Assertions;
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

    // ! voi crea un obiect cu denumirea courseOptions in interiorul clasei CourseOptions

    // ! voi crea un obiect cu denumirea paymentInformation in interiorul clasei PaymentInformation
    // ! voi crea un obiect cu denumirea confirmationOfRegistration in interiorul clasei ConfirmationOfRegistration


    //Constructor
    public StepDefinitions(){
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        //Am adaugat obiectul creat in interiorul contructorului
        mainPage = new MainPage(driver);
        personalInformation = new PersonalInformation(driver);
        contactInformation = new ContactInformation(driver);

        //trebuie sa adaug pentru courseOptions
        //trebuie sa adaug pentru paymentInformation
        //trebuie sa adaug pentru confirmationOfRegistration

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
//definirea unei metode
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


    @Then("the Contact information page opens")
  public void TheContactInformationPageOpens () {
                Assertions.assertEquals("Contact information",contactInformation.getContactInformationHeaderText());
            }

    @Then("I remain on Personal information form")
    public void iAmNotAllowedToOpenTheContactInformationPage() {
        Assertions.assertEquals("Personal information", personalInformation);

    }


    @Then("the scenario passes")
    public void theScenarioPasses() {

    }

}