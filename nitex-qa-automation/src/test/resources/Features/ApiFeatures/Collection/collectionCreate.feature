Feature: Create Collection with valid data
  @smoke
  Scenario Outline: Authenticated user can create collection
    Given base api url will be provided
    When User will input '<name>' , '<brandId>' , '<session>'
    And user also will add '<tagRequestList>', '<privacy>', '<isNitexCollection>'
    And user will call the api
    Then it will be created successfully and saved in db

    Examples:
      | name              | brandId | session   | tagRequestList | privacy | isNitexCollection |
      | sample collection | 1       | WINTER_23 | Winter         | CUSTOM  | true              |