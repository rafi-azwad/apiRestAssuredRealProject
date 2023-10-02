Feature: Sorting based on Newest first
  @smoke
  Scenario Outline:
    Given Authenticated user in collection list Page
    When User click on sorting filter and select Newest first
    And User test sorting '<value>'
    Then Collection will be sorted in the list page as Newest first

    Examples:
    |value    |
    |  test   |
