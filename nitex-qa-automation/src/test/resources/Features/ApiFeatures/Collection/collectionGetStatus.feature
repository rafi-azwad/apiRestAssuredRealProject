Feature: collection get status using Api
  @smoke
  Scenario Outline: Authenticated user can view get status data
    Given get status api url will be given
    When get status will passdown api url endpoints '<col>' and '<endP1>' and '<endP2>' and '<endP3>'
    And  get status will also pass api url endpoints '<endP4>' and '<endP5>' and '<endP6>' and '<endP7>' and '<endP8>'
    Then get status data will be fetched and verified with db
    Examples:
      | col         | endP1          | endP2     | endP3        | endP4         | endP5     | endP6     | endP7 | endP8 |
      | collection/ | search?status= | TECHPACK, | DEVELOPMENT, | PRESENTATION, | COMPLETE, | PUBLISHED |       |       |