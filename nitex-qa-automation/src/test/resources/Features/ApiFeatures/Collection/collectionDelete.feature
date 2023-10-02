Feature: collection data delete through id
  @smoke
  Scenario Outline: Authenticated user can fetch data using delete api
    Given base api will be provided for delete
    When user will hit delete api with '<id>'
    Then user will delete collection according to id

   Examples:
    |id|
    |12345|
