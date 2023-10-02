Feature: Edit Style
  @smoke
  Scenario Outline: Edit Style from nitex studio
    Given Authenticated user can click nitex studio menu
    When user will click arrow icon
    And add design
    And get '<id>'
    Then user can save that design
    Examples:
    |id|
    |10|






