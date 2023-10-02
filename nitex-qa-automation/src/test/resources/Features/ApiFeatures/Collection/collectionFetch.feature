Feature: collection data fetching through id
  @smoke
  Scenario Outline: Authenticated user can fetch data using get collection api
    Given base api will be provided
    When user will hit get api with '<id>'
    Then user will get data according to id

   Examples:
    |id|
    |12345|
