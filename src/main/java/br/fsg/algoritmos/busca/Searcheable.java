package br.fsg.algoritmos.busca;

public interface Searcheable {

	/**
	 * Busca sequencial padrao para arrays. Retorna o primeiro indice encontrado
	 * ou -1 quando o valor nao existe.
	 */
	default int search(int[] array, int value) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == value) {
				return i;
			}
		}
		return -1;
	}
}
