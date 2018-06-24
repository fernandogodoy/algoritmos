package br.fsg.algoritmos.ordenacao;

public class SelectionSort implements Sortable {

	@Override
	public int[] sort(int[] array) {
		int aux;
		for (int i = 0; i < array.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[min]) {
					min = j;
				}
			}
			if (array[i] != array[min]) {
				aux = array[i];
				array[i] = array[min];
				array[min] = aux;
			}
		}
		return array;
	}

}
