Feature: design art board canvas api
  @smoke
  Scenario Outline: Authenticated user got art board canvas api
    Given design art board canvas api will be provided
    When user will hit the art board canvas url with '<p1>' and '<p2>' '<p3>' and '<p4>'
    And user will get data according to art board canvas api
    Then dgn art board canvas api will be verified with DB
    Examples:
      | p1         | p2       | p3     | p4     |
      | art-board/ | product/ | 61280/ | canvas |


