Feature: design design Get Pro Measure unit api
  @smoke
  Scenario Outline: Authenticated user design Get Pro Measure unit api
    Given design get pro api unit will be provided
    When user will hit get pro unit api url with '<p1>' and '<p2>' '<p3>'
    And user will get data according to pro measure unit api
    Then dgn measure unit api will be verified with DB
    Examples:
      | p1                   | p2     | p3      |
      | product-measurement/ | 61278? | unit=CM |


