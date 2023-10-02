Feature: Get order members
  @smoke
  Scenario Outline: Authenticated user will get specific order members
    Given base order api url will be provided
    When User will input orders '<order>' , '<orderNumber>' , '<members>'
    And user will call order api
    Then It will return order members info and saved in db
    Examples:
      | order  | orderNumber | members |
      | order/ | 21952/      | members |



