package br.fsg.algoritmos.ordenacao;

import static org.junit.Assert.assertArrayEquals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class InsertionSortTest {

	private static final int ARRAY[] = { 5, 2, 4, 6, 1, 3, 7, 9, 8, 10 };

	@Test
	public void insertionSortTest() {

		int expected[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		Sortable insertionSort = new InsertionSort();
		int[] sorted = insertionSort.sort(ARRAY);
		assertArrayEquals(expected, sorted);
	}

	@Test
	public void insertionSortTest1() {

		int expected[] = { 26, 31, 41, 41, 58, 59 };
		Sortable insertionSort = new InsertionSort();
		int[] sorted = insertionSort.sort(new int[] {31, 41, 59, 26, 41, 58});
		assertArrayEquals(expected, sorted);
	}

	@Test
	public void reverseSortTest() {

		int expected[] = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		InsertionSort insertionSort = new InsertionSort();
		int[] sorted = insertionSort.reverse(ARRAY);
		assertArrayEquals(expected, sorted);
	}

	@Test
	public void random() {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < 100000; i++) {
			list.add(i);
		}
		Collections.shuffle(list);
		int array[] = list.stream().mapToInt(i -> i).toArray();
		InsertionSort insertionSort = new InsertionSort();
		insertionSort.sort(array);
	}

}
