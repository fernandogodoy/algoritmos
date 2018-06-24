package br.fsg.algoritmos.calculo;

public class Fibonacci {

	public int compute(int number) {
		int current = 0;
		int last = 0;
		for (int i = 1; i <= number; i++) {
			if (i == 1) {
				current++;
			} else {
				current += last;
				last = current - last;
			}
		}
		return current;
	}

	public int recursiveCompute(int number) {
		if (number < 2) {
			return number;
		}
		return recursiveCompute(number - 1) + recursiveCompute(number - 2);
	}

}
