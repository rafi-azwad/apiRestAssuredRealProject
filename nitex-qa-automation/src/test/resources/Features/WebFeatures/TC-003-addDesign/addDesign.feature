Feature: Add designs to the collection
  @smoke
  Scenario:
    Given Authenticated user in the collection view page
    When User click on the multiple style button
    And User click on the upload area and select multiple style from the directory and click on the submit button
    Then Multiple style will be added to the collection