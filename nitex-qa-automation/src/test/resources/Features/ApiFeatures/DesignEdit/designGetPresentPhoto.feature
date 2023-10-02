Feature: design present photo api
  @smoke
  Scenario Outline: Authenticated user present photo api
    Given design present photo api will be provided
    When user will hit the present photo url with '<p1>' and '<p2>' '<p3>' and '<p4>'
    And user will get data according to present photo api
    Then dgn present photo api will be verified with DB
    Examples:
      | p1          | p2     | p3                 | p4                    |
      | collection/ | 30852/ | presentation-info? | fromPhotography=false |


