Feature: Filter On collection
  @smoke
  Scenario Outline: Filter based on Category-Jacket
    Given Authenticated user in Collection list Page
    When User click on category dropdown and search and select '<category>'
    Then Collection containing style with the selected category will be displayed in the list, if not matched then an empty page with a message will be displayed

    Examples:
    |category|
    |Jacket  |