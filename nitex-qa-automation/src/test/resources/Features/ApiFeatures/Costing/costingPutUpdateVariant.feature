Feature: costing costing put Api
  @smoke
  Scenario Outline: Authenticated user can update costing put variant data
    Given costing base put api url will be given
    When user will pass '<id>' and '<qp>' and '<itemId>' and '<variant>'
    And user will call the costing put api
    Then costing variant will be updated and saved in db
    Examples:
      | id     | qp             | itemId | variant |
      | 15052/ | update-variant | 15354  | test    |




