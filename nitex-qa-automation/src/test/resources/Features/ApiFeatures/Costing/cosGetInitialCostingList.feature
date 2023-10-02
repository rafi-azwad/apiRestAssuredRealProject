Feature: initial costing list
  @smoke
  Scenario Outline: Authenticated fetch data using initial costing list api
    Given costing add cost list api will be provided
    When user will hit initial costing list api all '<cq>'
    And user will get data according to the initialcosting list
    Then user will get costing list as id
    Examples:
      | cq |
      | 7252   |


