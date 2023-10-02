Feature: Filter in collection
  @smoke
  Scenario Outline: Filter based on status-Buyer request
    Given Authenticated user Collection list page
    When User click on status and click on Search field
    And User insert '<status>' and click on Select box
    Then Collection with the selected Status will be displayed in the list

    Examples:
    |status       |
    |Buyer request|