Feature: sample request api for specific user
  @smoke
  Scenario Outline: Authenticated user get sample specific user request api
    Given design sample request specific user api will be provided
    When user will hit the sample request specific user api url with '<p1>' and '<p2>' '<p3>'
    And user will get sample specific user req data according to type api
    Then sample req api specific user will be verified with DB
    Examples:
      | p1      | p2       | p3    |
      | sample/ | request/ | 15202 |




