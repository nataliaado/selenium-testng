package project.testng.newtests;

import org.testng.annotations.Test;

@Test(groups="integration-tests")
public class PackageTwoTestOne {

	@Test
	public void packageTwoTestOne() {
		System.out.println("Frist test of the second package");
	}

	@Test
	public void packageTwoTestTwo() {
		System.out.println("Second test of the second package");
	}

	@Test
	public void packageTwoTestThree() {
		System.out.println("Thrid test of the second package");
	}

	@Test
	public void packageTwoTestFour() {
		System.out.println("Fourth test of the second package");
	}
}
