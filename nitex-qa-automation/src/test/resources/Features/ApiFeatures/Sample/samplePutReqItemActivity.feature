Feature: sample put req item activity api
  @smoke
  Scenario Outline: Authenticated user put req item activity api
    Given design sample put req item activity api will be provided
    When user will hit the sample put req item activity api url with '<p1>', '<p2>', '<p3>' and '<p4>'
    And user will provide sample put req item activity body '<activityType>', '<assignedTo>', '<assignedName>', '<requiredDate>' and '<sampleItemId>'
    And user will receive put req item activity data according to the api
    Then sample put req item activity api will be verified with DB
    Examples:
      | p1      | p2       | p3     | p4                   | activityType | assignedTo | assignedName | requiredDate | sampleItemId |
      | sample/ | request/ | 15202/ | update-item-activity | PATTERN      | 11755      | Shahin       | 2023-05-16   | 15702        |






