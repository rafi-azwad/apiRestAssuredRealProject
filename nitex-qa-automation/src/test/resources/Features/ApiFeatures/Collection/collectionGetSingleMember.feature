Feature: collection get single member using Api
  @smoke
  Scenario Outline: Authenticated user can view get single member
    Given get single member api url will be given
    When get single member will passdown api url endpoints '<col>' and '<endP1>' and '<endP2>'
    Then get single member data will be fetched and verified with db
    Examples:
      | col         | endP1  | endP2   |
      | collection/ | 39208/ | members |
