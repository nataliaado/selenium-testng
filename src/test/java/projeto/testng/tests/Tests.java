package projeto.testng.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Tests {

	@BeforeTest
	public void beforeAllTests() {
		System.out.println("EXECUTED ONCE BEFORE ALL TESTS");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Executed before all methods of the class");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Executed before each method");
	}

	@Test(groups = "unitary")
	public void testOne() {
		System.out.println("I'm the first test method");
	}

	@Test(groups = "functional")
	public void testTwo() {
		System.out.println("I'm the second test method");
	}

	@org.testng.annotations.Ignore
	@Test
	public void testThree() {
		System.out.println("I'm the thrid test method");
	}

	@Test(groups = "integration")
	public void testFour() {
		System.out.println("I'm the fourth test method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("Executed after each method");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("Executed after all methods of the class");
	}

	@AfterTest
	public void afterAllTests() {
		System.out.println("EXECUTED ONCE AFTER ALL TESTS");
	}
}
