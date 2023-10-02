Feature: Filter On collection
  @smoke
  Scenario: Filter based on Market-Women
    Given User in Collection List Page
    When User click on market dropdown and select Women
    Then Collection containing style with the selected market will be displayed in the List

