Feature: Filter in collection
  @smoke
  Scenario: Filter based on Development
    Given Authenticated user in collection List page
    When User click on Development filter
    Then Only those collection will be displayed which has style in Development status