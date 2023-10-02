Feature: Delete an updated design
  @smoke
  Scenario:
    Given Authenticated user in the Collection view page
    When User hover mouse on a design and click on the more icon
    And User click on the Delete button
    Then The style will be deleted from the collection
