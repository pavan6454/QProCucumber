#using keywords we can create featurefile
Feature: Login Page Feature

  @smokeTest
  Scenario: Verify login page title
    Given user has logged in to application
      | username              | password   |
      | pavan.pes09@gmail.com | Pavan@9538 |
    When user gets the title of webpage
    Then page title should be "Logins"

  Scenario: Forget password link
    Given user is on login page
    Then forgot your password link should be displayed

  Scenario: Login with correct credentials
    Given user is on login page
    When user enters username "pavan.pes09@gmail.com"
    And user enters password "Pavan@9538"
    And user clicks on login button
    Then user gets the title of webpage
    And page title should be "My account - My Store"
