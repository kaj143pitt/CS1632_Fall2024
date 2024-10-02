package edu.pitt.cs;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

public class ValueStepDefinitions {
	Value v;

	@Given("a Value")
	public void setValue() {
		v = new Value();
	}

	@When("I call incVal {int} times")
	public void incVal(int n) {
		for(int i = 0; i < n; i += 1) {
			v.incVal();
		}
	}

	@Then("getVal returns {int}")
	public void verifyVal(int val) {
		assertEquals(val, v.getVal());
	}
}
