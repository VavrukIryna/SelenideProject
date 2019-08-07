Feature: Test with gmail

  Scenario Outline: login in gmail
    Given open gmail page
    When user enter login "<login>"
    Then login is entered
    When user enter password "<password>"
    Then password is entered
    Examples:
      | login| password|
      |test.iryna.mail|testmail|


  Scenario Outline: enter message at gmail
    Given open gmail page
    When user enter login "<login>"
    Then login is entered
    When user enter password "<password>"
    Then password is entered
    And user login to gmail
    When  user click to compose button
    Then new message Window is entered

    Examples:
      | login| password|
      |test.iryna.mail|testmail|