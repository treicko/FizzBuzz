package fizzbuzz;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {
	FizzBuzz fb;
	
	@Before
	public void setup() {
		fb = new FizzBuzz();
	}

	@Test
	public void imprimeFizzSiNumeroEs3() {
		assertEquals("Fizz",fb.generar(3));
	}
	
	@Test
	public void imprimeElMismoNumeroSiNoEs3()
	{
		assertEquals("4",fb.generar(4));
	}
	
	@Test
	public void imprimeFizzSiEsMultiploDe3()
	{
		assertEquals("Fizz",fb.generar(6));
	}

}
