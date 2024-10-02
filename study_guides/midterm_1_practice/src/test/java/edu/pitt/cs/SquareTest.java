package edu.pitt.cs;

import static org.junit.Assert.*;
import org.mockito.*;

import org.junit.Test;

public class SquareTest {

	/**
	 * Write an integration test for setSquared.
	 * 
	 * <pre>
	 * Preconditions: A new Square square is created
	 *                A new Number number is created
	 * Execution Steps: Call square.setSquared(number, 3)
	 * PostConditions: The value of number is set to 9
	 * </pre>
	 */
	@Test
	public void testSetSquaredIntegration() {
		Square s = new Square();
		Number n = new Number();

		s.setSquared(n, 3);

		assertEquals(9, n.getVal());
	}

	/**
	 * Write a unit test for setSquared.
	 * 
	 * <pre>
	 * Preconditions: A new Square square is created
	 *                A new Number number is created
	 * Execution Steps: Call square.setSquared(number, 3)
	 * PostConditions: The value of number is set to 9
	 * </pre>
	 */
	@Test
	public void testSetSquaredUnit() {
		Square s = new Square();
		Number n = Mockito.mock(Number.class);

		s.setSquared(n, 3);
		Mockito.verify(n, Mockito.times(1)).setVal(9);
	}
}
