@smoke
Feature: As a user, I should be able to login to the app

  Background: User should be on the login page
    Given I am on the login page

  Scenario Outline: Verify users can login
    When I enter valid username "<username>" and password "<password>"
    Then I should be on the homepage
    Examples:
      |username|password|
      |helpdesk25@cybertekschool.com|UserUser|
      |helpdesk26@cybertekschool.com|UserUser|
      |hr25@cybertekschool.com|UserUser|
      |hr26@cybertekschool.com|UserUser|
      |marketing25@cybertekschool.com|UserUser|
      |marketing26@cybertekschool.com|UserUser|
