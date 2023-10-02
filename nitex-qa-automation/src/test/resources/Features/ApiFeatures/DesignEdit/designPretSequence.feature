Feature: design add edit api presentation sequence
  @smoke
  Scenario Outline: Authenticated user can fetch data design sequence link api
    Given design sequence link api will be provided
    When user will hit post sequence api '<p1>' and '<p2>' and '<p3>'
    And user will hit sequence api with body '<cId>' and '<pT>' and '<pList>'
    Then sequence will be verified
    Examples:
      | p1          | p2            | p3       | cId   | pT    | pList |
      | collection/ | presentation- | sequence | 30852 | 60457 | 60556 |





