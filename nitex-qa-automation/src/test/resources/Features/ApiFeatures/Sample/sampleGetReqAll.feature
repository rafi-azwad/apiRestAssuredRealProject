Feature: sample request all api
  @smoke
  Scenario Outline: Authenticated user get sample request all api
    Given design sample request all api will be provided
    When user will hit the sample request all api url with '<p1>' and '<p2>' '<p3>'
    And  user will also hit the sample request all api url with '<p4>' and '<p5>' '<p6>'
    And user will get sample req all data according to type api
    Then sample req all api will be verified with DB
    Examples:
      | p1      | p2           | p3      | p4      | p5       | p6      |
      | sample/ | request/all? | page=0& | size=15 | &status= | PENDING |



