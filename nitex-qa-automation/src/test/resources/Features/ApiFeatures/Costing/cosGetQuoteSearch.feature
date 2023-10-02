Feature: costing quote Req Search
  @smoke
  Scenario Outline: Authenticated fetch data using costing quote Req Search api
    Given costing add cost quote Req Search api will be provided
    When user will hit get costing quote Req Search api all '<q1>' and '<q2>' and '<q3>'
    And user will get data according to the quote Req Search
    Then user will get costing quote Req Search as id
    Examples:
      | q1      | q2     | q3      |
      | search/ | QUOTE? | search= |



