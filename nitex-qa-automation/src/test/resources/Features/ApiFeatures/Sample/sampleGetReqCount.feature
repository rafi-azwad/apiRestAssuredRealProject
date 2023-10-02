Feature: sample request api
  @smoke
  Scenario Outline: Authenticated user get sample request api
    Given design sample request api will be provided
    When user will hit the sample request api url with '<p1>' and '<p2>' '<p3>'
    And user will get sample req data according to type api
    Then sample req api will be verified with DB
    Examples:
      | p1      | p2       | p3    |
      | sample/ | request/ | 15202 |


