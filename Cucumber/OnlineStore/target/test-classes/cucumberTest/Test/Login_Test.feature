Feature: Login Action

  Scenario Outline: Successful Login with Valid Credentials
    Given User is on Home Page
    When User Navigate to LogIn Page
    And User enters "<username>" and "<password>"
    Then Message displayed Login Successfully
  Examples:
    |username|password|
    |test1|test1|
    |test2|test2|

  Scenario: Successful LogOut
    When User LogOut from the Application
    Then Message displayed LogOut Successfully