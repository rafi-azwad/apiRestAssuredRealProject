Feature: Filter On collection
  @smoke
  Scenario Outline: Filter based on Category-Shirt
    Given user in Collection list page
    When User click on status dropdown and search and Select '<category>'
    Then selected category will be displayed in the list, if not matched then an empty page with a message will be displayed

    Examples:
    |category|
    |Shirt   |