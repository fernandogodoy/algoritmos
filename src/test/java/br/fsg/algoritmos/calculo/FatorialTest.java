package br.fsg.algoritmos.calculo;

import static org.junit.Assert.*;

import org.junit.Test;

public class FatorialTest {

	@Test
	public void test() {
		Fatorial fatorial = new Fatorial();
		int fator = fatorial.compute(5);
		assertEquals(120, fator);
	}

	@Test
	public void testRecursive() {
		Fatorial fatorial = new Fatorial();
		int fator = fatorial.recursiveCompute(10);
		assertEquals(3628800, fator);
	}

}
