@wip
Feature: Messaging functionality
    Agile Story: As a user I should be able to send message

  Scenario: Verify users can send message by clicking "Message" tab
    Given User is on Activity Stream Page
    When User types "Testing message Functionality" by clicking Message tab
    And User clicks on send button
    Then User should be able to see the message on Activity Stream page