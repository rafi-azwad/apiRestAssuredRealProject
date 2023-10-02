Feature: costing copy product
  @smoke
  Scenario Outline: Authenticated user can fetch data using costing copy product api
    Given costing copy base api will be provided
    When user will hit get copy api queryparameters '<qp1>' and '<qp2>' and '<qp3>' and '<qp4>'
    And user will get data according to the copy parameters
    Then user will get costing copy data data according to id

    Examples:
      | qp1    | qp2   | qp3    | qp4           |

      | quote/ | 15052 | /item/ | /copy-product |