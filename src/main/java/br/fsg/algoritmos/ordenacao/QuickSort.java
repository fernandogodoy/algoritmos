package br.fsg.algoritmos.ordenacao;

public class QuickSort implements Sortable {

	@Override
	public int[] sort(int[] array) {
		int low = 0;
		int hight = array.length;
		quickSort(array, low, hight - 1);
		return array;
	}

	private void quickSort(int[] array, int low, int hight) {
		if (low < hight) {
			int part = partitition(array, low, hight);
			quickSort(array, low, part - 1);
			quickSort(array, part + 1, hight);
		}
	}

	private int partitition(int[] array, int low, int hight) {
		int pivot = array[hight];
		int index = low - 1;
		for (int j = low; j < hight; j++) {
			if (array[j] <= pivot) {
				index++;
				swap(array, index, j);
			}
		}
		swap(array, index + 1, hight);
		return index + 1;
	}

	private void swap(int[] array, int current, int next) {
		int aux = array[current];
		array[current] = array[next];
		array[next] = aux;
	}

}
