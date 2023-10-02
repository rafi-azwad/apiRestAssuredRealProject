Feature: Create collection
  @smoke
  Scenario Outline:
    Given Authenticated user is in the collection list page
    When User click in the add collection button
    And User insert '<collectionName>' and '<search>' and select brand and select season and click on submit button
    Then Collection will be created

    Examples:
    |collectionName|   search   |
    |     TW23      |Hermes paris|