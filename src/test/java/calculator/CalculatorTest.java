package calculator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	Calculator cal;
	
	@Before
	public void setUp() {
		cal = new Calculator();
	}
	
	@Test
	public void testAddition() {
		long a = cal.addNumbers(10, 20);
		assertEquals(30, a);
	}
	
	@Test
	public void testSubtration() {
		long a = cal.subtractNumbers(10, 20);
		assertEquals(-10, a);
	}
	
	@Test
	public void testMultiplication() {
		long a = cal.multiplyNumbers(10, 20);
		assertEquals(200, a);
	}
	
	@Test
	public void testDivision() {
		long a = cal.divideNumbers(10, 20);
		assertEquals(0, a);
	}

}
