Feature: sample get product material api
  @smoke
  Scenario Outline: Authenticated user get product material api
    Given design sample product material api will be provided
    When user will hit the sample product material api url with '<p1>', '<p2>' and '<p3>'
    And user will get product material data according to the api
    Then sample find product material api will be verified with DB
    Examples:
      | p1       | p2        | p3 |
      | product/ | material/ | 60959   |






