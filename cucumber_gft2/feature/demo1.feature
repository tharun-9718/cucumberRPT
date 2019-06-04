Feature: login Feature

  Scenario: Users enters Username and Password
    Given the login page is opened
    When users enters lalitha as username
    And user enters password123 as password
    Then user will Finds a testmeapp homepage
