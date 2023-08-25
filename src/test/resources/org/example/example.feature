Feature: An example

  Scenario: TC001 Input a valid First Name - 25 characters
    Given I am on the Personal information page
    //When "Ioana Isabela" is written in the First name field
    When theFirstName {string} is written in the First name field
    And theSecondName {string} is written in the Second name field
    And theUserName {string} is written in the Username field
    And thePasswordField {string} is written in the PasswordField field
    And theConfirmPasswordField {string} is written in the Username field
    And ThePersonalInformationNextButton is clicked
    Then the Contact information page opens

  Scenario: TC002 Invalid First Name - 26 characters
    Given I am on the Personal information page
    When theFirstName {Ioanaaaaaaaaaaaaaaaa} is written in the First name field
    And theSecondName {string} is written in the Second name field
    And theUserName {string} is written in the Username field
    And thePasswordField {string} is written in the PasswordField field
    And theConfirmPasswordField {string} is written in the Username field
    And ThePersonalInformationNextButton is clicked
    Then the Contact information page opens

  Scenario: TC003 Invalid First Name - letters, numbers and characters
    Given I am on the Personal information page
    When theFirstName {string} is written in the First name field
    And theSecondName {string} is written in the Second name field
    And theUserName {string} is written in the Username field
    And thePasswordField {string} is written in the PasswordField field
    And theConfirmPasswordField {string} is written in the Username field
    And ThePersonalInformationNextButton is clicked
    Then I remain on Personal information form

  Scenario: TC004 Input a valid Last Name - 25 characters
    Given I am on the Personal information page
  //When "Ioana Isabela" is written in the First name field
    When theFirstName {string} is written in the First name field
    And theSecondName {string} is written in the Second name field
    And theUserName {string} is written in the Username field
    And thePasswordField {string} is written in the PasswordField field
    And theConfirmPasswordField {string} is written in the Username field
    And ThePersonalInformationNextButton is clicked
    Then the Contact information page opens


    When all step definitions are implemented
    And theEmail "test@test.com" is written in the Email field
    Then the scenario passes
