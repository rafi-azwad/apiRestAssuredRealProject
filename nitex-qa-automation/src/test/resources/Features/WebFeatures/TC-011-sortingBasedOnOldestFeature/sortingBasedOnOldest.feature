Feature: Filter in Collection
  @smoke
  Scenario: Sorting based on Oldest first
    Given Authenticated User in Collection list page
    When User click on sorting filter and select Oldest first
    Then Collection will be sorted in the list page as Oldest first