Feature: collection post sample request using Api
  @smoke
  Scenario Outline: Authenticated user can post sample request using api
    Given collection post sample request url will be given
    When collection will post sample request api url endpoints '<ep1>', '<ep2>', '<ep3>', '<ep4>'
    And  collection will post sample request api url body '<dev>', '<pId>', '<rDate>' and '<opsUnitId>'
    Then post sample request data will be fetched and verified with db
    Examples:
      | ep1     | ep2      | ep3         | ep4   | dev   | pId   | rDate      | opsUnitId |
      | sample/ | request/ | collection/ | 30852 | false | 42460 | 2023-05-16 | 1         |


