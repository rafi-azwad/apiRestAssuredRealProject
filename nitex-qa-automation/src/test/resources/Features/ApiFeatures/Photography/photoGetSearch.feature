Feature: sample get photography search api
  @smoke
  Scenario Outline: Authenticated user get photography search api
    Given design photography search api will be provided
    When user will hit the photography search api url with '<p1>', '<p2>', '<p3>'
    And user will get photography search according to the api
    Then photography search api will be verified with DB
    Examples:
      | p1          | p2      | p3          |
      | collection/ | search/ | PHOTOGRAPHY |







