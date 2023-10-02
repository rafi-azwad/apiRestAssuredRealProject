Feature: Filter On collection
  @smoke
  Scenario Outline: Filter based on Category-Zip polo
    Given user in collection list page
    When User Click on status dropdown and search and select '<category>'
    Then selected category will be displayed in the list, if not matched then an empty Page with a message will be displayed

    Examples:
    |category|
    |Zip polo|