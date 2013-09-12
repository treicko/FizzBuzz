package fizzbuzz;

public class FizzBuzz {

	public String generar(int numero) {
		if (numero % 3 == 0)
			return "Fizz";
		return Integer.toString(numero);			
	}

}
