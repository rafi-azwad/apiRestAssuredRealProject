Feature: Clear a Sorting Option
  @smoke
  Scenario:
    Given User in collection list page
    When User click on sorting filter and select last modified
    And User click on the cross icon of the Chip
    Then Sorting will be cleared and it will apply the default sorting option