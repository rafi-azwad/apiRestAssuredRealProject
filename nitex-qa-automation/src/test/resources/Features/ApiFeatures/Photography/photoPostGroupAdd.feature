Feature: photography post group add api
  @smoke
  Scenario Outline: Authenticated user post photography group add api
    Given photography group add api will be provided
    When user will hit the photography group add api url with '<p1>', '<p2>', '<p3>'
    And user will pass body photography group add according to the api '<name>', '<dType>', '<dGroup>', '<docType>'
    And user will also pass body photography group add according to the api '<base64Str>', '<pId>', '<size>'
    Then photography group add api will be verified with DB
    Examples:
      | p1       | p2              | p3  | name                           | dType     | dGroup          | docType     | base64Str             | pId   | size   |
      | product/ | document-group/ | add | 1678945045486_MB23-A0341-F.png | image/png | PHYSICAL_SAMPLE | FRONT_IMAGE | data:image/png;base64 | 33611 | 766515 |






