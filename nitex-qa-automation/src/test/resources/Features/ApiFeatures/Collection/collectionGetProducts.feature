Feature: collection get products using Api
  @smoke
  Scenario Outline: Authenticated user can view get products
    Given get products api url will be given
    When get products will passdown api url endpoints '<col>' and '<endP1>' and '<endP2>'
    Then get products data will be fetched and verified with db
    Examples:
      | col         | endP1     | endP2   |
      | collection/ | products/ | 39167 |
