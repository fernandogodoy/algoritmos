package br.fsg.algoritmos.ordenacao;

public class MergeSort implements Sortable {

	@Override
	public int[] sort(int[] array) {
		sort(array, 0, array.length - 1);
		return array;
	}

	private void sort(int[] array, int start, int end) {

		if (start < end) {
			int midle = (start + end) / 2;
			sort(array, start, midle);
			sort(array, midle + 1, end);
			merge(array, start, midle, end);
		}

	}

	private void merge(int[] array, int start, int midle, int end) {
		int n1 = midle - start + 1;
		int n2 = end - midle;

		int left[] = new int[n1];
		int right[] = new int[n2];

		for (int i = 0; i < n1; ++i) {
			left[i] = array[start + i];
		}

		for (int j = 0; j < n2; ++j) {
			right[j] = array[midle + 1 + j];
		}

		int i = 0;
		int j = 0;
		int k = start;
		while (i < n1 && j < n2) {
			if (left[i] <= right[j]) {
				array[k] = left[i];
				i++;
			} else {
				array[k] = right[j];
				j++;
			}
			k++;
		}

		while (i < n1) {
			array[k] = left[i];
			i++;
			k++;
		}

		while (j < n2) {
			array[k] = right[j];
			j++;
			k++;
		}
	}
}
