package br.fsg.algoritmos.busca;

import java.util.ArrayDeque;
import java.util.Queue;

public class BreadthFirstSearch implements Searcheable {

	/**
	 * Busca um vertice em largura a partir de start usando listas de adjacencia.
	 * Os vertices sao os indices de graph e cada linha contem seus vizinhos.
	 * Retorna o vertice encontrado ou -1 se ele nao for alcancavel.
	 */
	public int search(int[][] graph, int start, int value) {
		if (graph.length == 0) {
			return -1;
		}
		if (start < 0 || start >= graph.length) {
			throw new IllegalArgumentException("Vertice inicial invalido: " + start);
		}

		boolean[] visited = new boolean[graph.length];
		Queue<Integer> queue = new ArrayDeque<>();
		visited[start] = true;
		queue.add(start);
		while (!queue.isEmpty()) {
			int vertex = queue.remove();
			if (vertex == value) {
				return vertex;
			}
			for (int neighbor : graph[vertex]) {
				if (!visited[neighbor]) {
					visited[neighbor] = true;
					queue.add(neighbor);
				}
			}
		}
		return -1;
	}
}
