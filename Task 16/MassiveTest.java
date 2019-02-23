package core;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertNotSame;

import static org.testng.Assert.assertTrue;
import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class MassiveTest {
	Massive massive;

	@DataProvider(name = "dataForSumNumbers")
	public Object[][] getSumNumbers() {

		return new Object[][] { { 3, 5, 8 }, { 0, 0, 0 }, { 2, 4, 6 }, };
	}

	@BeforeSuite
	public void beforeSuite() {
		massive = new Massive();
		System.out.println("Start Testing");

	}

	@AfterSuite
	public void afterSuite() {
		massive = null;
		System.out.println("The End Testing");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("After Class");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("After Test");
	}

	@Test(enabled = false)
	public void testMassiveIsNull() {
		Assert.assertNull(massive, "Massive is not null");
	}

	@Test
	public void testRecordMasRandomlyNotNull() {
		int size = 5;
		Assert.assertNotNull(massive.recordMasRandomly(size), "Massive is not created");
	}

	@Test
	public void testMassiveIsNotNull() {
		Assert.assertNotNull(massive, "Object Massive is null");
	}

	@Test
	public void testMassiveNotSame() {
		Massive massive2 = new Massive();
		Massive massive3 = new Massive();
		assertNotSame(massive2, massive3, "Massive is same!");
	}

	@Test(expectedExceptions = NegativeArraySizeException.class)
	public void testRecordMasRandoml() {
		int size = -1;
		massive.recordMasRandomly(size);
	}

	@Test(enabled = false)
	public void testGetReverseMasNotEquals() {
		int[] anyMas = { 1, 3, 4, 2, 1 };
		int[] revertMas = massive.getReverseMas(anyMas);
		assertNotEquals(revertMas, anyMas, "Array equals revert Array");
	}

	@Test
	public void testGetReverseMasEquals() {
		int[] anyMas = { 1, 3, 4, 2, 1 };
		int[] revertMas = massive.getReverseMas(anyMas);
		assertEquals(anyMas, revertMas, "Array equals revert Array");
	}

	@Test
	public void testGetMasMultiplyEquals() {
		int[] anyMas = { 1, 3, 4, 2, 1 };
		int[] expected_result = { 2, 6, 8, 4, 2 };
		int[] actual_result = massive.getMasMultiply(anyMas);
		assertEquals(actual_result, expected_result, "Results isn't equals");
	}

	@Test
	public void testGetMasMultiplyNotEquals() {
		int[] anyMas = { 1, 3, 4, 2, 1 };
		int[] expected_result = { 5, 6, 8, 4, 4 };
		int[] actual_result = massive.getMasMultiply(anyMas);
		assertNotEquals(actual_result, expected_result, "Results equals");
	}

	@Test
	public void testGetMasMaxElementEquals() {
		int[] anyMas = { 1, 3, 4, 2, 1 };
		int expected_result = 4;
		int actual_result = massive.getMasMax(anyMas);
		assertEquals(actual_result, expected_result, "Max value isn't correct!");
	}

	@Test
	public void testGetMasMaxElementNotEquals() {
		int[] anyMas = { 1, 3, 4, 2, 1 };
		int expected_result = 3;
		int actual_result = massive.getMasMax(anyMas);
		assertNotEquals(actual_result, expected_result, "Max value isn't correct!");
	}

	@Test
	public void testTrueSumOfElements() {
		int[] anyMas = { 5, 3, 1, 4, 6, 2 };
		int actual_result = massive.getSumOfElements(anyMas);
		int expected_result = 21;
		assertTrue(actual_result == expected_result, "Sum of Elements isn't correct");

	}

	@Test
	public void testFalseSumofElements() {
		int[] anyMas = { 5, 3, 1, 4, 6, 2 };
		int actual_result = massive.getSumOfElements(anyMas);
		int expected_result = 25;
		assertFalse(actual_result == expected_result, "Sum of Elements isn't correct");
	}

	@Test
	public void testGetMasMinIndex() {
		int[] anyMas = { 1, 3, 4, 2, 5 };
		int expected_result = 0;
		int actual_result = massive.getMasMinIndex(anyMas);
		assertEquals(actual_result, expected_result, "Min index value isn't correct!");
	}

	@Test
	public void testGetMasMaxIndex() {
		int[] anyMas = { 1, 3, 4, 2, 5 };
		int expected_result = 4;
		int actual_result = massive.getMasMaxIndex(anyMas);
		assertEquals(actual_result, expected_result, "Max index value isn't correct!");
	}

	@Test(expectedExceptions = ArithmeticException.class)
	public void testeachElementDividedNext() {
		int[] anyMas = { 1, 3, 4, 2, 1 };
		massive.eachElementDividedNext(anyMas);
	}

	@Test(enabled = false)
	public void testIgnore() {
		System.out.println("This testIgnore!");
	}

	@Test
	public void testMasProduct() {
		int[] anyMas = { 5, 3, 1 };
		int actual_result = massive.getMasProduct(anyMas);
		int expected_result = 15;
		assertEquals(actual_result, expected_result, "Product  isn't correct");
	}

	@Test
	public void testFalseMasProduct() {
		int[] anyMas = { 5, 3, 1, 2, 1 };
		int actual_result = massive.getMasProduct(anyMas);
		int expected_result = 50;
		assertNotEquals(actual_result == expected_result, "Product  isn't correct");

	}

	@Test
	public void testNumberInSquare() {
		int actual_result = massive.numberInSquare(1);
		int expected_result = 1;
		assertEquals(actual_result, expected_result, "These aren't correct numbers");
	}

	@Test
	public void testSumNumbers() {
		int actual_result = massive.sumNumbers(3, 5);
		int expected_result = 8;
		assertEquals(actual_result, expected_result);
	}

	@Test
	public void testCheckZeroElementsInMas() {
		int[] anyMas = { 5, 3, 0, 2 };
		int actual_result = massive.checkZeroElementsInMas(anyMas);
		int expected_result = 1;
		assertEquals(actual_result, expected_result, "Zero Elements is not equals expected result ");
	}

	@Test(dataProvider = "dataForSumNumbers")
	public void sumNumbersTest(int num, int num2, int expected) {
		Assert.assertEquals(massive.sumNumbers(num, num2), expected);
	}

	@Test(enabled = false)
	public void testAllAsserts() {
		fail("Test failed!");
	}
}
