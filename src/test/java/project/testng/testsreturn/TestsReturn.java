package project.testng.testsreturn;

import org.testng.annotations.Test;

@Test(groups = { "return-tests", "unitary-tests" })
public class TestsReturn {

	@Test(groups = { "return", "unitary" })
	public String salutation() {
		System.out.println("Good morning");
		return "Good morning";
	}

	@Test(groups = { "boolean", "integration" })
	public boolean trueFalse() {
		System.out.println("true");
		return true;
	}

	@Test(groups = { "void", "unitary" })
	public void testThreeClassReturn() {
		System.out.println("Void test of the return class");
	}

	@Test(groups = { "void", "integration" })
	public void testFourClassReturn() {
		System.out.println("Void test tow of the return class");
	}
}
