package br.fsg.algoritmos.ordenacao;

import static org.junit.Assert.assertArrayEquals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class HeapSortTest {

	private static final int ARRAY[] = { 5, 2, 4, 6, 1, 3, 7, 9, 8, 10 };

	@Test
	public void heapSortTest() {

		int expected[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		Sortable sortable = new HeapSort();
		int[] sorted = sortable.sort(ARRAY);
		assertArrayEquals(expected, sorted);
	}
	
	@Test
	public void testRandom() {
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i < 10000000; i++) {
			list.add(i);
		}
		Collections.shuffle(list);
		int array[] = list.stream().mapToInt(i -> i).toArray();
		Sortable sortable = new HeapSort();
		sortable.sort(array);
	}

}
