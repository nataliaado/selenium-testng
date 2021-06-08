package project.testng.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

@Test(groups="unitary-tests")
public class TestClass2 {

	@BeforeClass
	public void beforeClass() {
		System.out.println("Executed before all tests of the class");
	}

	@Test(groups = "unitary")
	public void testOneClassTwo() {
		System.out.println("Frist test of the class two");
	}

	@Test(groups = "unitary")
	public void testTwoClassTwo() {
		System.out.println("Second test of the class two");
	}

	@Test(groups = "integration")
	public void testThreeClassTwo() {
		System.out.println("Thrid test of the class two");
	}

	@Test(groups = "integration")
	public void testFourClassTwo() {
		System.out.println("Fourth test of the class two");
	}

}
