Feature: costing quote Req Single
  @smoke
  Scenario Outline: Authenticated fetch data using costing quote Req Single api
    Given costing add cost quote Req Single api will be provided
    When user will hit get costing quote Req Single api all '<q1>' and '<q2>' and '<q3>'
    And user will get data according to the quote Req Single
    Then user will get costing quote Req Single as id
    Examples:
      | q1 | q2 | q3 |
    |  brandId=3052&  |  collectionId=30852&  |  requestedBy=19003  |



