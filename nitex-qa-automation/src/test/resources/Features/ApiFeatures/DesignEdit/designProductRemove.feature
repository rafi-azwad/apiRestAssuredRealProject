Feature: design edit api product remove
  @smoke
  Scenario Outline: Authenticated user can fetch data design add product api
    Given design product remove api will be provided
    When user will hit remove api with '<collection>' and '<product>' and '<remove>'
    And user will pass remove design api '<id>' and '<productIds>'
    Then user will verify remove api with DB
    Examples:
      | collection  | product  | remove | id    | productIds |
      | collection/ | product/ | remove | 39167 | 61279      |




