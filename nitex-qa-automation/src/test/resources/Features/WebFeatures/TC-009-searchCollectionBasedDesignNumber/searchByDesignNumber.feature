Feature: Search collection based on design number
  @smoke
  Scenario Outline:
    Given Authenticated user in collection list page
    When User insert '<designNo>' on search field
    Then The number will be added as chip and search collection will be displayed if not found then it is show an empty page with a message

    Examples:
    |designNo  |
    |MT23-A0289|