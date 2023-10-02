Feature: Filter in collection
  @smoke
  Scenario: Filter based on Complete & Published
    Given User in Collection List page
    When User click on Complete & Published filter
    Then Only those collection will be displayed which has style in Complete & Published status