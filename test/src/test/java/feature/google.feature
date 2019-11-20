Feature: Test with search at google

  Scenario Outline: search at google
    Given open google page
    When user enter value "<value>"
    Then search is made

    Examples:
      | value|
      |selenium|