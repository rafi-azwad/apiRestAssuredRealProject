Feature: photography post upload api
  @smoke
  Scenario Outline: Authenticated user post photography upload api
    Given photography upload api will be provided
    When user will hit the photography upload api url with '<p1>', '<p2>', '<p3>'
    And user will pass upload body parameters according to the api '<name>', '<dType>', '<docType>' and '<base64Str>'
    Then photography upload api will be verified with DB
    Examples:
      | p1       | p2     | p3                       | name                            | dType      | docType             | base64Str              |
      | product/ | 33611/ | upload-bulk-presentation | 1678945037253_MB23-A0341-FT.jpg | image/jpeg | PRESENTATION_UPLOAD | data:image/jpeg;base64 |





