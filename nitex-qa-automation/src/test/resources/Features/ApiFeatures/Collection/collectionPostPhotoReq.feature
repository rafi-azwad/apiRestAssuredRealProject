Feature: collection post photo req Api
  @smoke
  Scenario Outline: Authenticated user can post photo req using api
    Given collection post photo req url will be given
    When collection will post photo req api url endpoints '<photography>', '<request>'
    And  collection will also post body with '<productId>', '<requiredDate>'
    Then post photo req data will be fetched and verified with db
    Examples:
      | photography  | request | productId | requiredDate |
      | photography/ | request | 61280     | 2023-05-16   |

