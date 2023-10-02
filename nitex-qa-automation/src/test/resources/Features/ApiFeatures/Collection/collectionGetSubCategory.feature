Feature: collection get subcategory using Api
  @smoke
  Scenario Outline: Authenticated user can get subcategory
    Given get subcategory api url will be given
    When get subcategory will passdown api url endpoints '<endP1>' and '<endP2>' and '<endP3>'
    Then get subcategory data will be fetched and verified with db
    Examples:
      | endP1     | endP2 | endP3       |
      | category/ | v2/   | subcategory |
