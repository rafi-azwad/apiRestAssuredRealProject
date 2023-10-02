Feature: design tags type api
  @smoke
  Scenario Outline: Authenticated user got type api
    Given design tag type api will be provided
    When user will hit the type api url with '<p1>' and '<p2>' '<p3>' and '<p4>'
    And user will get data according to type api
    Then dgn tags type api will be verified with DB
    Examples:
      | p1    | p2   | p3    | p4                   |
      | tags/ | all? | type= | PRODUCT_FITTING_TYPE |

