Feature: design add edit api presentation
  @smoke
  Scenario Outline: Authenticated user can fetch data design presentation link api
    Given design presentation link api will be provided
    When user will hit post presentation api '<p1>' and '<p2>' and '<p3>'
    And user will hit presentation api with body '<cId>' and '<pT>' and '<pList>'
    Then link will be verified
    Examples:
      | p1          | p2   | p3                | cId   | pT           | pList |
      | collection/ | get- | presentation-link | 30852 | TEMPLATE_ONE | 60456 |





