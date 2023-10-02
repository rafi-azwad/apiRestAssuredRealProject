Feature: design add edit document group add api
  @smoke
  Scenario Outline: Authenticated user can fetch design document group add api
    Given design group add api will be provided
    When user will hit the api url with '<p1>' and '<p2>' and '<p3>'
    And user will hit group add api body '<n>' and '<dcMType>' and '<dG>' and '<dTy>'
    And user will also add and '<b64>' and '<pId>' and '<siz>'
    Then dgn doc group will be verified with DB
    Examples:
      | p1       | p2              | p3  | n       | dcMType   | dG              | dTy         | b64                     | pId   | siz    |
      | product/ | document-group/ | add | 4-D.png | image/png | PHYSICAL_SAMPLE | FRONT_IMAGE | data:image/png;base64 c | 61280 | 399830 |






