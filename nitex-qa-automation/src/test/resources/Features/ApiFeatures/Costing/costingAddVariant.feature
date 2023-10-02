Feature: costing add variant product
  @smoke
  Scenario Outline: Authenticated user can fetch data using costing add variant product api
    Given costing add variant base api will be provided
    When user will hit get add api queryparameters '<qp1>' and '<qp2>' and '<qp3>' and '<qp4>'
    And user will get data according to the addv parameters
    Then user will get costing add variant data according to id

    Examples:
      | qp1    | qp2   | qp3    | qp4          |

      | quote/ | 15052 | /item/ | /add-variant |