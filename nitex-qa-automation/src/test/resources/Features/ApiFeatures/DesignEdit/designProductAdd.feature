Feature: design add edit api product
  @smoke
  Scenario Outline: Authenticated user can fetch data design add product api
    Given design add product api will be provided
    When user will hit post design api '<p1>' and '<p2>' and '<p3>'
    And user will hit api with body '<id>' and '<productIds>' and '<async>'
    Then user will get design product and verified with DB
    Examples:
      | p1          | p2       | p3  | id    | productIds | async |
      | collection/ | product/ | add | 39167 | 60959      | false |




