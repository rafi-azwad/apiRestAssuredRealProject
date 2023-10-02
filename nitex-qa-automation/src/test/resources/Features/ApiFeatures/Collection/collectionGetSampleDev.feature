Feature: collection get sample dev Api
  @smoke
  Scenario Outline: Authenticated user can view get sample dev api
    Given get sample dev api url will be given
    When get sample dev will passdown api url endpoints '<endP1>' and '<endP2>' and '<endP3>'
    And  get sample dev will also passdown api url endpoints '<endP4>' and '<endP5>' and '<endP6>'
    Then get sample dev will be fetched and verified
    Examples:
      | endP1   | endP2                | endP3       | endP4  | endP5    | endP6 |
      | sample/ | development-request/ | collection/ | 39167/ | products |       |

