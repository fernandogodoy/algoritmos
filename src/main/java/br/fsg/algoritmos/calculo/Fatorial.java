package br.fsg.algoritmos.calculo;

public class Fatorial {

	public int compute(int number) {
		int result = number;
		if (number == 0) {
			result++;
		}
		while (number > 1) {
			result = result * --number;
		}
		return result;
	}

	public int recursiveCompute(int number) {
		return number == 0 ? 1 : number * recursiveCompute(number - 1);
	}

}
