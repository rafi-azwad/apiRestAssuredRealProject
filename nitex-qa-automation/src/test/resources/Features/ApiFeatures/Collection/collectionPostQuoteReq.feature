Feature: collection post quote request Api
  @smoke
  Scenario Outline: Authenticated user can post quote request api
    Given collection post quote request url will be given
    When collection will post quote request api url endpoints '<quote>','<request>'
    And collection will post quote request api body '<productId>','<requiredDate>','<quantity>'
    Then post quote request data will be fetched and verified with db
    Examples:
      | quote  | request | productId | requiredDate | quantity |
      | quote/ | request | 42460     | 2023-05-16   | 500,1000 |


