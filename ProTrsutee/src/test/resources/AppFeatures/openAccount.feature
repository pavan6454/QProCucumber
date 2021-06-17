Feature: Account Page Feature

  Background: 
    Given user has already logged in to application
      | username                      | password   |
      | christopher.m.viens@gmail.com | adminchris |

  Scenario: section
    Given navigate to section "People"
