Feature: sample post req complete activity api
  @smoke
  Scenario Outline: Authenticated user post req complete activity api
    Given design sample post req complete activity api will be provided
    When user will hit the sample post req complete activity api url with '<p1>', '<p2>', '<p3>' and '<p4>'
    And user will provide sample req activity body '<p5>' and '<p6>'
    And user will receive post req complete activity data according to the api
    Then sample post req complete activity api will be verified with DB
    Examples:
      | p1 | p2 | p3 | p4 | p5 | p6 |
      |  sample/  | request/    |  15202/  | complete-activity   |  PATTERN  | 15702   |





