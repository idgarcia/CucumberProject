#Author:idgarcia71090@gmail.com
Feature: SignUPWithDT

  Scenario: Signs up to the FreeCRM
    Given: I opens browser
    When: I Provide the following details
    |Edition      |First Name  |Last Name |Email         |Confirm Email |Username  |Password |Company |Phone    |
    |Free Edition |Iris        |Doe       |jdoe@test.com |jdoe@test.com |jdoe123456|test123  |Syntax  |123456789|
    |Free Edition |Jane        |Moe       |jmoe@test.com |jmoe@test.com |jmoe654321|test321  |Syntax  |987654321|

    Then I close browser
