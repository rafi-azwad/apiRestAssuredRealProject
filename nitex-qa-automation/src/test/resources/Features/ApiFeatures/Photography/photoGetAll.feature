Feature: sample get photography all api
  @smoke
  Scenario Outline: Authenticated user get photography all api
    Given design photography all api will be provided
    When user will hit the photography all api url with '<p1>', '<p2>', '<p3>', '<p4>' and '<p5>'
    And user will get photography all according to the api
    Then photography all api will be verified with DB
    Examples:
      | p1           | p2         | p3               | p4            | p5                |
      | photography/ | all?page=0 | &size=15&status= | PENDING&sort= | lastModified,desc |







