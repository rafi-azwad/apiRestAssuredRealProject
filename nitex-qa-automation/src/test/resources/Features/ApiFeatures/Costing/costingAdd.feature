Feature: costing add variant product
  @smoke
  Scenario Outline: Authenticated user can fetch data using costing add api
    Given costing add cost base api will be provided
    When user will hit get costing api queryparameters '<qp>'
    And user will pass body parameters '<id>' and '<fabricUnitCost>' and '<totalCost>' and '<moq>' and '<baseSize>' and '<initialCostingId>'
    And user will get data according to the costing parameters
    And user will get costing variant data according to id
    Then data will be saved to db
    Examples:
      | qp  | id    | fabricUnitCost | totalCost | moq | baseSize | initialCostingId |
      | add | 29304 | 1              | 300       | 500 | 1        | 29304            |

