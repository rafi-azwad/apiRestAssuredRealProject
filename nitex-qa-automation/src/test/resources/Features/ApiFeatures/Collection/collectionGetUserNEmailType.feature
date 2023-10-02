Feature: collection get emailNuser using Api
  @smoke
  Scenario Outline: Authenticated user can view get emailNuser
    Given get emailNuser api url will be given
    When get emailNuser will passdown api url endpoints '<col>' and '<endP1>' and '<endP2>' and '<endP3>'
    Then get emailNuser data will be fetched and verified with db
    Examples:
      | col   | endP1                             | endP2                | endP3          |
      | user/ | find-list-by-email-and-user-type? | email=b&isNitexUser= | true&brandId=1 |

