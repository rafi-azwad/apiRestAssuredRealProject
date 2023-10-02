Feature: sample post measurement api
  @smoke
  Scenario Outline: Authenticated user post measurement api
    Given design sample post measurement api will be provided
    When user will hit the sample post measurement api url with '<p1>', '<p2>', '<p3>' and '<p4>'
    And user will receive post measurement data according to the api
    Then sample post measurement api will be verified with DB
    Examples:
      | p1       | p2     | p3        | p4          |
      | product/ | 60959/ | complete- | measurement |





