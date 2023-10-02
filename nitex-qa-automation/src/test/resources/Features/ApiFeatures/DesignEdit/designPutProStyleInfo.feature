Feature: design pro style info put api
  @smoke
  Scenario Outline: Authenticated user can put pro style info api
    Given design pro style info put api will be provided
    When user will hit pro style info put api url with '<p1>' and '<p2>' and '<p3>'
    And user will hit pro style info put api body '<id>' and '<name>' and '<ref_Num>'
    And user will also put pro style info body with '<proSubCatId>' and '<proGpId>'
    Then dgn pro style info api will be verified with DB
    Examples:
      | p1       | p2          | p3    | id    | name | ref_Num | proSubCatId | proGpId |
      | product/ | style-info/ | 61280 | 63560 | test | test    | 256         | 1       |

