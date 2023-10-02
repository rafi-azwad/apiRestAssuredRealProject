Feature: design product dev comment new post
  @smoke
  Scenario Outline: Authenticated user can fetch data design product dev api
    Given design product dev api will be provided
    When user will hit post product dev api '<p1>' and '<p2>' and '<p3>' and '<p4>'
    And user will hit pro api with body '<text>' and '<artBId>' and '<postPNo>'
    And user will also hit pro api with body '<proId>' and '<pType>' and '<rType1>' and '<rType2>'
    Then this api will be verified with db
    Examples:
      | p1       | p2           | p3       | p4       | text | artBId | postPNo | proId | pType | rType1 | rType2 |
      | product- | development- | comment/ | new-post | re   | 30516  | 1       | 61280 | test  | NITEX  | BUYER  |






