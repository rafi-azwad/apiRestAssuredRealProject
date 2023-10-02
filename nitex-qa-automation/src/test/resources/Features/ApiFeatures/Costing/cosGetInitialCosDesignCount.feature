Feature: costing initial costing design
  @smoke
  Scenario Outline: Authenticated user can fetch data initial costing design api
    Given costing initial collection design api will be provided
    When user will hit init design api '<q1>' and '<q2>' and '<q3>'
    Then user will get initial collection design according to id will be saved to db
    Examples:
      | q1               | q2          | q3    |
      | initial-costing/ | collection/ | 39167 |
