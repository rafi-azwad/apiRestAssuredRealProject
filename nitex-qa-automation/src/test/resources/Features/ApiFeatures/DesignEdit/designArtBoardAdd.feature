Feature: design art board add api
  @smoke
  Scenario Outline: Authenticated user can post art board add api
    Given design art board add api will be provided
    When user will hit the api url with '<p1>' and '<p2>'
    And user will hit art board add api body '<code>' and '<b64>' and '<dMType>'
    And user will also add api body with '<dType>' and '<name>' and '<hJson>' and '<pID>' and '<serial>'
    Then dgn api will be verified with DB
    Examples:
      | p1         | p2  | code      | b64 | dMType | dType           | name          | hJson | pID   | serial |
      | art-board/ | add | canvasId4 |     |        | REFERENCE_IMAGE | Flat sketches |       | 61280 | 4      |



