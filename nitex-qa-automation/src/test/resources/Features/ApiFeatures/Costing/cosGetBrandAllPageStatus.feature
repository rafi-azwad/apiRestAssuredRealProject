Feature: costing brand all pages status
  @smoke
  Scenario Outline: Authenticated user can fetch data using costing brand status api
    Given costing add cost brand all pages status api will be provided
    When user will hit get costing api statusparam '<sp>'
    And user will get data according to the costing brand status parameters
    Then user will get costing brand all pageaccording to id
    Examples:
      | sp |
    |  ?status=RUNNING  |


