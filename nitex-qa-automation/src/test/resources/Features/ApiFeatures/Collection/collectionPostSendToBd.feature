Feature: collection post send to bd Api
  @smoke
  Scenario Outline: Authenticated user can post send using api
    Given collection post send url will be given
    When collection will post like api url endpoints and body '<ed1>', '<ed2>' and '<b1>'
    Then post send data will be verified with db
    Examples:
      | ed1                  | ed2        | b1      |
      | product-development/ | send-to-bd | [42460] |

