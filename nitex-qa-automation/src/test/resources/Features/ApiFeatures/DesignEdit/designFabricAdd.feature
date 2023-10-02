Feature: design fabric add api
  @smoke
  Scenario Outline: Authenticated user can fetch fabric add api
    Given design fabric add api will be provided
    When user will hit fabric api url with '<p1>' and '<p2>' and '<p3>'
    And user will hit group fabric api body '<mType>' and '<pID>' and '<fType>' and '<gsm>'
    And user will also fabric add and '<c>' and '<faPaIdList>' and '<dEId>'
    Then dgn fabric add will be verified with DB
    Examples:
      | p1        | p2      | p3  | mType       | pID   | fType | gsm | c   | faPaIdList | dEId  |
      | material/ | fabric/ | add | MAIN_FABRIC | 61280 | DENIM | 200 | 407 | 3804,3798  | 58356 |





