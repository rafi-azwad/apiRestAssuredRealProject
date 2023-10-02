Feature: user login with valid credential
  @smoke
  Scenario Outline:
    Given base url will provide
    When user will enter  '<password>' and '<email>'
    Then it will redirect to dashboard
    Examples:
    |password| email|
    |Tan12#$ |automation@nitex.info|
