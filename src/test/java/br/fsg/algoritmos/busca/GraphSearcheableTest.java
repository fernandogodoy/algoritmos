package br.fsg.algoritmos.busca;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GraphSearcheableTest {

	@Test
	public void testBreadthFirstSearchThroughInterface() {
		assertGraphSearch(new BreadthFirstSearch());
	}

	@Test
	public void testDepthFirstSearchThroughInterface() {
		assertGraphSearch(new DepthFirstSearch());
	}

	private void assertGraphSearch(GraphSearcheable searchable) {
		int[][] graph = { { 1 }, { 0, 2 }, {}, {} };
		assertEquals(0, searchable.search(graph, 0, 0));
		assertEquals(2, searchable.search(graph, 0, 2));
		assertEquals(-1, searchable.search(graph, 0, 3));
		assertEquals(-1, searchable.search(new int[0][], 0, 1));
	}
}
