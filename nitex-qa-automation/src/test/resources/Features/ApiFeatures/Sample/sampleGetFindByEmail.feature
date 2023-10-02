Feature: sample get find email api
  @smoke
  Scenario Outline: Authenticated user get find email api
    Given design sample find email api will be provided
    When user will hit the sample find email api url with '<p1>', '<p2>', '<p3>' and '<p4>'
    And user will get find email data according to the api
    Then sample find email api will be verified with DB
    Examples:
      | p1    | p2                                | p3        | p4              |
      | user/ | find-list-by-email-and-user-type? | userType= | PATTERN_MASTER |





