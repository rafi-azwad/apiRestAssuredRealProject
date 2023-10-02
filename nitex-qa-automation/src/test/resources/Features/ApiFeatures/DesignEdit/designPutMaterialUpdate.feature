Feature: design put material update api
  @smoke
  Scenario Outline: Authenticated user can put material update api
    Given design material update put api will be provided
    When user will hit material update put api url with '<p1>' and '<p2>' and '<p3>'
    And user will hit material update put api body '<id>' and '<libId>' and '<rf_Num>' and '<name1>' and '<m_Type>' and '<c_details>'
    And user will also material update put body with '<idd>' and '<code>' and '<hexCode>' and '<name2>'
    And user will also add material update put body with '<panColorId>' and '<cTy>' and '<repBy>'
    Then dgn material update put api will be verified with DB
    Examples:
      | p1        | p2      | p3    | id    | libId | rf_Num | name1 | m_Type | c_details | idd   | code        | hexCode | name2          | panColorId | cTy   | repBy |
      | material/ | update/ | 61280 | 58357 | 58115 | test   | test  | test   | test      | 72306 | 17-1112 TCX | #9b8f7f | Weathered Teak | 104        | SOLID | test  |
