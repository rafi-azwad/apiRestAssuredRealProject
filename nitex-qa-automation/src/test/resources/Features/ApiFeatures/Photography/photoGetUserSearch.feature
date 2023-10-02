Feature: sample get photography user search api
  @smoke
  Scenario Outline: Authenticated user get photography user search api
    Given photography user search api will be provided
    When user will hit the photography user search api url with '<p1>', '<p2>', '<p3>', '<p4>'
    And user will get photography user search according to the api
    Then photography user search api will be verified with DB
    Examples:
      | p1    | p2      | p3              | p4      |
      | user/ | search? | page=0&size=15& | search= |








