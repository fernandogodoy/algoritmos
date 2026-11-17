package br.fsg.algoritmos.busca;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SearcheableTest {

	@Test
	public void testBreadthFirstSearchThroughInterface() {
		assertGraphSearch(new BreadthFirstSearch());
	}

	@Test
	public void testDepthFirstSearchThroughInterface() {
		assertGraphSearch(new DepthFirstSearch());
	}

	@Test
	public void testArraySearchThroughInterface() {
		Searcheable linear = new LinearSearch();
		Searcheable binary = new BinarySearch();
		assertEquals(1, linear.search(new int[] { 1, 2, 3 }, 2));
		assertEquals(1, binary.search(new int[] { 1, 2, 3 }, 2));
	}

	@Test(expected = UnsupportedOperationException.class)
	public void testBreadthFirstSearchRejectsArray() {
		Searcheable searchable = new BreadthFirstSearch();
		searchable.search(new int[] { 1 }, 1);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void testDepthFirstSearchRejectsArray() {
		Searcheable searchable = new DepthFirstSearch();
		searchable.search(new int[] { 1 }, 1);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void testLinearSearchRejectsGraph() {
		Searcheable searchable = new LinearSearch();
		searchable.search(new int[][] { {} }, 0, 0);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void testBinarySearchRejectsGraph() {
		Searcheable searchable = new BinarySearch();
		searchable.search(new int[][] { {} }, 0, 0);
	}

	private void assertGraphSearch(Searcheable searchable) {
		int[][] graph = { { 1 }, { 0, 2 }, {}, {} };
		assertEquals(0, searchable.search(graph, 0, 0));
		assertEquals(2, searchable.search(graph, 0, 2));
		assertEquals(-1, searchable.search(graph, 0, 3));
		assertEquals(-1, searchable.search(new int[0][], 0, 1));
	}
}
