Feature: collection post unpin using Api
  @smoke
  Scenario Outline: Authenticated user can post unpin using api
    Given collection post unpin url will be given
    When collection will post unpin api url endpoints '<col>' and '<id>' and '<endP>'
    Then post unpin data will be fetched and verified with db
    Examples:
      | col         | id     | endP |
      | collection/ | 39167/ | unpin  |

