Feature: design add edit api product v2
  @smoke
  Scenario Outline: Authenticated user can fetch data design add v2 product api
    Given design add v product api will be provided
    When user will hit post design api v '<p1>'
    And user will hit v api with body '<documentId>' and '<front>' and '<documentId>'
    And user will also hit v api with body '<productSubCategoryId>' and '<name>' and '<productGroupId>' and '<collectionId>'
    Then user will get design product v and verified with DB
    Examples:
      | p1  | documentId | front | productSubCategoryId | name  | productGroupId | collectionId |
      | add | 159486     | true  | 58                   | SHIRT | 1              | 39167        |




