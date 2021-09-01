
public class SquareEveryDigit {

	public static void main(String[] args) {

		System.out.println(squareDigits(911));
	}

	public static int squareDigits(int n) {
		// Convierto a String para iterar
		String s = n + "";
		// Variable de resultado para concatenar numeros en string
		String resultado = "";
		// El resultado final que el ejercicio pide que se devuelva como int
		int resultadoFinal;

		// Obtengo cada caracter lo transformo a int y calculo su valor, lo guardo en
		// resultado contatenado
		for (int i = 0; i < s.length(); i++) {
			int numero = Character.getNumericValue(s.charAt(i));

			int calcula = numero * numero;
			resultado += calcula;
		}
		// Finalmente parseo el resultado a int y lo devuelvo
		resultadoFinal = Integer.parseInt(resultado);

		return resultadoFinal;

	}
}
