Feature: Clear Search value
  @smoke
  Scenario Outline:
    Given User in Collection list page
    When User click on search option and click on search field and insert '<collectionName>'
    And User Click on the cross icon of the Chip
    Then Search will be cleared and all the collection will be displayed in the list

    Examples:
    |collectionName   |
    |SMMWBR7-SD-001   |