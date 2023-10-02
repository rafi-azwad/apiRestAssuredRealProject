Feature: Update design information
  @smoke
  Scenario Outline:
    Given Authenticated user in the collection view Page
    When User click on the update button
    And User select Market and search and select '<category>' and insert '<style_ref>' and '<style_name>'
    And User search and select '<bodyFabric>' and '<fabric>' and '<trims>'
    And User click on the embellishment and insert '<print1>' and search and select '<supplier>' and select Non-wash and Non-Embroidery and click outside
    And User click on the add color and click on solid and search and select '<color>' add click on submit button
    And User click on the add size and fitting type cell
    And User select sizes and search and select '<fittingType>' and '<sizeStandard>' and '<length>' and '<rise>' and '<brandInspiration>' and click on outside and Update button
    Then Information will be updated for the design

    Examples:
    |category  |style_ref |style_name |bodyFabric|fabric   |trims |print1 |supplier|color|fittingType|sizeStandard|length|rise     |brandInspiration|
    |Sweatshirt| SW-M-2023| Half-shirt|viscose   |polyester|button|Natural| kac    |red  |boxy       |EU          |Corp  |High rise|Charli          |