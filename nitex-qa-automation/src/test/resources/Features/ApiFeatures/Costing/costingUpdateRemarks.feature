Feature: costing data update costing data Api
  @smoke
  Scenario Outline: Authenticated user can update costing remarks data
    Given costing base api url will be given
    When user will pass '<remarks>' and '<initalcost>'
    And user will call the costing update api
    Then costing remarks will be updated and saved in db
    Examples:
      | remarks | initalcost |
      | test    | 29304       |


