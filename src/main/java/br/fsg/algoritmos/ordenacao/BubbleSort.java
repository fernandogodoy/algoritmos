package br.fsg.algoritmos.ordenacao;

public class BubbleSort implements Sortable {

	@Override
	public int[] sort(int[] array) {
		int aux;
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j] > array[j + 1]) {
					aux = array[j];
					array[j] = array[j + 1];
					array[j + 1] = aux;
				}
			}
		}
		return array;
	}

	public int[] recusiveSort(int[] array) {
		sort(array, array.length);
		return array;
	}

	private void sort(int[] array, int length) {
		if (length > 1) {
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] > array[i + 1]) {
					int aux = array[i];
					array[i] = array[i + 1];
					array[i + 1] = aux;
				}
				sort(array, length - 1);
			}
		}
	}
}
