package core;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class MassiveTests {
	Massive massive;

	@BeforeClass
	public static void beforeClass() throws Exception {
		System.out.println("Start MassiveTests.class");
	}

	@Before
	public void initTest() throws Exception {
		massive = new Massive();
	}

	@After
	public void afterTest() throws Exception {
		massive = null;
	}

	@AfterClass
	public static void afterClass() throws Exception {
		System.out.println("End MassiveTests.class");
	}

	@Test
	public void testReverseMas() {

		int[] anyMas = { 5, 3, 1, 4, 6, 2 };
		int[] revertMas = massive.recordReverseMas(anyMas);
		assertArrayEquals("These arrays are not identical", revertMas, anyMas);
	}

	@Test
	public void testSumofElements() {

		int[] anyMas = { 5, 3, 1, 4, 6, 2 };

		int actual_result = massive.getSumofElements(anyMas);
		int expected_result = 21;

		assertEquals("Sum of elements is not correct", actual_result, expected_result);
	}

	@Test
	public void testMasProduct() {

		int[] anyMas = { 5, 3, 1, 2, 1 };
		int actual_result = massive.getMasProduct(anyMas);
		int expected_result = 30;

		assertEquals("Product of elements is not correct", actual_result, expected_result);
	}

	@Test
	public void testWithAssertThatMasProduct() {

		int[] anyMas = { 5, 3, 1, 2, 1 };
		int actual_result = massive.getMasProduct(anyMas);
		int expected_result = 30;

		assertThat(actual_result, is(expected_result));
	}

	@Test

	public void testMasMin() {

		int[] anyMas = { 5, 3, 1, 4, 6, 8 };

		int actual_result = massive.getMasMin(anyMas);
		int expected_result = 1;

		assertEquals("Min value is correct", actual_result, expected_result);

	}

	@Test(expected = ArithmeticException.class)
	public void testEachElementDividedNext() {
		int[] anyMas = { 5, 3, 1, 4, 6, 8 };
		massive.eachElementDividedNext(anyMas);
	}

	@Test
	public void testMassiveIsNull() {
		assertNotNull("Object Massive is null", massive);
	}

	@Test
	public void testAnyMasIsNotNull() {
		int[] anyMas = { 5, 3, 1, 4, 6, 8 };
		assertNotNull("Array is null", anyMas);
	}

	@Test
	public void testElementInMasWithAssertT() {
		int[] anyMas = { 5, 3, 1, 4, 6, 8 };
		assertTrue("No!", anyMas[1] == 3);
	}

	@Test
	public void testElementInMasWithAssertF() {
		int[] anyMas = { 5, 3, 1, 4, 6, 8 };
		assertFalse("Yes!", anyMas[0] == 4);
	}

	@Ignore
	@Test
	public void testIgnore() {
		System.out.println("This testIgnore!");
	}

}
