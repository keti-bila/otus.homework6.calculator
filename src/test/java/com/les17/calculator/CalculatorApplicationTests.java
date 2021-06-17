package com.les17.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

//@SpringBootTest
class CalculatorApplicationTests {

	private Calculator calculator;

	@BeforeEach
	public void setUp() {
		calculator = new Calculator();
	}

	@Test
	@DisplayName("test sum")
	void test1() {
		Integer first = 3;
		Integer second = 7;
		Integer expected = 10;

		assert calculator.sum(first, second).equals(expected);
	}

	@Test
	@DisplayName("test subtraction")
	void test2() {
		Integer first = 12;
		Integer second = 4;
		Integer expected = 8;

		assert calculator.subtraction(first, second).equals(expected);
	}

	@Test
	@DisplayName("test multiply")
	void test3() {
		Integer first = 3;
		Integer second = 4;
		Integer expected = 12;

		assert calculator.multiply(first, second).equals(expected);
	}

	@Test
	@DisplayName("test division")
	void test4() {
		Integer first = 12;
		Integer second = 4;
		Integer expected = 3;

		assert calculator.division(first, second).equals(expected);
	}

	@Test
	@DisplayName("test exponentiation")
	void test5() {
		Double first = 3D;
		Double second = 4D;
		Double expected = 81D;

		assert calculator.exponentiation(first, second).equals(expected);
	}

	@Test
	@DisplayName("test rootOfNumber")
	void test6() {
		Double first = 81D;
		Double expected = 9D;

		assert calculator.rootOfNumber(first).equals(expected);
	}
}
