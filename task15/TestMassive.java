package home;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class TestMassive {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Hello");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Good Bye");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Start test");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Exit");
	}

	// 1
	@Test(expected = ArithmeticException.class)
	public void testException() throws Exception {
		Massive massive = new Massive();
		massive.MasZero();
	}

	// 2
	@Test
	public void testMaxIndex() {
		Massive massive = new Massive();
		assertTrue(4 == massive.MaxIndex());
	}

	// 3
	@Test(timeout = 1000)
	public void test() {
		Massive massive = new Massive();
		assertEquals(1260, massive.MasMult());
	}

	// 4
	@Test
	public void testMasMult() {
		Massive massive = new Massive();
		assertEquals(1260, massive.MasMult());
	}

	// 5
	@Test
	public void testMinIndex() {
		Massive massive = new Massive();
		assertFalse(4 == massive.MinIndex());
	}

	// 6
	@Ignore
	@Test
	public void testMasPlus() {
	}

	// 7
	@Test
	public void testMasNull() {
		Massive massive = new Massive();
		assertNotNull(massive.mas);
	}

	// 8
	@Ignore
	@Test
	public void failedTest() {
		fail("Tests failed");
	}

	// 9
	@Test
	public void testMas() {
		Massive massive = new Massive();
		int[] expectedMassive = { 6, 3, 5, 2, 7, 1 };		
		assertArrayEquals(expectedMassive, massive.getMas());
	}

	// 10
	@Test
	public void testMasTrue() {
		Massive massive = new Massive();
		assertTrue(1260 == massive.MasMult());
	}
}
