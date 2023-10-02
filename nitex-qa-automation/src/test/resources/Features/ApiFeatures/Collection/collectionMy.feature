Feature: collection my data using Api
  @smoke
  Scenario Outline: Authenticated user can view my collection data
    Given my collection api url will be given
    When my collection will pass api url endpoints '<col>' and '<endP>'
    Then my collection data will be fetched and verified with db
    Examples:
      | col         | endP |
      | collection/ | my   |
