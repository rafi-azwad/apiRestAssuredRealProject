Feature: costing initial costing collection
  @smoke
  Scenario Outline: Authenticated user can fetch data initial costing material fabric type api
    Given costing fabric type api will be provided
    When user will hit fabric type api '<q1>' and '<q2>' and '<q3>'
    Then user will get fabric type data according to id data will be saved to db
    Examples:
      | q1               | q2          | q3    |
      | material | /fabric-type | /all |
