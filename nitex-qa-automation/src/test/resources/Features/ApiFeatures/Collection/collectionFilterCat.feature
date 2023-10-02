Feature: collection Filter Category using Api
  @smoke
  Scenario Outline: Authenticated user can filter category data
    Given filter category api url will be given
    When filter category will pass api url endpoints '<col>' and '<endP>'
    Then filter category data will be fetched and verified with db
    Examples:
      | col         | endP              |
      | collection/ | filter-categories |
