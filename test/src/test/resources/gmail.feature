Feature: Test logging at gmail

  Scenario Outline: login in gmail
    Given open gmail page
    When user enter login "<login>"
    Then login is entered
    When user enter password "<password>"
    Then password is entered

    Examples:
    | login| password|
    |test.iryna.mail|testmail|