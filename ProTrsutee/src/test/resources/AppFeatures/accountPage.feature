Feature: Account Page Feature

  Background: 
    Given user has already logged in to application
      | username              | password   |
      | pavan.pes09@gmail.com | Pavan@9538 |

  Scenario: Verify accounts page title
    Given user is on account page
    When user gets the title of webpage
    Then page title should be "My account - My Store"

  Scenario: Account section count
    Given user is on account page
    Then user gets account section
      | ORDER HISTORY AND DETAILS |
      | MY CREDIT SLIPS           |
      | MY ADDRESSES              |
      | MY PERSONAL INFORMATION   |
      | MY WISHLISTS              |
      | Home                      |
    And account section count should be 6
