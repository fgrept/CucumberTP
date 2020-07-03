package romanNumerals;

import java.util.HashMap;

public class RomanNumeralGenerator {

    public String generateRomanNumber(int inputInt){
        switch (inputInt) {
		case 1:
			return "I";
		case 2:
			return "II";
		case 3:
			return "III";
		case 4:
			return "IV";
		default:
			return null;
		}

    }

}
