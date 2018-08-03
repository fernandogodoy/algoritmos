package br.fsg.algoritmos.ordenacao;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;

import org.junit.Test;

public class CountingSortTest {

	private static final int ARRAY[] = { 5, 2, 4, 6, 1, 3, 7, 9, 8, 10 };
	
	@Test
	public void countingSortTest() {

		int expected[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		Sortable sortable = new CountingSort();
		int[] sorted = sortable.sort(ARRAY);
		System.out.println(Arrays.toString(sorted));
		assertArrayEquals(expected, sorted);
	}
}
