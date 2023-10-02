Feature: collection get product search api
  @smoke
  Scenario: Authenticated user can view get search product api
    Given get product search api url will be given
    When get product search will passdown api url endpoints
    Then get product search data will be fetched and verified with db



