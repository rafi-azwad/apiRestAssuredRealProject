Feature: design add edit api presentation download
  @smoke
  Scenario Outline: Authenticated user can fetch data design download link api
    Given design download link api will be provided
    When user will hit post download api '<p1>' and '<p2>' and '<p3>'
    And user will hit download api with body '<cId>' and '<pT>' and '<pList>'
    Then download will be verified
    Examples:
      | p1          | p2        | p3           | cId   | pT           | pList |
      | collection/ | download- | presentation | 30852 | TEMPLATE_ONE | 60456 |





