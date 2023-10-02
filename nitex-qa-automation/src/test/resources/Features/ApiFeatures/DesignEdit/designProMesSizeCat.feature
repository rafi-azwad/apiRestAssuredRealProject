Feature: design add edit api measurement size category
  @smoke
  Scenario Outline: Authenticated user can fetch data design measurement size cat api
    Given design measurement size cat api will be provided
    When user will hit measurement size cat api '<p1>' and '<p2>' and '<p3>'
    And user will hit measurement size cat api with body '<name>' and '<sSize>' and '<sSizeLabel>' and '<mSize>' and '<pId>'
    Then measurement size cat api will be verified with DB
    Examples:
      | p1                   | p2    | p3       | name | sSize | sSizeLabel | mSize | pId   |
      | product-measurement/ | size/ | category | test | XXXS  | 3XS        | 4XS   | 61280 |







