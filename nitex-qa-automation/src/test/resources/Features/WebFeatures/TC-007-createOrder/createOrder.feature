Feature: Create Order
  @smoke
  Scenario Outline:
    Given Authenticated User in the collection view page
    When User hover mouse and select design and click on place order button
    And User insert '<orderTitle>' and search and select '<buyer>' and insert '<poNumber>' and select PO receive date and select ETD and upload PO
    And User click on add size button and select sizes and click on update button
    And User click on the add color button and click on Solid and search and select '<color>' and click on submit
    And User click on the add color and click on MULTI and search and select '<colour>' add click on submit button
    And User click on the qty cell and insert '<qty>' against the color and size and user insert '<unitPrice>'
    And User click on the submit button and Click on place order
    Then Order will be placed successfully

    Examples:
    |orderTitle|buyer                  |poNumber|color|colour |qty|unitPrice|
    |Order2023 |rashed1.nitex@gmail.com|PO-2023 |Green|violate|500|   7     |