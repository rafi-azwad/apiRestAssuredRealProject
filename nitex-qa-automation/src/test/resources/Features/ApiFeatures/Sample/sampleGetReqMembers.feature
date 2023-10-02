Feature: sample request member api
  @smoke
  Scenario Outline: Authenticated user get sample request member api
    Given design sample request member api will be provided
    When user will hit the sample request member api url with '<p1>', '<p2>', '<p3>', '<p4>'
    And user will get sample req member data according to type api
    Then sample req member api will be verified with DB
    Examples:
      | p1      | p2       | p3     | p4      |
      | sample/ | request/ | 15202/ | members |




