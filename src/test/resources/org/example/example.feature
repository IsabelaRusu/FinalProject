Feature: An example

  Scenario: TC001 Write a valid First Name - 25 characters
    Given I am on the Personal information page
    When "Ioana Isabela" is written in the First name field
    And "Rusu" is written in the Second name field
    And "Isabelarusu" is written in the Username field
    And "asdftjhytg1@" is written in the PasswordField field
    And "asdftjhytg1@" is written in the ConfirmPasswordField field
    And ThePersonalInformationNextButton is clicked
    Then the Contact information page opens

  Scenario: TC002 Invalid First Name - 26 characters
    Given I am on the Personal information page
    When  "Ioana Isabelaaaaaaaaaaaaaaaaaaaaaa" is written in the First name field
    And "Rusu" is written in the Second name field
    And "Isabelarusu" is written in the Username field
    And "asdftjhytg1@" is written in the PasswordField field
    And "asdftjhytg1@" is written in the ConfirmPasswordField field
    And ThePersonalInformationNextButton is clicked
    Then  I remain on Personal information page

  Scenario: TC003 Invalid First Name - letters, numbers and characters
    Given I am on the Personal information page
    When  "IoanaIs@bela11" is written in the First name field
    And "Rusu" is written in the Second name field
    And "Isabelarusu" is written in the Username field
    And "asdftjhytg1@" is written in the PasswordField field
    And "asdftjhytg1@" is written in the ConfirmPasswordField field
    And ThePersonalInformationNextButton is clicked
    Then  I remain on Personal information page

  Scenario: TC004 Negative: Write a different Confirmation Password
    Given I am on the Personal information page
    When  "IoanaIs@bela11" is written in the First name field
    And "Rusu" is written in the Second name field
    And "Isabelarusu" is written in the Username field
    And "asdftjhytg1@" is written in the PasswordField field
    And "asdft" is written in the ConfirmPasswordField field
    And ThePersonalInformationNextButton is clicked
    Then  I remain on Personal information page

  Scenario: TC005 Input valid values in Contact Information page
    Given I am on Contact Information page
    When "isabelarusu@yahoo.com" is written in the Email field
    And "074352989" is written in the Phone filed
    And "Romania" is written in the Country field
    And "Brasov" is written in the City filed
    And "535 200" is written in the Post Code filed
    And TheContactInformationNextButton is clicked
    Then The Course options page opens

  Scenario: TC006 Select Manual Tester Certificate variant from Course Options Page
    Given I am on Course Options page
    When The Manual Tester Certificate is selected
    And TheCourseOptionsNextButton is clicked
    Then the Payment Information page opens

  Scenario: TC007 Select Automation Tester Certificate variant from Course Options Page
    Given I am on Course Options page
    When The Automation Tester Certificate is selected
    And TheCourseOptionsNextButton is clicked
    Then the Payment Information page opens

  Scenario: TC008 Select Automation & Manual Tester Certificate variant from Course Options Page
    Given I am on Course Options page
    When The Manual&Automation Tester Certificate is selected
    And TheCourseOptionsNextButton is clicked
    Then the Payment Information page opens

  Scenario: TC009 (Negative) Select none of variants from Course Options Page
    Given I am on Course Options page
    And  TheCourseOptionsNextButton is clicked
    Then I remain on Course Options page

  Scenario: TC010 Introduce valid information in Payment Information page
    Given I am on the Payment Information page
    When "Rusu Ioana Isabela" is written in the Card holder name field
    And "1234 5678 9101" is written in Card number field
    And "123" in CVC number field
    And I click Month dropdown button
    And I click on January month from dropdown list
    And I click on Year dropdown button
    And I click on 2023 year from dropdown list
    And I click on Next button on Payment Information page
    Then the success message for registration appears

  Scenario: TC011 Negative: Write valid information in Payment Information page without card holder name
    Given  I am on the Payment Information page
    When "1234 5678 9101" is written in Card number field
    And "123" in CVC number field
    And I click Month dropdown button
    And I click on January month from dropdown list
    And I click on Year dropdown button
    And I click on 2023 year from dropdown list
    And I click on Next button on Payment Information page
    Then I remain on Payment Information page

  Scenario: TC012 Negative: Write valid information in Payment Information page without CVC
    Given  I am on the Payment Information page
    When "Rusu Ioana Isabela" is written in the Card holder name field
    And "1234 5678 9101" is written in Card number field
    And I click Month dropdown button
    And I click on January month from dropdown list
    And I click on Year dropdown button
    And I click on 2023 year from dropdown list
    And I click on Next button on Payment Information page
    Then I remain on Payment Information page

   Scenario: TC013 Check Return to homepage button
    Given I am on registration confirmation page
    When I click to Homepage button
    Then The Homepage opens

   Scenario: TC014 Valid e-mail for Newsletter
     Given I am on the Main Page
     When "rusuisabela@yahoo.com" is written in the e-mail field
     And The Submit button is clicked
     Then The newsletter confirmation pop-up appears

    Scenario: TC015 Negative: Invalid e-mail for Newsletter
      Given I am on the Main Page
      When The e-mail "aaaaaaaaaaaaaabbbbbbbbbbbbbbbbbcccccccccccccc" is written
      And The Submit button is clicked
      Then The error message appears





