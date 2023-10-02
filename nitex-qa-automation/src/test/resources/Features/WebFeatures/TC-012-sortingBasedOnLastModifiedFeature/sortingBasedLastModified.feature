Feature: Sorting based on Last modified
  @smoke
  Scenario:
    Given Authenticated user in collection List Page
    When User click on sorting filter and select Last modified
    Then Collection will be sorted in the list page as Last modified