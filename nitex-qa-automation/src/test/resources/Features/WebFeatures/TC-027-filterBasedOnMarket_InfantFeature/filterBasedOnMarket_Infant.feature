Feature: Filter On collection
  @smoke
  Scenario: Filter based on Market-Infant
    Given Authenticated User in Collection List Page
    When User click on market dropdown and select Infant
    Then Collection containing style with the selected market will be displayed in the list, if not matched then an empty page with a message will be displayed

