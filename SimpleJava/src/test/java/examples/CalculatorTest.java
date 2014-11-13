package examples;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Calculator Tests
 * 
 * @author Glenn
 *
 */
public class CalculatorTest {

	/**
	 * Constructor
	 */
	public CalculatorTest() {
		super();
	}

	@Test
	/**
	 * Tests successful invocation of the sum() method.
	 */
	public void testSum() {
		final Calculator calculator = new Calculator();
		final int answer = calculator.sum(2, 3);

		assertEquals(5, answer);
	}

}
