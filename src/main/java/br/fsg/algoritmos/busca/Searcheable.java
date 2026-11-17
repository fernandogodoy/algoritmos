package br.fsg.algoritmos.busca;

public interface Searcheable {

	default int search(int[] array, int value) {
		throw new UnsupportedOperationException("Busca em arrays nao suportada por este algoritmo");
	}

	default int search(int[][] graph, int start, int value) {
		throw new UnsupportedOperationException("Busca em grafos nao suportada por este algoritmo");
	}
}
