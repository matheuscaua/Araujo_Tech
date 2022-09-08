
public class Operacoes {
	public String soma(String valor1, String valor2) {

		double resultado = Double.parseDouble(valor1) + Double.parseDouble(valor2);

		String resultadoString = String.valueOf(resultado);

		return resultadoString;
	}

	public String sub(String valor1, String valor2) {

		double resultado = Double.parseDouble(valor1) - Double.parseDouble(valor2);

		String resultadoString = String.valueOf(resultado);

		return resultadoString;
	}

	public String mult(String valor1, String valor2) {

		double resultado = Double.parseDouble(valor1) * Double.parseDouble(valor2);

		String resultadoString = String.valueOf(resultado);

		return resultadoString;
	}

	public String div(String valor1, String valor2) {

		double resultado = Double.parseDouble(valor1) / Double.parseDouble(valor2);

		String resultadoString = String.valueOf(resultado);

		return resultadoString;
	}
}
