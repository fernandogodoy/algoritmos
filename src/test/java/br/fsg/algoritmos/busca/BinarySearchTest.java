package br.fsg.algoritmos.busca;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class BinarySearchTest {

	private static final int ARRAY[] = { 5, 2, 4, 6, 1, 3, 7, 9, 8, 10 };

	@Test
	public void testSearch() {
		int expected = 7;
		Searcheable searcheable = new BinarySearch();
		int value = searcheable.search(ARRAY, 9);
		assertEquals(expected, value);
	}
	
	@Test
	public void testRandom() {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < 1000000000; i++) {
			list.add(i);
		}
		int array[] = list.stream().mapToInt(i -> i).toArray();
		Searcheable searchable = new BinarySearch();
		searchable.search(array, 1000000000);

	}

}
