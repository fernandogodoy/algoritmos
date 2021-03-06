package br.fsg.algoritmos.classicos;

import static org.junit.Assert.*;

import org.junit.Test;

import br.fsg.algoritmos.classicos.Fibonacci;

public class FibonacciTest {

	@Test
	public void test() {
		Fibonacci fibonacci = new Fibonacci();
		int fibo = fibonacci.compute(10);
		assertEquals(55, fibo);
	}

	@Test
	public void testRecursive() {
		Fibonacci fatorial = new Fibonacci();
		int fator = fatorial.recursiveCompute(15);
		assertEquals(610, fator);
	}

}
