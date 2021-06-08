package project.testng.newtests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@Test(groups = "integration-tests")
public class Package2Test1 {

	@Parameters("name")
	@BeforeMethod
	public void Methodname(@Optional String name) {
		System.out.println(name);
	}

	@Parameters("name")
	@BeforeClass
	public void Classname(@Optional String name) {
		System.out.println(name);
	}

	@Parameters("name")
	@BeforeTest
	public void name(@Optional String name) {
		System.out.println(name);
	}

	@Parameters("name")
	@Test
	public void packageTwoTestOne(@Optional String name) {
		System.out.println("Frist test of the second package");
		System.out.println(name);
	}

	@Parameters("lastName")
	@Test
	public void packageTwoTestTwo(@Optional String lastName) {
		System.out.println("Second test of the second package");
		System.out.println(lastName);
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
