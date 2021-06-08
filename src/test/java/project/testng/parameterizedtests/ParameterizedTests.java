package project.testng.parameterizedtests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class ParameterizedTests {

	@Test(dataProvider = "tests_data")
	public void nomes(String nome, int idade, double altura) {
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Altura: " + altura);
	}

	@Ignore
	@Test
	public void cores(String cor) {
		System.out.println(cor);
	}

	@DataProvider(name = "tests_data")
	public Object[][] data() {
		
		return new Object[][] { { "Natalia", new Integer(34), new Double(1.80) },
				{ "Maria", new Integer(50), new Double(1.60) } };
	}
}
