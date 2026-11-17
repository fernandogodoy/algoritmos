# Algoritmos

Projeto contendo implementação de exemplos para alguns algoritmos clássicos

## Ordenação

    - BubbleSort
    - HeapSort
    - InsertionSort
    - MergeSort
    - QuickSort
    - SelectionSort

## Busca

    - BinarySearch
    - LinearSearch
    - DepthFirstSearch (DFS)
    - BreadthFirstSearch (BFS)

### Busca em profundidade (DFS)

Percorre um grafo usando uma pilha e controla os vértices visitados para evitar
repetições em ciclos. Os vértices são numerados de `0` a `graph.length - 1`;
cada linha contém os índices dos seus vizinhos, todos válidos no grafo.

```java
int[][] graph = { { 1, 2 }, { 3 }, { 3 }, {} };
DepthFirstSearch search = new DepthFirstSearch();
int vertex = search.search(graph, 0, 3); // retorna 3
int missing = search.search(graph, 0, 4); // retorna -1
```

Use `import br.fsg.algoritmos.busca.DepthFirstSearch;`.
O método recebe o grafo, o vértice inicial e o vértice procurado. Retorna `-1`
para um grafo vazio ou quando o destino não é alcançável a partir da origem.
Uma origem fora dos limites de um grafo não vazio gera `IllegalArgumentException`.
Como a busca opera em grafos, sua assinatura é diferente da interface
`Searcheable`, usada para buscas em arrays.

### Busca em largura (BFS)

Percorre um grafo por níveis usando uma fila. Marca cada vértice como visitado
ao colocá-lo na fila, evitando repetições em ciclos ou caminhos convergentes.
Usa a mesma representação de grafo, parâmetros e regras de retorno do DFS.

```java
int[][] graph = { { 1, 2 }, { 3 }, { 3 }, {} };
BreadthFirstSearch search = new BreadthFirstSearch();
int vertex = search.search(graph, 0, 3); // retorna 3
int missing = search.search(graph, 0, 4); // retorna -1
```

Use `import br.fsg.algoritmos.busca.BreadthFirstSearch;`.
A busca tem complexidade de tempo O(V + E) e espaço auxiliar O(V),
onde V é o número de vértices e E o número de arestas.

## Clássicos

    - Fatorial
    - Fibonacci
