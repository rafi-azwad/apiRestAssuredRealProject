Feature: Filter Based On Mine
  @smoke
  Scenario:
    Given Authenticated User in collection list page
    When User click on Mine filter
    Then Only those collection will be displayed which has been created by the logged in user