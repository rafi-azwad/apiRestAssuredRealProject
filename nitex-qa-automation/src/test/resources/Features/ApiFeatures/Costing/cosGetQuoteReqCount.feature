Feature: costing quote Req count
  @smoke
  Scenario Outline: Authenticated fetch data using costing quote Req count api
    Given costing add cost quote Req count api will be provided
    When user will hit get costing quote Req count api all '<cq>'
    And user will get data according to the quote Req count
    Then user will get costing quote Req count as id
    Examples:
      | cq |
      | 7252   |


