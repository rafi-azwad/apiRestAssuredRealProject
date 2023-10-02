Feature: Share Collection with valid data
  @smoke
  Scenario Outline: Authenticated user can share collection
    Given base share api url will be provided
    When User will input '<collectionid>' , '<uderId>'
    And user will call the share api
    Then it will be shared and saved in db
    Examples:
      | collectionid | uderId |
      | 39167        | 17452  |