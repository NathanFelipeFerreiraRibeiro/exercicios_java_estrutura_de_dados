# exercicios_java_estrutura_de_dados
Repositório com 200 exercícios de Estruturas de Dados e Algoritmos em Java, baseados no livro de Loiane Groner. Inclui desafios sobre arrays, listas, pilhas, filas, árvores, grafos, heaps, ordenação, busca, recursão e análise de complexidade para prática e consolidação dos fundamentos.

perfeito, nathan! abaixo vai a **lista COMPLETA (1–200) adaptada para Java**, em **Markdown**, pronta para colar no seu **README.md**.
⚠️ **Atenção:** são apenas **enunciados** (sem soluções). Onde já estava bom para você, **mantive o espírito**; onde cabia, incluí **assinaturas/moldes** de métodos em Java para você implementar.

---

# 📘 Estruturas de Dados e Algoritmos — Lista de 200 Exercícios (Java)

> Baseado nos tópicos do livro da Loiane Groner (2ª ed.).
> Java 17+, JUnit opcional para testes. Organize por pacotes: `br.dev.seuprojeto.arrays`, `...pilhas`, `...grafos`, etc.

---

## Sumário

* [Cap. 3 — Arrays (1–30)](#cap-3--arrays-1–30)
* [Cap. 4 — Pilhas (31–45)](#cap-4--pilhas-31–45)
* [Cap. 5 — Filas e Deques (46–60)](#cap-5--filas-e-deques-46–60)
* [Cap. 6 — Listas Ligadas (61–80)](#cap-6--listas-ligadas-61–80)
* [Cap. 7 — Conjuntos (81–95)](#cap-7--conjuntos-81–95)
* [Cap. 8 — Dicionários/Hashes (96–110)](#cap-8--dicionárioshashes-96–110)
* [Cap. 9 — Recursão (111–120)](#cap-9--recursão-111–120)
* [Cap. 10 — Árvores (121–140)](#cap-10--árvores-121–140)
* [Cap. 11 — Heaps (141–150)](#cap-11--heaps-141–150)
* [Cap. 12 — Grafos (151–165)](#cap-12--grafos-151–165)
* [Cap. 13 — Ordenação e Busca (166–180)](#cap-13--ordenação-e-busca-166–180)
* [Cap. 14 — Designs e Técnicas (181–195)](#cap-14--designs-e-técnicas-181–195)
* [Cap. 15 — Complexidade (196–200)](#cap-15--complexidade-196–200)

---

## Cap. 3 — Arrays (1–30)

**Convenções:** use `int[]`, `double[]`, `String[]` e `List<T>` quando fizer sentido. Não usar bibliotecas de ordenação prontas quando o exercício pedir o algoritmo.

1. Crie um array `int[5]`, leia/defina valores, **retorne maior e menor**.
2. Inverta um array **in-place** (sem `Collections.reverse`).
3. **Soma total** de elementos de um array `int[]`.
4. Conte **pares/ímpares** em um array.
5. Insira elemento **no início** (retornando **novo array**) e **no fim** (amplique a capacidade).
6. Remova **primeiro** e **último** elemento; retorne novo array.
7. Construa **matriz 3x3** com 1..9; imprima em forma de grade.
8. **Soma** dos elementos da matriz.
9. Altere elemento `[i][j]` (valide índices).
10. Verifique se um valor existe com **busca linear**; retorne índice ou -1.
11. **União de dois arrays** eliminando duplicatas; devolva `int[]`.
12. **Frequência** de um valor `x` em `int[]`.
13. Dobre cada elemento com **`for` clássico** e com **Stream**; compare.
14. Filtre apenas **pares** para novo array.
15. **Média** de um array (double).
16. Ordene `String[]` **alfabético asc/desc** (use `Comparator`/`Arrays.sort`).
17. Ordene `Pessoa[]` por `idade` (crie `class Pessoa {String nome; int idade;}`) com `Comparator`.
18. Retorne **segundo maior** número (tratando duplicatas).
19. Encontre `Pessoa` por `id` usando `Arrays.stream(...).filter(...)` ou laço.
20. **Rotacione** elementos `k` posições à direita (in-place, usando reversões).
21. **Busca binária** iterativa em array **ordenado** (retorne índice).
22. Gere **todas as combinações** de tamanho `k` de um array (`backtracking`).
23. Implemente **Bubble Sort** em `int[]` (versão básica).
24. Implemente **Selection Sort**.
25. Implemente **Insertion Sort**.
26. Converta `int[]` em `String` **formatada**: `"1, 2, 3"`.
27. Gere **matriz identidade** `NxN`.
28. Modele **tabuleiro de xadrez** `8x8` (`char[][]`), inicialize peças (símbolos).
29. Gere **sequência Fibonacci** até `N` em `long[]`.
30. **Soma das diagonais** de matriz quadrada (principal + secundária).

---

## Cap. 4 — Pilhas (31–45)

**Sugestão:** implemente `class ArrayStack<E>` com `Object[] data`, `int top`.

31. `ArrayStack<E>`: `push`, `pop`, `peek`, `isEmpty`, `size`.
32. Teste `push/pop` com 100 elementos; valide `EmptyStackException` customizada.
33. Método `clear()` para esvaziar pilha.
34. **Espiar topo** sem remover: `peek()`.
35. Converter **decimal→binário** usando pilha (`int` → `String`).
36. **Parênteses balanceados** em expressão (`()[]{}"`): `boolean isBalanced(String s)`.
37. **Inverter String** usando pilha.
38. **Histórico de navegador** com duas pilhas: `back`, `forward`.
39. Pilha **baseada em objeto** (`Node` ligado) ao invés de array.
40. Encapsule a pilha com **encapsulamento e genéricos** (`private` + `E`).
41. **Notação pós-fixa** (RPN): avalie expressão e retorne `int`.
42. **Conversor de base N** (2..16) via pilha (use dígitos `0-9A-F`).
43. Simule **pilha de chamadas** (recursão → iteração) de `fatorial(n)`.
44. Proteja campos internos com **`private`** e método `toString()` amigável.
45. **Teste de estresse**: empilhe/desempilhe 1 milhão de inteiros (medir tempo).

---

## Cap. 5 — Filas e Deques (46–60)

**Sugestão:** `ArrayQueue<E>` e `ArrayDeque<E>` (você pode **não** usar as classes prontas do JCF neste capítulo).

46. `ArrayQueue<E>`: `enqueue`, `dequeue`, `front`, `isEmpty`, `size`.
47. Enfileire/Desenfileire 1000 itens; valide ordem FIFO.
48. Método `clear()` e **exceção** para `dequeue` vazio.
49. **Fila circular** com array fixo (índices modulares).
50. Jogo **Batata Quente**: retorne vencedor (nome).
51. **Fila de tarefas** simulando processamento assíncrono (apenas lógica).
52. `Deque<E>`: insira/remova **nas duas pontas**.
53. **Palíndromo** com deque (`"radar"` → `true`).
54. **Fila de prioridade simples** (array + `Comparator`).
55. `peek()` sem remover para fila simples.
56. Simule **sistema de senhas** (normal/prioritária).
57. Fila que **aceita somente pares** (valide na entrada).
58. `size()` e `isEmpty()` em O(1).
59. Inverta uma fila usando **apenas uma pilha** auxiliar.
60. Simule **fila de impressão** com prioridades por número menor = maior prioridade.

---

## Cap. 6 — Listas Ligadas (61–80)

**Sugestão:** `SinglyLinkedList<E>` e `DoublyLinkedList<E>`.

61. `SinglyLinkedList<E>`: `addFirst`, `addLast`, `removeFirst`, `remove(E)`.
62. Inserção em **posição** (`add(int index, E e)`) com validação.
63. Remoção por **valor** e por **índice**.
64. `contains(E e)` e `indexOf(E e)`.
65. `size()` e `isEmpty()`.
66. `toString()` que percorre nós `->`.
67. `DoublyLinkedList<E>` com `prev/next`.
68. Inserção/remoção em posições específicas na duplamente ligada.
69. **Lista circular** simples (último aponta para o primeiro).
70. Detectar se **lista é circular** (Floyd – `slow/fast`).
71. **Lista ordenada** automaticamente ao inserir (`Comparable`).
72. **Inverter** a lista in-place (iterativo).
73. Encontrar **elemento do meio** (Floyd).
74. Remover **duplicatas** (com `Set` ou sem extra space).
75. Implementar **Stack** usando `LinkedList` (encapsular).
76. `getLast()` e `getFirst()` com O(1) (manter ponteiros).
77. Percorrer a lista até **posição** e retornar valor.
78. **Contar ocorrências** de `E e`.
79. **Comparar** duas listas por conteúdo e ordem.
80. Mesclar **duas listas ordenadas** em uma terceira ordenada.

---

## Cap. 7 — Conjuntos (81–95)

**Preferência:** `HashSet`, mas alguns pedem implementação própria.

81. Implemente `SimpleSet<E>` com **array** e sem duplicatas.
82. `add`, `remove`, `contains`, `size`.
83. Conjunto a partir de `List<E>` com remoção de duplicatas.
84. **União** de dois conjuntos.
85. **Interseção** de dois conjuntos.
86. **Diferença** `A - B`.
87. Verificar **subconjunto** `A ⊆ B`.
88. Replique API básica do `Set` do JCF (sua implementação).
89. Comparar dois conjuntos por **igualdade de conteúdo**.
90. Construir conjunto **a partir de arrays**.
91. Usar **`varargs`** em método utilitário `of(E... e)`.
92. Contar **palavras únicas** em um texto grande (`String`).
93. Checar se **dois arrays** têm algum elemento em comum (retornar boolean).
94. Implementar **multiconjunto/bag** (mapa `E → contagem`).
95. Calcular interseção de **três** conjuntos.

---

## Cap. 8 — Dicionários/Hashes (96–110)

**Sugestão:** `HashMap<K,V>` e também implementação própria de `hash table` com encadeamento.

96. `Dictionary<K,V>` simples (encapsule `HashMap`).
97. `put`, `get`, `remove`, `containsKey`, `containsValue`, `size`.
98. Itere **keys**, **values**, **entries** (for-each).
99. Contador de **frequência de palavras** com `Map<String,Integer>`.
100. `HashTable` própria com **função hash** básica + **encadeamento separado**.
101. Inserção (`put`) e colisões por **encadeamento** (`List<Node>`).
102. **Sondagem linear** (versão open addressing).
103. Métodos `get`, `remove` na sua `HashTable`.
104. Compare **HashTable vs HashMap** (API/uso).
105. **Função hash melhorada** (misture `hashCode`/bitwise).
106. Simule `Map` e `WeakHashMap` (discutir uso, mas implemente só `Map`).
107. Crie **dicionário de sinônimos** (`Map<String, Set<String>>`).
108. **LRU cache** simples com `LinkedHashMap` (override `removeEldestEntry`).
109. Índice invertido de documentos (`termo → lista de ids`).
110. Persistir `Map` em arquivo (JSON ou binário) e recarregar.

---

## Cap. 9 — Recursão (111–120)

111. **Fatorial** recursivo e iterativo; compare.
112. **Fibonacci** recursivo, recursivo com memo, iterativo.
113. **Inverter String** recursivamente.
114. **Soma de array** recursiva (divida e conquiste).
115. **Contagem** de ocorrências de `x` recursiva em `int[]`.
116. Percorra **árvore JSON** (modele com `Map/List`) e colete chaves.
117. **Combinações** recursivas de tamanho `k` (lista).
118. **Torres de Hanói**: gere passos de movimento.
119. Maior valor em array via recursão.
120. Multiplicação por **soma recursiva** (sem `*`), para inteiros positivos.

---

## Cap. 10 — Árvores (121–140)

**Estruturas:** `class BST`, `class AVL`, `class RBTree` (interfaces livres).

121. `Node<T>` e `BinarySearchTree<T extends Comparable<T>>` com `insert`.
122. Inserir valores numa **BST** e percorrer **in-order**.
123. Implementar **in-order** que retorna `List<T>`.
124. **Pré-ordem** e **pós-ordem** (listas).
125. `contains(T key)` em BST.
126. `min()` e `max()` na BST.
127. **Altura** da árvore (recursiva).
128. Contar **nós** e **folhas**.
129. **Remover** nó (0, 1 ou 2 filhos).
130. **AVL**: inserir mantendo balanceamento.
131. Rotações **simples** (LL, RR).
132. Rotações **duplas** (LR, RL).
133. Calcular **fator de balanceamento** e validar.
134. Inserção múltipla em AVL (teste).
135. Implementar **árvore rubro-negra** (inserção).
136. Verificar **propriedades** após inserção (cores, raiz preta).
137. Executar rotações em RB quando necessário.
138. Contar **folhas** em qualquer árvore.
139. **Nível** (profundidade) de um nó pelo valor.
140. Verificar se **duas árvores** são **idênticas** (forma + valores).

---

## Cap. 11 — Heaps (141–150)

**Estruturas:** `MinHeap`, `MaxHeap` com `ArrayList<Integer>` ou `int[]`.

141. `MinHeap`: `add`, `peek`, `poll`, `size` (use `siftUp/siftDown`).
142. Inserir valores e manter propriedade de heap.
143. **Extrair mínimo** e validar heap após extração.
144. Retornar **min** e **max** num MinHeap (max pode exigir varredura).
145. `MaxHeap` com mesmos métodos.
146. **Heapify**: construir heap a partir de `int[]` em O(n).
147. Simular **fila de prioridade** com `MinHeap`.
148. Implemente `siftUp`/`siftDown` como métodos privados e testáveis.
149. **Heap Sort** usando seu `MaxHeap`.
150. Comparar **tempos** `heap sort` vs `quick sort` em arrays grandes (sem gráficos).

---

## Cap. 12 — Grafos (151–165)

> Representações sugeridas:
>
> * Não ponderado: `Map<V, List<V>> adjacency`.
> * Ponderado: `Map<V, List<Edge<V>>>` com `record Edge<V>(V to, int w){}`.

151. **Classe `Graph<V>`** dirigida/não-dirigida com `addVertex`, `addEdge`, `removeEdge`, `removeVertex`, `neighbors`, `vertices`.
152. **BFS** `List<V> bfs(Graph<V> g, V s)` — ordem de visita (use `Queue<V>`).
153. **DFS** recursiva e iterativa (`Stack<V>`), retornando pré-ordem.
154. `boolean isConnected(Graph<V> g)` para grafo **não-dirigido**.
155. **Caminho mais curto** não-ponderado por BFS com **reconstrução** (`parent`).
156. **Componentes conectados**: `List<List<V>> connectedComponents(Graph<V> g)`.
157. **Dijkstra** (pesos ≥ 0): `Map<V,Integer> dijkstra(Graph<V> g, V s)` com `PriorityQueue`.
158. **Floyd–Warshall**: `int[][] floydWarshall(int[][] m)` (matriz).
159. **Detectar ciclo** (dirigido) via cores ou `recStack`.
160. **MST – Prim**: retorne `{arestas, pesoTotal}` usando `PriorityQueue`.
161. **MST – Kruskal**: `Union-Find` (compressão de caminho + união por rank).
162. **Bipartição**: BFS colorindo 0/1; retorne `true/false`.
163. **Grau** dos vértices (in/out/total) em dirigido e não-dirigido.
164. **Menores caminhos em DAG** via **ordenação topológica**.
165. **Ordenação topológica**: Kahn (grau de entrada) ou DFS pós-ordem.

---

## Cap. 13 — Ordenação e Busca (166–180)

166. **Bubble Sort otimizado**: pare se não houver trocas; conte `swaps`.
167. **Selection Sort**: registre índices mínimos por iteração.
168. **Insertion Sort**: conte `shifts` (deslocamentos).
169. **Merge Sort estável** (tempo O(n log n), espaço O(n)).
170. **Quick Sort** in-place (pivô **mediana de três**; caia para insertion em subarrays pequenos).
171. **Counting Sort** (inteiros ≥ 0, versão **estável**).
172. **Bucket Sort** para `float` `[0,1)` com insertion por balde.
173. **Radix Sort** LSD (base 10) p/ inteiros não-negativos.
174. **Busca linear** (com e sem **sentinela**).
175. **Busca binária**: **primeira ocorrência** (lower bound).
176. **Busca por interpolação**: assuma distribuição quase uniforme.
177. **Experimento**: medir tempo (média de 5 execuções) para `bubble`, `insertion`, `merge`, `quick` em `n ∈ {1k, 5k, 10k}` com `System.nanoTime()`.
178. **Exportar CSV** de tempos (p/ plot externo).
179. **Fisher–Yates** `void shuffle(int[] a)`; valide uniformidade com contagem de permutações de `[0,1,2]`.
180. **Ordenação multi-chave**: `Comparator` composto para `Pessoa(sobrenome→nome→idade)` (**estável**).

---

## Cap. 14 — Designs e Técnicas (181–195)

181. **Mochila 0/1 (DP bottom-up)**: retorne `maxValue` e **itens escolhidos**.
182. **Troco mínimo (DP)**: `int minCoins(int[] coins, int amount)` + recuperação de combinação.
183. **LCS** (Maior Subsequência Comum) com reconstrução da string.
184. **Cadeia de multiplicação de matrizes**: custo mínimo + parentização ótima.
185. **Sudoku 9×9** (backtracking + MRV): resolver grade; validar solução única (opcional).
186. **Labirinto** (grid 0/1) — **BFS** para caminho mínimo de `S` a `T`.
187. **Subarray de soma máxima**: Kadane (O(n)) + versão divide-and-conquer (O(n log n)) e comparação.
188. **Lower/Upper Bound** utilitários: `int lowerBound(int[] a, int x)`, `int upperBound(int[] a, int x)`.
189. **Seleção de atividades** (guloso): ordenar por `end` e selecionar compatíveis.
190. **Mochila fracionária** (guloso): ordenar por `v/w` e pegar frações.
191. **DP vs Guloso**: construa caso onde guloso falha p/ 0/1; mostre valores (`greedy` vs `dp`).
192. **Gerador + solucionador de Sudoku**: gerar tabuleiros válidos por dificuldade e resolver.
193. **Memoização** (decorator simples): `Map<List<Object>, R>`; aplicar em `fibonacci`.
194. **Refatoração funcional (Streams)**: somar os **quadrados** dos **pares** sem mutações (`filter→map→reduce`).
195. **Pipeline real com Streams**: de `List<Pedido>` calcule **faturamento por categoria** e **ticket médio** (`groupingBy`, `summingDouble`, `averagingDouble`).

---

## Cap. 15 — Complexidade (196–200)

196. **Análise assintótica** de código com dois laços aninhados (derive O(n²) e espaço).
197. **Classifique** 3 trechos: laço simples (O(n)), busca binária (O(log n)), laço duplo (O(n²)) — com justificativa.
198. **Tabela de ordenações**: preencha `{algoritmo, melhor, médio, pior, estável?, in-place?}` para `bubble`, `selection`, `insertion`, `merge`, `quick`, `heap`.
199. **Crescimento assintótico**: gere valores de `n`, `n log n`, `n²`, `2^n` (1..30) e salve CSV + breve análise dos cruzamentos.
200. **TSP heurístico**: implemente **vizinho mais próximo** e **2-opt** para pontos `{x,y}`; compare distância inicial x aprimorada.
