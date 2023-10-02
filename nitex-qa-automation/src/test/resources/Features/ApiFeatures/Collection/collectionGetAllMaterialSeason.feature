Feature: collection get all material season Api
  @smoke
  Scenario Outline: Authenticated user can view get all material season api
    Given get all material season api url will be given
    When get all material season will passdown api url endpoints '<col>' and '<endP1>' and '<endP2>'
    Then get all material season will be fetched and verified
    Examples:
      | col       | endP1   | endP2 |
      | material/ | season/ | all   |

