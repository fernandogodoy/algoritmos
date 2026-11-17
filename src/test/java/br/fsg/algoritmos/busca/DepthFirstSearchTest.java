package br.fsg.algoritmos.busca;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DepthFirstSearchTest {

	private static final int[][] GRAPH = { { 1, 2 }, { 3 }, { 3 }, { 0 }, {} };

	@Test
	public void testSearch() {
		assertEquals(3, new DepthFirstSearch().search(GRAPH, 0, 3));
	}

	@Test
	public void testStartVertex() {
		assertEquals(0, new DepthFirstSearch().search(GRAPH, 0, 0));
	}

	@Test
	public void testDisconnectedVertex() {
		assertEquals(-1, new DepthFirstSearch().search(GRAPH, 0, 4));
	}

	@Test(timeout = 1000)
	public void testCycleWithMissingValue() {
		assertEquals(-1, new DepthFirstSearch().search(GRAPH, 0, 5));
	}

	@Test
	public void testIsolatedVertex() {
		assertEquals(4, new DepthFirstSearch().search(GRAPH, 4, 4));
		assertEquals(-1, new DepthFirstSearch().search(GRAPH, 4, 0));
	}

	@Test
	public void testEmptyGraph() {
		assertEquals(-1, new DepthFirstSearch().search(new int[0][], 0, 1));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testNegativeStart() {
		new DepthFirstSearch().search(GRAPH, -1, 0);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testStartOutsideGraph() {
		new DepthFirstSearch().search(GRAPH, GRAPH.length, 0);
	}
}
