Feature: costing data fetching through peram
  @smoke
  Scenario Outline: Authenticated user can fetch data using get costing api
    Given costing base api will be provided
    When user will hit get api queryparameters '<query_p1>' and '<query_p2>' and '<query_p3>'
    And user will get data according to the parameters
    Then user will get costing data according to id
    Examples:
      | query_p1  | query_p2 | query_p3 |
      | all-page? | status   | RUNNING  |

