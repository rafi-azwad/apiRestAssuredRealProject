Feature: costing quote Req count
  @smoke
  Scenario Outline: Authenticated fetch data using costing quote Req all api
    Given costing add cost quote Req all api will be provided
    When user will hit get costing quote Req all api all '<cq>'
    And user will get data according to the quote Req all
    Then user will get costing quote Req all as id
    Examples:
      | cq |
      | 7252   |


