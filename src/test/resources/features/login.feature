@smoke
Feature: As a user, I should be able to login to the app

  Background: User should be on the login page
    Given I am on the login page

  Scenario Outline: Users (hr, marketing and helpdesk) login with valid credentials
    When I enter valid username "<username>" and password "<password>"
    Then I should be on the Activity Stream page
    Examples:
      |username|password|
      |helpdesk25@cybertekschool.com|UserUser|
      |helpdesk26@cybertekschool.com|UserUser|
      |hr25@cybertekschool.com|UserUser|
      |hr26@cybertekschool.com|UserUser|
      |marketing25@cybertekschool.com|UserUser|
      |marketing26@cybertekschool.com|UserUser|


  Scenario: Users cannot login with invalid credentials. (Negative)
    When I enter invalid username "invaldUsername" and password "invalidPassword"
    Then I should me shown invalid login or password message


  Scenario: Users can check Remember me on this computer option
    When I check remember me button
    Then I should see the button is checked

  Scenario: Users have access to Forgot My Password
    When I click Forgot My password
    Then I should be brought to Forgot My Password page