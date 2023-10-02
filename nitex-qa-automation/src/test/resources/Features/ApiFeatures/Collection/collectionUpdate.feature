Feature: collection data update using Api
  @smoke
  Scenario Outline: Authenticated user can update data
    Given base api url will be given
    When user will pass collection_id through '<id>'
    Then data will be updated and saved in db
    Examples:
    |id|
    |21333|

