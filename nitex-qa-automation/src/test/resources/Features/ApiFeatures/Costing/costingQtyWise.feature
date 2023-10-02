Feature: costing Quantity Wise Send Offer
  @smoke
  Scenario Outline: Authenticated user can fetch data using qty wise offer api
    Given costing qty wise api will be provided
    When user will hit qty wise api '<qp>' and '<qp2>' and '<qp3>'
    And user will get data according to the qty wise parameters
    Then user will get costing variant data according to id data will be saved to db
    Examples:
      | qp | qp2 | qp3 |
    |  quantity-wise-cost/  | send-offer?    |  ids=27055   |

