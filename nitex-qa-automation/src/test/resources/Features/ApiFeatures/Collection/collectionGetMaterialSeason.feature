Feature: collection get material season Api
  @smoke
  Scenario Outline: Authenticated user can view get material season api
    Given get material season api url will be given
    When get material season will passdown api url endpoints '<col>' and '<endP1>' and '<endP2>'
    And  get material season will also passdown api url endpoints '<endP3>' and '<endP4>'
    Then get material season will be fetched and verified
    Examples:
      | col   | endP1 | endP2   | endP3    | endP4   |
      | enum/ | list/ | info.nitex. | app.materials. | Season |

