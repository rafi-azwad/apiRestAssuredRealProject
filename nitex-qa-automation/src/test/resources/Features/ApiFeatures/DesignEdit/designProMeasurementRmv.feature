Feature: design add edit api measurement remove
  @smoke
  Scenario Outline: Authenticated user can fetch data design measurement api
    Given design measurement api will be provided
    When user will hit measurement api '<p1>' and '<p2>' and '<p3>'
    And user will hit measurement api with body '<mUnit>' and '<pOfMId>' and '<pID>'
    Then measurement remove api will be verified with DB
    Examples:
      | p1                   | p2            | p3             | mUnit | pOfMId | pID   |
      | product-measurement/ | remove-point- | of-measurement | CM    | 12903  | 61280 |






