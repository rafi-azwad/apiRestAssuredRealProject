Feature: costing Quantity Archive
  @smoke
  Scenario Outline: Authenticated user can fetch data using costing archive api
    Given costing archive api will be provided
    When user will hit archive api '<qp>' and '<qp2>'
    And user will get data according to the archive parameters
    Then user will get archive data according to id data will be saved to db
    Examples:
      | qp     | qp2     |
      | 15153/ | archive |


