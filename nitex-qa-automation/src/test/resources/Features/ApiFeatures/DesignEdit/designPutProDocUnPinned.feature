Feature: design put pro doc unpinned
  @smoke
  Scenario Outline: Authenticated user can put pro doc unpinned api
    Given design put pro doc unpinned api will be provided
    When user will hit material update put pro doc unpinned api url with '<p1>' and '<p2>' and '<p3>'
    And user will hit unpinned api '<p4>' and '<p5>' and '<p6>'
    Then dgn put unpinned api will be verified with DB
    Examples:
      | p1          | p2        | p3      | p4         | p5      | p6       |
      | collection/ | %2039167/ | product | -document/ | 159486/ | unpinned |
