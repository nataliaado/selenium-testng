package project.testng.parameterizedtests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class ParameterizedTests {

	@Test(dataProvider = "data_tests")
	public void names(String name, int age, double height) {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Height: " + height);
	}

	@Ignore
	@Test
	public void colors(String color) {
		System.out.println(color);
	}

	@DataProvider(name = "data_tests")
	public Object[][] data() {

		return new Object[][] { { "Natalia", new Integer(34), new Double(1.80) },
				{ "Maria", new Integer(50), new Double(1.60) } };
	}

}
