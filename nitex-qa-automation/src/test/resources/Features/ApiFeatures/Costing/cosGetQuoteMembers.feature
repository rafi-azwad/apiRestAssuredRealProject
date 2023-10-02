Feature: costing quote members page
  @smoke
  Scenario Outline: Authenticated fetch data using costing quote api members
    Given costing add cost quote members api will be provided
    When user will hit get costing quote members api '<cq>' '<cq2>'
    And user will get data according to the quote members
    Then user will get costing quote members as id
    Examples:
      | cq    | cq2     |
      | 7252/ | members |



