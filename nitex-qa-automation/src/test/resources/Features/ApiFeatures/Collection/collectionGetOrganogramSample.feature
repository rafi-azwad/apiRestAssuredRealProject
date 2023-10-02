Feature: collection get organogram using Api
  @smoke
  Scenario Outline: Authenticated user can view get organogram
    Given get organogram api url will be given
    When get organogram will passdown api url endpoints '<endP1>' and '<endP2>' and '<endP3>'
    Then get organogram data will be fetched and verified with db
    Examples:
      | endP1       | endP2              | endP3        |
      | organogram/ | operational-units/ | SAMPLE_HOUSE |

