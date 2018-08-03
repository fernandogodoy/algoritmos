package br.fsg.algoritmos.ordenacao;

public class CountingSort implements Sortable {

	@Override
	public int[] sort(int[] array) {
		int n = array.length;
		int temp[] = new int[array.length - 1];

		int count[] = new int[256];
		for (int i = 0; i < 256; ++i)
			count[i] = 0;

		// store count of each character
		for (int i = 0; i < n; ++i)
			++count[array[i]];

		// Change count[i] so that count[i] now contains actual
		// position of this character in output array
		for (int i = 1; i <= 255; ++i)
			count[i] += count[i - 1];

		// Build the output character array
		for (int i = 0; i < n; ++i) {
			temp[count[array[i]] - 1] = array[i];
			--count[array[i]];
		}

		// Copy the output array to arr, so that arr now
		// contains sorted characters
		for (int i = 0; i < n; ++i)
			array[i] = temp[i];
		return array;
	}

}
