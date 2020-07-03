package romanNumerals;


import romanNumerals.RomanNumeralGenerator;
import static org.assertj.core.api.Assertions.*;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CucumberStepDefs {

    String result;
    RomanNumeralGenerator myRomanNumeralGenerator = new RomanNumeralGenerator();
    
    @When("I generate roman numeral for {int}")
    public void i_generate_roman_numeral_for(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
    	result = myRomanNumeralGenerator.generateRomanNumber(int1);
    }

    @Then("the result is {string}")
    public void the_result_is(String string) {
        // Write code here that turns the phrase above into concrete actions
    	assertThat(string).isEqualTo(result);
    }
	
	@Then("the result is null")
	public void the_result_is_null() {
	    // Write code here that turns the phrase above into concrete actions
		assertThat(result).isEqualTo(null);
	}



    
}
