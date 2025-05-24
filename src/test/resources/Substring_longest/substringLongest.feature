Feature: Longest Substring Without Repeating Characters

 
  Scenario Outline: Validate longest substring output for valid inputs
    Given user is on homepage
    When user enters "<inputString>"
    And clicks on submit
    Then the result should be "<expectedOutput>"

    Examples:
      | inputString | expectedOutput |
      | abcabcbb    | abc            |
      | bbbbb       | b              |
      | abcbdeafg   | cbdeafg        |
      | aab         | ab             |
      | abcdabcde   | abcde          |
      | pwwkew      | wke            |


  Scenario Outline: Validate behavior for edge and invalid inputs
    Given user is on homepage
    When user enters "<inputString>"
    And clicks on submit
    Then the result should be "<expectedOutput>"

    Examples:
      | inputString | expectedOutput |
      |             |                |
      |      " "    |                |
      | !@#$%!      | !@#$%          |
      | a a a       | a a            |
