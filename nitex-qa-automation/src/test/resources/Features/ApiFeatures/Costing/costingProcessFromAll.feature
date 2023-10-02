Feature: costing process from all cost
  @smoke
  Scenario Outline: Authenticated user can fetch data using costing process all api
    Given costing process all base api will be provided
    When user will hit get add api queryparameters '<qp1>' and '<qp2>'
    And user will pass api body parameters for process api '<qp3>' and '<qp4>'
    And user will get data according to the process from all cost api
    Then user will get process data according to id and data will be validated
    Examples:
      | qp1             | qp2                    | qp3                               | qp4   |
      | initial-costing | /process-from-all-cost | 1,1.1,2.2,1.3,0.4,1.5,0.6,1.7,1.8 | 29304 |

