Feature: collection post bulk request using Api
  @smoke
  Scenario Outline: Authenticated user can post bulk req using api
    Given collection post bulk req url will be given
    When collection will post bulk req api url endpoints '<ep1>', '<ep2>', '<ep3>'
    And user will provide '<proId>' and '<rdate>' as body parameters
    Then post bulk req data will be fetched and verified with db
    Examples:
      | ep1              | ep2  | ep3      | proId | rdate      |
      | initial-costing/ | bulk | -request | 64856 | 2023-08-24 |


