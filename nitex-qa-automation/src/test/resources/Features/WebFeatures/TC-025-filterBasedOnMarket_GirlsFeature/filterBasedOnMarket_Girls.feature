Feature: Filter On collection
  @smoke
  Scenario: Filter based on Market-Girls
    Given user in collection List page
    When User click on market dropdown and select Girls
    Then Collection containing style with the selected market will be displayed in the list