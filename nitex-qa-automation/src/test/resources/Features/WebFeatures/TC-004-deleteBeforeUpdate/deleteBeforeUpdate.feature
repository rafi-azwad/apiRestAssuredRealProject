Feature: Delete design before updating information
  @smoke
  Scenario:
    Given Authenticated user in the collection View page
    When User hove mouse on a design and click on the delete icon of a style
    Then The design will be deleted from the collection
