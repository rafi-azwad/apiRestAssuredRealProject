Feature: Collection personal setting set with valid data
  @smoke
  Scenario Outline: Authenticated personal setting set collection
    Given base personal setting set url will be provided
    When user will input base endPoint '<p1>', '<p2>'
    And user will input body '<key>' , '<value>'
    Then personal setting set and saved in db
    Examples:
      | p1                | p2  | key                | value                                                                                                                                                                                               |
      | personal-setting/ | set | SYSTEM_PREFERENCES | {\"collectionDetailsViewType\":\"LARGE_VIEW\",\"favouritePageViewType\":\"LARGE_VIEW\",\"isShowPrice\":true,\"COLLECTION_PAGE_TAB_VIEW\":\"COLLECTION_TAB\",\"NITEX_PAGE_TAB_VIEW\":\"DESIGN_TAB\"} |