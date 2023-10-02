Feature: collection get fabric type Api
  @smoke
  Scenario Outline: Authenticated user can view get fabric type api
    Given get fabric type api url will be given
    When get fabric type will passdown api url endpoints '<col>' and '<endP1>' and '<endP2>'
    And  get fabric type will also passdown api url endpoints '<endP3>' and '<endP4>'
    Then get fabric type will be fetched and verified
    Examples:
      | col   | endP1 | endP2   | endP3    | endP4   |
      | enum/ | list/ | info.nitex. | app.materials. | FabricType |

