Feature: costing brand all pages
  @smoke
  Scenario Outline: Authenticated user can fetch data using costing brand api
    Given costing add cost brand all pages api will be provided
    When user will hit get costing api all '<sp>'
    And user will get data according to the costing brand parameters
    Then user will get costing brand all pagedata as id
    Examples:
      | sp |
      | 0  |


