package br.fsg.algoritmos.ordenacao;

public class InsertionSort implements Sortable{

	@Override
	public int[] sort(int[] array) {

		for (int j = 1; j < array.length; j++) {
			int key = array[j];
			int i = j;
			while (i > 0 && array[i - 1] > key) {
				array[i] = array[i - 1];
				i = i - 1;
			}
			array[i] = key;
		}
		return array;
	}

	public int[] reverse(int[] array) {

		for (int j = 1; j < array.length; j++) {
			int key = array[j];
			int i = j;
			while (i > 0 && array[i - 1] < key) {
				array[i] = array[i - 1];
				i = i - 1;
			}
			array[i] = key;
		}
		return array;
	}

}
