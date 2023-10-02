Feature: collection get download using Api
  @smoke
  Scenario Outline: Authenticated user can view get download
    Given get download api url will be given
    When get download will passdown api url endpoints '<col>' and '<endP1>' and '<endP2>' and '<endP3>'
    Then get download data will be fetched and verified with db
    Examples:
      | col         | endP1            | endP2         | endP3 |
      | collection/ | download-report? | collectionId= | 39167 |

