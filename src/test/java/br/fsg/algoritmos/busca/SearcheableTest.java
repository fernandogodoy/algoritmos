package br.fsg.algoritmos.busca;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SearcheableTest {

	@Test
	public void testDefaultSearch() {
		assertArraySearch(new Searcheable() {});
	}

	@Test
	public void testBreadthFirstSearchThroughInterface() {
		assertArraySearch(new BreadthFirstSearch());
	}

	@Test
	public void testDepthFirstSearchThroughInterface() {
		assertArraySearch(new DepthFirstSearch());
	}

	private void assertArraySearch(Searcheable searchable) {
		assertEquals(0, searchable.search(new int[] { 5, 2, 5, 9 }, 5));
		assertEquals(1, searchable.search(new int[] { 5, 2, 5, 9 }, 2));
		assertEquals(3, searchable.search(new int[] { 5, 2, 5, 9 }, 9));
		assertEquals(-1, searchable.search(new int[] { 5, 2, 5, 9 }, 7));
		assertEquals(-1, searchable.search(new int[0], 5));
	}
}
