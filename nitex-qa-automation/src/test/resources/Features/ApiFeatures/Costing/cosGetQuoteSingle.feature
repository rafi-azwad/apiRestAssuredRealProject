Feature: costing quote single page
  @smoke
  Scenario Outline: Authenticated fetch data using costing quote api single
    Given costing add cost quote single api will be provided
    When user will hit get costing quote api all '<cq>'
    And user will get data according to the quote sngle
    Then user will get costing quote as id
    Examples:
      | cq |
      | 7252   |


