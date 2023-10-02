Feature: Filter in collection
  @smoke
  Scenario Outline: Filter based on status-Presentation
    Given Authenticated user collection list page
    When User click on status and click on search field
    And User insert '<status>' and click on select box
    Then Collection with the selected status will be displayed in the list

    Examples:
    |status      |
    |Presentation|