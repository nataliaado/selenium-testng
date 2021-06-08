package project.testng.testsreturn;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@Test(groups = { "return-tests", "unitary-tests" })
public class TestsReturn {

	@Parameters("salutation")
	@Test(groups = { "return", "unitary" })
	public String salutation(String salutation) {
		System.out.println(salutation);
		return salutation;
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
