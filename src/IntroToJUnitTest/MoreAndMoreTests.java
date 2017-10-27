package IntroToJUnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Uncomment each test and then write the method to make it pass.
 **/

public class MoreAndMoreTests {
	int x;
	boolean yesNo;
	boolean noYes;
	String multiplyX;

	@Test
	public void MultTest() {

		assertEquals("10 x 0 = 0", multiply(10, 0));
		assertEquals("10 x 10 = 100", multiply(10, 10));
		assertEquals("8 x 11 = 88", multiply(8, 11));
	}

	private Object multiply(int i, int j) {
		x = i * j;
		multiplyX = (Integer.toString(i) + " x " + Integer.toString(j) + " = " + Integer.toString(x));
		System.out.println(multiplyX);
		return multiplyX;
	}

	@Test
	public void PrimeTest() {

		assertTrue(isPrime(3));
		assertTrue(isPrime(5));
		assertTrue(isPrime(541));
		assertFalse(isPrime(4));
		assertFalse(isPrime(12));
		assertFalse(isPrime(527));

	}

	private boolean isPrime(int i) {
		for (int j = 2; j < i; j++) {

			if ((i % j) == 0) {
				System.out.println(Integer.toString(i) + "not prime");
				yesNo = false;
				j = i;
			} else {
				System.out.println(Integer.toString(i) + "primeTest");
				yesNo = true;
			}
			/**
			 * if(yesNo = false) {
			 * 
			 * }else if(yesNo = true) { noYes = true; }
			 */
		}
		return yesNo;

	}

	@Test
	public void SquareTest() {

		assertTrue(isSquare(4));
		assertTrue(isSquare(144));
		assertTrue(isSquare(64));
		assertTrue(isSquare(10201));
		assertTrue(isSquare(1));
		assertFalse(isSquare(3));
		assertFalse(isSquare(22));
		assertFalse(isSquare(143));

	}

	private boolean isSquare(int i) {
		for (int j = 1; j <= i; j++) {
			if ((Math.sqrt(i)) == (j)) {
				j = i + 1;
				noYes = true;
				System.out.println("root");
			} else {
				noYes = false;
			}
		}
		return noYes;
	}
	 @Test
	 public void CubeTest() {
	
	 assertTrue(isCube(27));
	 assertTrue(isCube(216));
	 assertTrue(isCube(729));
	 assertTrue(isCube(1));
	 assertFalse(isCube(3));
	 assertFalse(isCube(22));
	 assertFalse(isCube(143));
	
	 }

	private boolean isCube(int i) {
		for (int j = 1; j <= i; j++) {
		if ((Math.cbrt(i)) == (j)) {
			j = i + 1;
			noYes = true;
			System.out.println("root");
		} else {
			noYes = false;
		}
	}
	return noYes;
	}
}
