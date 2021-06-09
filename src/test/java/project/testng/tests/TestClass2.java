package project.testng.tests;

import org.testng.SkipException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.google.inject.internal.ErrorsException;

@Test(groups = "unitary-tests")
public class TestClass2 {

	@BeforeClass
	public void beforeClass() {
		System.out.println("Executed before all tests of the class");
	}

	@Test(groups = "unitary")
	public void testOneClassTwo() {
		System.out.println("Frist test of the class two");
		throw new SkipException("Skipped test");
	}

	@Test(groups = "unitary")
	public void testTwoClassTwo() {
		System.out.println("Second test of the class two");
	}

	@Test(groups = "integration")
	public void testThreeClassTwo() throws ErrorsException {
		System.out.println("Thrid test of the class two");
		throw new ErrorsException(null);
	}

	@Test(groups = "integration")
	public void testFourClassTwo() {
		System.out.println("Fourth test of the class two");
	}

}
