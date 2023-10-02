Feature: design design get pro dev com api
  @smoke
  Scenario Outline: Authenticated user can get pro dev com api
    Given design get pro dev api will be provided
    When user will hit the api url with '<p1>' and '<p2>' and '<p3>' and '<p4>'
    And  user will get data according to pro dev api
    Then dgn pro dev api will be verified with DB
    Examples:
      | p1                   | p2       | p3       | p4    |
      | product-development- | comment/ | product/ | 61280 |


