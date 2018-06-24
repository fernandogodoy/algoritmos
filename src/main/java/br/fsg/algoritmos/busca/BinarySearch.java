package br.fsg.algoritmos.busca;

public class BinarySearch implements Searcheable {

	@Override
	public int search(int[] array, int value) {
		int first = 0;
		int last = array.length - 1;
		int middle;
		while (first <= last) {
			middle = (first + last) / 2;
			if (value == array[middle]) {
				return middle;
			} else if (value < array[middle]) {
				last = middle - 1;
			} else {
				first = middle + 1;
			}
		}

		return -1;
	}
}
