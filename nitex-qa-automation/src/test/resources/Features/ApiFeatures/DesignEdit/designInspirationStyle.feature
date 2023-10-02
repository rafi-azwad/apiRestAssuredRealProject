Feature: design add edit api inspiration style
  @smoke
  Scenario Outline: Authenticated user can fetch data design inspiration style api
    Given design inspiration style api will be provided
    When user will hit inspiration style api '<p1>' and '<p2>' and '<p3>'
    And user will hit inspiration style with body '<b64S>' and '<name>' and '<dMimeT>' and '<dmntType>'
    Then inspiration style will be verified with DB
    Examples:
      | p1       | p2               | p3           | b64S | name                             | dMimeT    | dmntType       |
      | product/ | add-inspiration- | single-style | ""   | 1677241112527_BT22-A2467_--F.png | image/png | PRODUCT_DESIGN |






