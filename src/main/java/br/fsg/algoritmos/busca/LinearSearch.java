package br.fsg.algoritmos.busca;

public class LinearSearch implements Searcheable {

	@Override
	public int search(int[] array, int value) {
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] == value) {
				return i;
			}
		}
		return - 1;
	}

}
