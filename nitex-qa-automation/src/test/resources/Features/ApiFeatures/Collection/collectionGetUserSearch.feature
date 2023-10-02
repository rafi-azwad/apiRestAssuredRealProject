Feature: collection get user search Api
  @smoke
  Scenario Outline: Authenticated user can view get user search api
    Given get user search api url will be given
    When get user search will passdown api url endpoints '<col>' and '<endP1>' and '<endP2>'
    And  get user search will also passdown api url endpoints '<endP3>' and '<endP4>'
    Then get user search will be fetched and verified with db
    Examples:
      | col   | endP1   | endP2   | endP3    | endP4   |
      | user/ | search? | page=0& | size=15& | search= |

