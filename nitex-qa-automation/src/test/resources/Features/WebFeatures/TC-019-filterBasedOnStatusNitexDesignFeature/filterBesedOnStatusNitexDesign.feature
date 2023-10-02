Feature: Filter in collection
  @smoke
  Scenario Outline: Filter based on Status-Nitex design
    Given Authenticated User in Collection List page
    When User click on status dropdown and search and select '<status>'
    Then Only the collection with Nitex design status will be displayed in the list

    Examples:
    |status      |
    |Nitex design|