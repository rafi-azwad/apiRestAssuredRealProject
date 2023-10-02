Feature: Search collection based on collection name
  @smoke
  Scenario Outline:
    Given Authenticated user in home page
    When User click on Collection
    And User click on search icon and User insert '<collectionName>' in search field
    Then The name will be added as chip and search collection will be displayed if not found then it is show an empty page with a message

    Examples:
    |collectionName   |
    |Summer collection|