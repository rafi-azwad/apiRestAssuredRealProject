Feature: sample get photography design count api
  @smoke
  Scenario Outline: Authenticated user get photography design count api
    Given design photography design count api will be provided
    When user will hit the photography design count api url with '<p1>', '<p2>', '<p3>', '<p4>' and '<p5>'
    And user will get photography design count according to the api
    Then photography design count api will be verified with DB
    Examples:
      | p1           | p2                  | p3               | p4            | p5                |
      | photography/ | design-count?page=0 | &size=15&status= | PENDING&sort= | lastModified,desc |






