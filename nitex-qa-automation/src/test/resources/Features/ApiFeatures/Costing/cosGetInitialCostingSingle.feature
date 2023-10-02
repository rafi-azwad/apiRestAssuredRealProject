Feature: costing initial costing collection
  @smoke
  Scenario Outline: Authenticated user can fetch data initial costing collection api
    Given costing initial collection api will be provided
    When user will hit init api '<q1>' and '<q2>' and '<q3>'
    Then user will get initial collection data according to id data will be saved to db
    Examples:
      | q1               | q2          | q3    |
      | initial-costing/ | collection/ | 39167 |
