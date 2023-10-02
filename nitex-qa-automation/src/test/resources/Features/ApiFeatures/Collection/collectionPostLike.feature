Feature: collection post like using Api
  @smoke
  Scenario Outline: Authenticated user can post like using api
    Given collection post like url will be given
    When collection will post like api url endpoints '<col>' and '<id>' and '<endP>'
    Then post like data will be fetched and verified with db
    Examples:
      | col         | id     | endP |
      | collection/ | 39167/ | like |

