package com.sankha.stringcalculator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class StringCalculatorTest {

	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testEmptyString() {
		assertEquals(0, StringCalculator.add(" "));
	}

}
