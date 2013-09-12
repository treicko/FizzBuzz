package fizzbuzz;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {

	@Test
	public void imprimeFizzSiNumeroEs3() {
		FizzBuzz fb = new FizzBuzz();
		assertEquals("Fizz",fb.generar(3));
	}
	
	@Test
	public void imprimeElMismoNumeroSiNoEs3()
	{
		FizzBuzz fb = new FizzBuzz();
		assertEquals("4",fb.generar(4));
	}
	
	@Test
	public void imprimeFizzSiEsMultiploDe3()
	{
		FizzBuzz fb = new FizzBuzz();
		assertEquals("Fizz",fb.generar(6));
	}

}
