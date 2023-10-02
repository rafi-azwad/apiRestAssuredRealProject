Feature: collection post pin using Api
  @smoke
  Scenario Outline: Authenticated user can post pin using api
    Given collection post pin url will be given
    When collection will post pin api url endpoints '<col>' and '<id>' and '<endP>'
    Then post pin data will be fetched and verified with db
    Examples:
      | col         | id     | endP |
      | collection/ | 39167/ | pin  |

