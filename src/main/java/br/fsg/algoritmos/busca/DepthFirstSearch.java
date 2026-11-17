package br.fsg.algoritmos.busca;

import java.util.ArrayDeque;
import java.util.Deque;

public class DepthFirstSearch implements Searcheable {

	/**
	 * Busca um vertice a partir de start usando listas de adjacencia.
	 * Os vertices sao os indices de graph e cada linha contem seus vizinhos.
	 * Retorna o vertice encontrado ou -1 se ele nao for alcancavel.
	 */
	@Override
	public int search(int[][] graph, int start, int value) {
		if (graph.length == 0) {
			return -1;
		}
		if (start < 0 || start >= graph.length) {
			throw new IllegalArgumentException("Vertice inicial invalido: " + start);
		}

		boolean[] visited = new boolean[graph.length];
		Deque<Integer> stack = new ArrayDeque<>();
		stack.push(start);
		while (!stack.isEmpty()) {
			int vertex = stack.pop();
			if (visited[vertex]) {
				continue;
			}
			visited[vertex] = true;
			if (vertex == value) {
				return vertex;
			}
			for (int i = graph[vertex].length - 1; i >= 0; i--) {
				int neighbor = graph[vertex][i];
				if (!visited[neighbor]) {
					stack.push(neighbor);
				}
			}
		}
		return -1;
	}
}
