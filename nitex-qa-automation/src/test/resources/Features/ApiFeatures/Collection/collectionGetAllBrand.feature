Feature: collection get all brand Api
  @smoke
  Scenario Outline: Authenticated user can view get all brand api
    Given get all brand api url will be given
    When get all brand will passdown api url endpoints '<endP1>' and '<endP2>'
    Then get all brand will be fetched and verified
    Examples:
      | endP1  | endP2 |
      | brand/ | all   |


