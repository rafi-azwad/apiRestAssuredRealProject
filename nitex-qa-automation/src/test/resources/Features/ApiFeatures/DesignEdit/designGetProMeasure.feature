Feature: design design Get Pro Measure api
  @smoke
  Scenario Outline: Authenticated user design Get Pro Measure add api
    Given design get pro api will be provided
    When user will hit get pro api url with '<p1>' and '<p2>' '<p3>'
    And user will also hit get pro api url with '<p4>' and '<p5>' '<p6>'
    And user will get data according to pro measure api
    Then dgn measure api will be verified with DB
    Examples:
      | p1                   | p2    | p3          | p4   | p5         | p6    |
      | product-measurement/ | size/ | categories/ | all? | productId= | 61280 |

