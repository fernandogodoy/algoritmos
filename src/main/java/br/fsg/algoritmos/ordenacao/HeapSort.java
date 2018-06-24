package br.fsg.algoritmos.ordenacao;

public class HeapSort implements Sortable {

	@Override
	public int[] sort(int[] array) {
		sort(array, array.length);
		return array;
	}

	private void sort(int[] array, int length) {
		buildMaxHeapfy(array, length);
		for (int i = length - 1; i >= 0; i--) {
			int aux = array[0];
			array[0] = array[i];
			array[i] = aux;
			maxHeapify(array, i, 0);
		}
	}

	private void buildMaxHeapfy(int[] array, int length) {
		for (int i = length / 2 - 1; i >= 0; i--) {
			maxHeapify(array, length, i);
		}
	}

	private void maxHeapify(int[] array, int length, int i) {
		int largest = i;
		int left = 2 * i + 1;
		int right = 2 * i + 2;

		if (left < length && array[left] > array[largest]) {
			largest = left;
		}
		if (right < length && array[right] > array[largest]) {
			largest = right;
		}

		if (largest != i) {
			int aux = array[i];
			array[i] = array[largest];
			array[largest] = aux;
			maxHeapify(array, length, largest);
		}
	}

}
