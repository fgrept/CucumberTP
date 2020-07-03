Feature: Roman Numerals 1

  Scenario: Functional Tests For Roman Numerals 1
    When I generate roman numeral for 1
    Then the result is "I"
   
  Scenario: Functional Tests For Roman Numerals 2
    When I generate roman numeral for 2
    Then the result is "II"
  
  Scenario: Functional Tests For Roman Numerals 3
    When I generate roman numeral for 3
    Then the result is "III"
    
  Scenario: Functional Tests For Roman Numerals 4
    When I generate roman numeral for -1
    Then the result is null
  