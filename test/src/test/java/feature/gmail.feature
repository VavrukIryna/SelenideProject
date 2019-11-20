Feature: Test with gmail

  Scenario Outline: login in gmail
    Given open gmail page
    When user enter login "<login>"
    And user enter password "<password>"
    Then user login to gmail
    Examples:
      | login| password|
      |test.iryna.mail|testmail|


  Scenario Outline: enter message at gmail
    Given open gmail page
    When user enter login "<login>"
    And user enter password "<password>"
    Then user login to gmail
    When  user click to compose button
    Then new message Window is entered

    Examples:
      | login| password|
      |test.iryna.mail|testmail|