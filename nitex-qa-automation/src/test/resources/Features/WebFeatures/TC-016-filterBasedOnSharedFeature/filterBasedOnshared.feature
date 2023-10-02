Feature: Filter Based On Shared
  @smoke
  Scenario:
    Given user In collection list Page
    When User click on Shared filter
    Then Only those collection will be displayed which has been Shared with the logged in user