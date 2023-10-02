Feature: costing quantity add product
  @smoke
  Scenario Outline: Authenticated user can fetch data using costing quantity add api
    Given costing add quantity cost api will be provided
    When user will hit get costingquantity api queryparameters '<qp>'
    And user will pass body '<id>' and '<minQuantity>' and '<price>' and '<initialCostingId>'
    And user will get quantity according to the costing parameters
    And user will get costing quantity according to id
    Then data will be saved to quantity db
    Examples:
      | qp                  | id   | minQuantity | price | initialCostingId |
      | quantity-wise-cost/ | null | 1000        | 8     | 29304            |

