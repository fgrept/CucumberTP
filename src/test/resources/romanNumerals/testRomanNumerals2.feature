Feature: Roman Numerals 2

  Scenario Outline: Functional Tests For Roman Numerals 2
    When I generate roman numeral for <numberArabic>
    Then the result is "<numberRoman>"
  Examples:
	 | numberArabic 	| numberRoman	|
	 | 1			 	| I 			|
	 | 2			 	| II 			|
	 | 3			 	| III 			|
	 | 4			 	| IV 			|  
  