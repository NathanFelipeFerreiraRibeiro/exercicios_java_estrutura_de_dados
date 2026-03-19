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

### Exercício 1

Crie um programa em Java que declare um array de inteiros com tamanho fixo igual a cinco posições. Em seguida, faça com que o programa receba ou defina valores para cada uma dessas posições e percorra todo o array analisando seus elementos. Ao final da execução, o algoritmo deve identificar qual é o maior valor armazenado no array e qual é o menor valor, exibindo ambos no console. O objetivo deste exercício é praticar a criação de arrays, o acesso aos seus índices e a lógica necessária para comparar valores durante a iteração.

### Exercício 2

Desenvolva um algoritmo que receba um array de números inteiros e realize a inversão completa da ordem de seus elementos utilizando apenas operações diretas no próprio array, sem criar outro array auxiliar para armazenar os resultados. Ou seja, o primeiro elemento deve passar a ocupar a última posição, o segundo deve ocupar a penúltima e assim por diante. O objetivo deste exercício é compreender o conceito de manipulação **in-place** de estruturas de dados e trabalhar com índices que se deslocam em direções opostas dentro do array.

### Exercício 3

Implemente um método em Java responsável por calcular a soma total de todos os elementos presentes em um array de números inteiros. O método deve percorrer cada posição do array, acumular os valores encontrados e retornar o resultado final da soma. Este exercício tem como finalidade reforçar o uso de laços de repetição, variáveis acumuladoras e a leitura sequencial de estruturas lineares de dados.

### Exercício 4

Crie um programa que analise um array de números inteiros e determine quantos desses números são pares e quantos são ímpares. O algoritmo deve percorrer todo o array verificando cada elemento por meio da operação de resto da divisão por dois. Ao final, o programa deve exibir a quantidade total de números pares e a quantidade total de números ímpares encontrados no array. Esse exercício ajuda a praticar lógica condicional combinada com iteração em arrays.

### Exercício 5

Implemente um método que permita inserir um novo elemento no início de um array de inteiros. Como arrays possuem tamanho fixo, será necessário criar um novo array com capacidade suficiente para armazenar o elemento adicional e os elementos originais. O algoritmo deve posicionar o novo valor na primeira posição e deslocar todos os demais elementos para a direita. Em seguida, implemente também uma variação que realize a inserção no final do array. O objetivo deste exercício é compreender as limitações estruturais dos arrays e como contorná-las com realocação de memória.

### Exercício 6

Crie um algoritmo que receba um array de inteiros e produza um novo array contendo os mesmos elementos, porém com o primeiro e o último elementos removidos. Caso o array possua tamanho insuficiente para essa operação, o programa deve tratar a situação adequadamente. Este exercício tem como objetivo reforçar o entendimento de manipulação estrutural de arrays e criação de novos arrays derivados.

### Exercício 7

Construa uma matriz bidimensional de tamanho 3x3 e preencha suas posições com os números de 1 a 9. Após o preenchimento, implemente uma rotina que percorra a matriz e imprima seus valores organizados em formato de grade, de modo que cada linha da matriz seja exibida em uma linha do console. Esse exercício introduz o conceito de arrays bidimensionais e o uso de dois laços de repetição aninhados para percorrer estruturas matriciais.

### Exercício 8

Utilizando uma matriz bidimensional de números inteiros, implemente um algoritmo que percorra todas as suas posições e calcule a soma de todos os elementos presentes. O programa deve considerar todas as linhas e colunas da matriz e acumular os valores encontrados, retornando ao final o resultado total da soma. O objetivo deste exercício é consolidar o uso de matrizes e iteração em múltiplas dimensões.

### Exercício 9

Implemente um método que permita alterar o valor de um elemento específico dentro de uma matriz bidimensional. O método deve receber como parâmetros os índices da linha e da coluna que indicam a posição do elemento, bem como o novo valor a ser inserido. Antes de realizar a alteração, o algoritmo deve verificar se os índices fornecidos estão dentro dos limites válidos da matriz, evitando assim erros de acesso indevido à estrutura.

### Exercício 10

Desenvolva um método que receba um array de números inteiros e um valor específico a ser procurado dentro desse array. O algoritmo deve percorrer o array sequencialmente comparando cada elemento com o valor buscado. Caso o valor seja encontrado, o método deve retornar o índice correspondente à posição do elemento no array. Caso contrário, deve retornar -1. Este exercício representa a implementação clássica do algoritmo de **busca linear**.

### Exercício 11

Crie um programa que receba dois arrays de números inteiros e construa um terceiro array contendo a união dos valores presentes nos dois primeiros, eliminando qualquer elemento duplicado. O algoritmo deve percorrer ambos os arrays, verificar quais valores já foram adicionados ao resultado e garantir que cada número apareça apenas uma vez no array final. Esse exercício trabalha a manipulação de arrays, comparação de elementos e lógica de remoção de duplicidade durante a construção de uma nova estrutura.

### Exercício 12

Implemente um método que receba um array de inteiros e um valor específico `x`, e determine quantas vezes esse valor aparece dentro do array. O algoritmo deve percorrer todos os elementos, comparar cada um deles com o valor procurado e incrementar um contador sempre que encontrar uma ocorrência correspondente. Ao final, o método deve retornar o total de repetições encontradas. O objetivo deste exercício é praticar contagem de frequência em estruturas lineares.

### Exercício 13

Desenvolva duas versões de um mesmo algoritmo: na primeira, utilize um laço `for` tradicional para percorrer um array de inteiros e dobrar o valor de cada elemento; na segunda, utilize a API de Streams do Java para produzir o mesmo resultado de forma declarativa. Após implementar ambas as abordagens, compare a clareza do código, a legibilidade e a diferença conceitual entre o estilo imperativo e o funcional. Esse exercício é importante para compreender diferentes paradigmas de processamento de coleções em Java.

### Exercício 14

Crie um método que receba um array de números inteiros e produza um novo array contendo apenas os valores pares encontrados na estrutura original. O algoritmo deve percorrer o array, identificar os elementos divisíveis por dois e armazená-los em uma nova coleção ou estrutura temporária antes de convertê-los para o formato desejado. O foco deste exercício está em filtragem de dados, construção de novos arrays a partir de critérios condicionais e transformação de estruturas.

### Exercício 15

Implemente um programa que calcule a média aritmética dos valores presentes em um array de números reais ou inteiros. O algoritmo deve somar todos os elementos do array e, em seguida, dividir o resultado pela quantidade total de posições preenchidas. Caso necessário, trate situações como arrays vazios para evitar erros matemáticos. Este exercício reforça conceitos de agregação de dados, operações aritméticas e uso correto de tipos numéricos em Java.

### Exercício 16

Desenvolva uma rotina que receba um array de `String` e realize sua ordenação em ordem alfabética crescente e, em seguida, em ordem decrescente. Utilize os recursos apropriados da linguagem Java, como `Arrays.sort` e `Comparator`, para implementar ambas as versões. O objetivo é compreender como funciona a ordenação de dados textuais e como customizar critérios de comparação em arrays de objetos.

### Exercício 17

Crie uma classe `Pessoa` com os atributos `nome` e `idade` e, em seguida, implemente um algoritmo que receba um array de objetos dessa classe e o ordene com base na idade das pessoas. O programa deve utilizar um `Comparator` para definir o critério de ordenação e exibir o array antes e depois da ordenação. Esse exercício introduz ordenação de objetos, encapsulamento de dados em classes e comparação customizada de instâncias.

### Exercício 18

Implemente um método que receba um array de inteiros e determine qual é o segundo maior número presente nele, tratando corretamente o caso em que existam valores duplicados. O algoritmo deve ser capaz de distinguir o maior do segundo maior valor sem confundir repetições do mesmo número com posições diferentes. Esse exercício exige atenção à lógica de comparação e ao tratamento de casos especiais, como arrays com poucos elementos ou todos os valores iguais.

### Exercício 19

Crie uma classe que represente uma pessoa com um identificador único e implemente uma busca que receba um array de objetos desse tipo e um `id` específico a ser procurado. O algoritmo deve percorrer a estrutura até encontrar o objeto correspondente ao identificador informado e retornar a referência da pessoa encontrada, ou `null` caso não exista. O exercício pode ser resolvido tanto com laço tradicional quanto com `Arrays.stream(...).filter(...)`, permitindo comparar duas abordagens de busca em arrays de objetos.

### Exercício 20

Desenvolva um algoritmo que receba um array e um número inteiro `k`, representando a quantidade de posições pelas quais os elementos devem ser rotacionados para a direita. A solução deve ser feita de maneira eficiente e, de preferência, alterando o próprio array sem criar outro de mesmo tamanho. Uma estratégia possível é utilizar inversões parciais e totais do array. O objetivo é praticar manipulação de índices, modularidade e otimização de operações em estruturas lineares.

### Exercício 21

Implemente a busca binária iterativa para localizar um valor em um array previamente ordenado. O método deve dividir sucessivamente a área de busca pela metade, comparando o elemento central com o valor desejado até encontrá-lo ou concluir que ele não está presente. Caso o valor exista, o índice correspondente deve ser retornado; caso contrário, deve-se retornar -1. Este exercício é fundamental para compreender algoritmos de busca eficientes e a importância do pré-requisito de ordenação.

### Exercício 22

Crie um programa que receba um array e um número `k`, e gere todas as combinações possíveis de tamanho `k` formadas pelos elementos desse array. A solução deve utilizar a técnica de backtracking para explorar sistematicamente as possibilidades, adicionando e removendo elementos de uma estrutura temporária durante a geração das combinações. O objetivo é introduzir raciocínio combinatório, recursão e exploração de espaço de busca.

### Exercício 23

Implemente o algoritmo Bubble Sort para ordenar um array de inteiros em ordem crescente. O programa deve percorrer repetidamente o array, comparando elementos adjacentes e trocando-os de posição sempre que estiverem fora da ordem correta. Ao final, todos os maiores elementos devem “subir” gradualmente para o final da estrutura. Esse exercício é importante para compreender um dos algoritmos de ordenação mais simples e didáticos da computação.

### Exercício 24

Desenvolva o algoritmo Selection Sort para ordenar um array de números inteiros. A ideia central é percorrer o array buscando, a cada iteração, o menor elemento da parte ainda não ordenada, colocando-o na posição correta. O exercício ajuda a compreender ordenação por seleção, troca de elementos e separação lógica entre parte ordenada e parte não ordenada da estrutura.

### Exercício 25

Implemente o algoritmo Insertion Sort, que ordena um array inserindo cada elemento na posição adequada dentro da porção já ordenada da estrutura. A cada passo, o algoritmo deve deslocar os valores maiores para a direita até encontrar o ponto correto de inserção do elemento atual. Esse exercício reforça o entendimento de ordenação incremental e mostra um algoritmo simples e eficiente para pequenos conjuntos de dados.

### Exercício 26

Crie um método que receba um array de inteiros e retorne uma `String` formatada contendo todos os seus elementos separados por vírgula e espaço, como no exemplo `"1, 2, 3"`. O algoritmo deve tratar corretamente o posicionamento dos separadores, evitando vírgula extra no final da string. O objetivo é praticar formatação textual de dados estruturados e manipulação de strings em Java.

### Exercício 27

Implemente um programa que gere uma matriz identidade de ordem `N`, onde todos os elementos da diagonal principal sejam iguais a 1 e todos os demais sejam iguais a 0. O valor de `N` deve ser recebido como parâmetro ou definido pelo usuário. Após gerar a matriz, o programa deve exibi-la em formato organizado no console. Esse exercício trabalha matrizes quadradas, lógica condicional baseada em índices e representação matemática em estruturas de dados.

### Exercício 28

Modele um tabuleiro de xadrez utilizando uma matriz `8x8` do tipo `char[][]`, atribuindo símbolos para representar as peças de cada jogador em suas posições iniciais. O programa deve preencher corretamente a matriz de acordo com a configuração tradicional do jogo e exibir o tabuleiro de forma legível. Esse exercício é útil para praticar modelagem de problemas reais com matrizes bidimensionais e organização espacial de dados.

### Exercício 29

Crie um algoritmo que gere a sequência de Fibonacci até um determinado número de posições `N`, armazenando os resultados em um array do tipo `long[]`. O programa deve calcular cada novo termo com base na soma dos dois anteriores e preencher gradualmente a estrutura. Esse exercício reforça o trabalho com sequências numéricas, dependência entre posições consecutivas e escolha adequada de tipos numéricos para valores crescentes.

### Exercício 30

Implemente um programa que receba uma matriz quadrada e calcule a soma dos elementos da diagonal principal e da diagonal secundária. O algoritmo deve percorrer a matriz identificando corretamente quais posições pertencem a cada diagonal e, se desejar, tratar o caso do elemento central em matrizes de ordem ímpar para evitar soma duplicada. O objetivo é consolidar o uso de matrizes e relações entre índices de linha e coluna.

---

## Capítulo 4 — Pilhas

### Exercício 31

Implemente uma classe genérica `ArrayStack<E>` baseada em array, contendo as operações fundamentais de uma pilha: empilhar, desempilhar, consultar o topo, verificar se está vazia e retornar sua quantidade de elementos. O objetivo é construir manualmente a estrutura, compreendendo a lógica LIFO e o papel do índice que representa o topo da pilha.

### Exercício 32

Crie testes para a pilha implementada anteriormente, empilhando e desempilhando cem elementos em sequência, de modo a verificar se a ordem de remoção corresponde exatamente ao comportamento esperado de uma pilha. Além disso, implemente e valide uma exceção customizada para o caso em que uma operação de remoção seja realizada em uma pilha vazia. Esse exercício enfatiza validação de comportamento e tratamento de erros.

### Exercício 33

Adicione à sua implementação de pilha um método `clear()` responsável por esvaziar completamente a estrutura. Esse método deve redefinir o estado interno da pilha de forma que ela volte a se comportar como uma pilha recém-criada, sem elementos armazenados. O objetivo é praticar reinicialização de estruturas e manutenção de consistência interna.

### Exercício 34

Implemente a operação `peek()` de forma que seja possível visualizar o elemento localizado no topo da pilha sem removê-lo. O método deve permitir que o usuário consulte o valor atual do topo e, em seguida, verifique que a quantidade de elementos permanece inalterada. O exercício reforça a distinção entre acesso de leitura e remoção de dados em estruturas LIFO.

### Exercício 35

Crie um programa que converta um número decimal inteiro para sua representação binária utilizando uma pilha como estrutura auxiliar. O algoritmo deve dividir sucessivamente o número por dois, armazenar os restos na pilha e, ao final, desempilhar os valores para montar a string binária na ordem correta. Esse exercício demonstra uma aplicação clássica de pilhas em algoritmos de conversão de base.

### Exercício 36

Implemente um método que receba uma expressão textual contendo parênteses, colchetes e chaves, e determine se todos esses símbolos estão devidamente balanceados e corretamente aninhados. O algoritmo deve usar uma pilha para armazenar símbolos de abertura e verificar se cada símbolo de fechamento corresponde ao topo esperado. O objetivo é praticar validação sintática e uso de pilhas em problemas de análise estrutural.

### Exercício 37

Desenvolva um algoritmo que receba uma `String` e a devolva invertida utilizando uma pilha. Cada caractere da string deve ser empilhado individualmente e, em seguida, removido da pilha para formar a nova string invertida. Esse exercício evidencia o comportamento natural da pilha em problemas que exigem inversão de ordem.

### Exercício 38

Modele um histórico simples de navegação de navegador utilizando duas pilhas, uma responsável pelas páginas visitadas anteriormente e outra pelas páginas disponíveis para avançar. O sistema deve permitir visitar novas páginas, voltar para a página anterior e avançar novamente quando possível. Esse exercício mostra uma aplicação prática de pilhas no controle de estados e navegação reversível.

### Exercício 39

Implemente uma pilha baseada em nós encadeados em vez de array. Cada novo elemento deve ser inserido no topo por meio da criação de um nó que aponta para o anterior. O exercício tem como finalidade mostrar outra forma de implementação da estrutura, explorando alocação dinâmica e referências entre objetos.

### Exercício 40

Refatore a implementação da pilha de forma que seus atributos internos fiquem devidamente encapsulados e a classe seja genérica, permitindo armazenar qualquer tipo de dado. Garanta que apenas os métodos públicos controlem o acesso à estrutura e que o usuário não possa modificar diretamente o estado interno da pilha. O foco do exercício está em boas práticas de orientação a objetos e reutilização.

### Exercício 41

Crie um avaliador de expressões em notação pós-fixa, também conhecida como RPN. O algoritmo deve percorrer os tokens da expressão, empilhando operandos e, ao encontrar operadores, desempilhar os valores necessários para realizar a operação correspondente. Ao final, o resultado deve permanecer no topo da pilha. Esse exercício combina pilhas com análise de expressões matemáticas.

### Exercício 42

Desenvolva um conversor de números inteiros para bases entre 2 e 16 utilizando uma pilha. O algoritmo deve repetir a lógica de divisões sucessivas, armazenando restos e utilizando os símbolos adequados para representar valores acima de 9, como `A`, `B`, `C`, `D`, `E` e `F`. Esse exercício amplia a ideia de conversão de base e mostra como pilhas ajudam a corrigir a ordem dos dígitos gerados.

### Exercício 43

Simule a pilha de chamadas de uma função recursiva de fatorial utilizando uma pilha explícita em uma versão iterativa. Em vez de depender da pilha da linguagem, seu algoritmo deve armazenar manualmente os estados necessários para reproduzir o fluxo da computação. O objetivo é entender como a recursão funciona internamente e como ela pode ser transformada em iteração com pilha auxiliar.

### Exercício 44

Melhore a sua implementação de pilha adicionando um método `toString()` que permita visualizar de maneira amigável os elementos atualmente armazenados, respeitando a ordem da base até o topo. Além disso, garanta que os campos internos da classe permaneçam protegidos com modificadores de acesso adequados. O foco deste exercício está na apresentação da estrutura e na manutenção do encapsulamento.

### Exercício 45

Realize um teste de estresse com sua implementação de pilha, empilhando e desempilhando um milhão de inteiros e medindo o tempo total gasto nessas operações. Em seguida, registre observações sobre o desempenho da estrutura, possíveis gargalos e comportamento do consumo de memória. Esse exercício aproxima o estudo de estruturas de dados de cenários mais próximos do uso real e da análise empírica de desempenho.

---

## Capítulo 5 — Filas e Deques

### Exercício 46

Implemente uma classe genérica `ArrayQueue<E>` baseada em array, contendo as operações essenciais de uma fila: enfileirar, desenfileirar, consultar o primeiro elemento, verificar se a fila está vazia e retornar a quantidade de elementos armazenados. O objetivo é compreender a lógica FIFO e a organização dos elementos em ordem de chegada.

### Exercício 47

Crie um teste que enfileire e desenfileire mil itens em sequência, verificando se a ordem de remoção respeita exatamente a ordem em que os elementos foram inseridos. Esse exercício é importante para validar o comportamento FIFO da fila e garantir que a estrutura implementada esteja funcionando corretamente.

### Exercício 48

Adicione à sua fila um método `clear()` responsável por remover logicamente todos os elementos da estrutura. Além disso, implemente o tratamento adequado para o caso em que uma tentativa de desenfileirar seja feita em uma fila vazia. O foco do exercício está na consistência do estado interno e na robustez da implementação.

### Exercício 49

Implemente uma fila circular utilizando um array de tamanho fixo e índices modulares para controlar a posição do início e do fim da fila. O algoritmo deve reaproveitar espaços liberados por remoções anteriores, evitando desperdício de capacidade. Esse exercício é fundamental para entender otimização de espaço em filas baseadas em arrays.

### Exercício 50

Desenvolva uma simulação do jogo Batata Quente utilizando uma fila de nomes. Os participantes devem ser movidos ciclicamente pela fila até que, em determinados momentos, um deles seja removido. O processo deve continuar até restar apenas um vencedor. Esse exercício mostra uma aplicação lúdica e clássica de filas circulares.

### Exercício 51

Modele uma fila de tarefas que simule o processamento assíncrono de operações. Cada tarefa deve ser inserida na fila e processada na ordem de chegada, respeitando o comportamento FIFO. O objetivo é compreender como filas podem ser utilizadas em sistemas reais para controle de tarefas pendentes, impressão, eventos e filas de processamento.

### Exercício 52

Implemente um `Deque<E>` que permita inserções e remoções tanto na frente quanto no final da estrutura. O algoritmo deve oferecer operações que explorem essa flexibilidade e preservar a consistência da estrutura em todos os cenários. O exercício é importante para entender a diferença entre filas comuns e estruturas de dupla extremidade.

### Exercício 53

Crie um algoritmo que verifique se uma palavra ou frase é um palíndromo utilizando um deque. O programa deve comparar os caracteres das duas extremidades da estrutura, removendo e confrontando pares até concluir se a sequência lida da esquerda para a direita é igual à lida da direita para a esquerda. Esse exercício reforça o uso prático de acesso em ambas as pontas.

### Exercício 54

Implemente uma fila de prioridade simples utilizando array e um `Comparator`, de modo que certos elementos possam ser atendidos antes de outros com base em uma regra de prioridade definida. O foco do exercício está em entender que nem toda fila segue apenas a ordem de chegada, pois em muitos problemas reais a prioridade altera a ordem de processamento.

### Exercício 55

Adicione à sua implementação de fila um método `peek()` que permita consultar o elemento da frente sem removê-lo. Em seguida, demonstre com testes que a operação não altera o tamanho nem a ordem dos elementos presentes. Esse exercício reforça a distinção entre leitura e consumo do primeiro item da fila.

### Exercício 56

Modele um sistema de senhas em que existam dois tipos de atendimento: normal e prioritário. O algoritmo deve organizar a ordem de chamada levando em conta regras que favoreçam o atendimento prioritário sem ignorar completamente os usuários comuns. Esse exercício aproxima a estrutura de fila de um problema real de organização de atendimento.

### Exercício 57

Implemente uma fila que aceite apenas números pares. Sempre que o usuário tentar inserir um número ímpar, a operação deve ser rejeitada ou tratada adequadamente. O objetivo é praticar validação de entrada e restrição de regras de negócio dentro de uma estrutura de dados.

### Exercício 58

Garanta que os métodos `size()` e `isEmpty()` da sua fila executem em tempo constante, sem a necessidade de percorrer a estrutura para calcular resultados. Esse exercício enfatiza a importância de manter informações auxiliares atualizadas para melhorar a eficiência das operações básicas.

### Exercício 59

Crie um algoritmo capaz de inverter a ordem dos elementos de uma fila utilizando apenas uma pilha auxiliar. O programa deve retirar os elementos da fila, empilhá-los e, em seguida, recolocá-los na fila, fazendo com que a ordem final fique invertida. Esse exercício explora a interação entre duas estruturas clássicas com comportamentos opostos.

### Exercício 60

Implemente uma simulação de fila de impressão em que cada documento possua uma prioridade numérica, sendo que valores menores representam maior urgência. O sistema deve decidir qual documento será impresso antes com base nessa prioridade, e não apenas na ordem de chegada. O exercício aproxima o estudo de filas de problemas administrativos e de sistemas operacionais.

---

## Capítulo 6 — Listas Ligadas

### Exercício 61

Implemente uma lista simplesmente ligada genérica com operações para inserir elementos no início, inserir no final, remover o primeiro elemento e remover um elemento específico pelo valor. O objetivo é construir a estrutura do zero e compreender o papel dos nós e dos ponteiros entre eles.

### Exercício 62

Adicione à sua lista ligada um método que permita inserir um novo elemento em uma posição específica informada por índice. O algoritmo deve percorrer a lista até o ponto correto, ajustar os ponteiros necessários e validar se o índice informado é compatível com o tamanho atual da estrutura. Esse exercício aprofunda o controle posicional em listas encadeadas.

### Exercício 63

Implemente métodos para remoção por valor e por índice em uma lista ligada. O programa deve tratar corretamente casos como remoção do primeiro nó, remoção do último nó e tentativa de remoção em índices inválidos. O objetivo é desenvolver domínio sobre manipulação de referências entre nós.

### Exercício 64

Crie os métodos `contains(E e)` e `indexOf(E e)` para sua lista ligada. O primeiro deve verificar se determinado valor existe na estrutura, enquanto o segundo deve retornar a posição da primeira ocorrência encontrada. Esse exercício ajuda a consolidar a travessia sequencial de listas encadeadas.

### Exercício 65

Implemente os métodos `size()` e `isEmpty()` na sua lista ligada, garantindo que eles representem corretamente a quantidade atual de elementos e se a lista possui ou não conteúdo armazenado. O foco do exercício está na administração do estado interno da estrutura.

### Exercício 66

Adicione um método `toString()` que percorra a lista ligada e apresente seus elementos em uma representação textual amigável, utilizando um formato como `A -> B -> C`. Esse exercício melhora a visualização da estrutura e ajuda no processo de depuração e validação do comportamento.

### Exercício 67

Implemente uma lista duplamente ligada, na qual cada nó possua referência tanto para o próximo quanto para o anterior. O objetivo é compreender como esse tipo de estrutura amplia a flexibilidade de navegação e remoção de elementos em relação à lista simplesmente ligada.

### Exercício 68

Adicione à lista duplamente ligada operações de inserção e remoção em posições específicas, ajustando corretamente os ponteiros `prev` e `next` dos nós vizinhos. Esse exercício exige atenção redobrada à consistência dos encadeamentos em duas direções.

### Exercício 69

Implemente uma lista circular simples, na qual o último nó não aponta para `null`, mas sim para o primeiro elemento da estrutura. O objetivo é compreender como listas circulares alteram a lógica de travessia e permitem modelar problemas cíclicos com mais naturalidade.

### Exercício 70

Desenvolva um algoritmo que detecte se uma lista ligada é circular utilizando a técnica de Floyd, também conhecida como método da lebre e da tartaruga. O exercício tem como finalidade introduzir um algoritmo clássico de detecção de ciclos em listas.

### Exercício 71

Implemente uma lista ligada ordenada automaticamente, de modo que cada novo elemento seja inserido na posição correta de acordo com a ordem natural definida por `Comparable`. O objetivo é praticar inserção ordenada e manutenção de invariantes estruturais.

### Exercício 72

Crie um método que inverta uma lista ligada no próprio lugar, modificando as referências entre os nós sem criar uma nova lista. Esse exercício é importante para o domínio de manipulação de ponteiros e raciocínio sobre encadeamento reverso.

### Exercício 73

Implemente um algoritmo que encontre o elemento do meio de uma lista ligada utilizando dois ponteiros, um avançando de um em um nó e outro de dois em dois. O exercício reforça o uso de estratégias eficientes em estruturas encadeadas sem acesso direto por índice.

### Exercício 74

Desenvolva uma rotina que remova elementos duplicados de uma lista ligada. Você pode criar duas versões: uma usando uma estrutura auxiliar, como `Set`, e outra sem espaço adicional, apenas com comparação entre nós. O objetivo é comparar soluções com diferentes trade-offs de tempo e espaço.

### Exercício 75

Implemente uma pilha utilizando uma lista ligada como estrutura subjacente. A ideia é encapsular a lógica da lista de modo que o usuário interaja apenas com operações típicas de pilha. Esse exercício mostra como diferentes estruturas podem ser construídas sobre outras já existentes.

### Exercício 76

Garanta que sua lista ligada mantenha acesso eficiente ao primeiro e ao último elemento por meio de referências apropriadas, permitindo a implementação de métodos como `getFirst()` e `getLast()` em tempo constante. O foco está em otimização estrutural.

### Exercício 77

Crie um método que percorra a lista até uma posição específica informada por índice e retorne o valor armazenado naquele nó. O algoritmo deve validar se o índice existe e percorrer a estrutura passo a passo até alcançá-lo. O exercício reforça a diferença entre acesso sequencial em listas e acesso direto em arrays.

### Exercício 78

Implemente uma rotina que conte quantas vezes um determinado elemento aparece em uma lista ligada. O programa deve percorrer toda a estrutura e incrementar um contador sempre que o valor procurado for encontrado. Esse exercício trabalha busca completa e contagem de frequência em listas.

### Exercício 79

Desenvolva um método que compare duas listas ligadas e determine se elas possuem exatamente o mesmo conteúdo, na mesma ordem. O exercício deve considerar tanto o tamanho das listas quanto a igualdade entre os elementos correspondentes. O objetivo é praticar comparação estrutural e semântica entre coleções encadeadas.

### Exercício 80

Implemente um algoritmo que receba duas listas ligadas já ordenadas e produza uma terceira lista também ordenada, contendo os elementos das duas estruturas mesclados corretamente. O exercício introduz a ideia de intercalação ordenada, bastante utilizada em algoritmos de ordenação como o merge sort.

---

## Capítulo 7 — Conjuntos

### Exercício 81

Implemente uma estrutura `SimpleSet<E>` baseada em array, garantindo que nenhum elemento duplicado possa ser armazenado. Sempre que houver tentativa de inserção de um valor já existente, a estrutura deve ignorar a operação ou tratá-la de maneira adequada. O exercício introduz os fundamentos da abstração de conjunto.

### Exercício 82

Adicione ao seu conjunto as operações básicas de inserção, remoção, verificação de existência e obtenção da quantidade de elementos. O objetivo é reproduzir o comportamento fundamental de um conjunto, reforçando as regras de unicidade dos elementos.

### Exercício 83

Crie um método que receba uma `List<E>` com possíveis valores repetidos e gere um conjunto contendo apenas os elementos únicos. O exercício é útil para demonstrar como conjuntos podem ser usados na eliminação de duplicatas de forma simples e eficiente.

### Exercício 84

Implemente a operação de união entre dois conjuntos, gerando uma nova estrutura que contenha todos os elementos de ambos, sem repetição. Esse exercício trabalha diretamente o conceito matemático de união aplicado a estruturas de dados.

### Exercício 85

Desenvolva a operação de interseção entre dois conjuntos, retornando apenas os elementos que estejam presentes simultaneamente em ambos. O objetivo é praticar comparação de coleções e raciocínio baseado em pertinência.

### Exercício 86

Implemente a diferença entre conjuntos, retornando todos os elementos que pertencem ao conjunto `A` mas não pertencem ao conjunto `B`. Esse exercício reforça operações clássicas da teoria dos conjuntos no contexto computacional.

### Exercício 87

Crie um método que verifique se um conjunto `A` é subconjunto de outro conjunto `B`. O algoritmo deve analisar se todos os elementos de `A` estão contidos em `B`. Esse exercício introduz a relação de inclusão entre coleções sem repetição.

### Exercício 88

Replique, em uma implementação própria, a API básica de um `Set` da Java Collections Framework. O objetivo não é copiar toda a biblioteca, mas compreender quais operações são essenciais e como elas podem ser modeladas com seus próprios mecanismos internos.

### Exercício 89

Implemente uma rotina que compare dois conjuntos e determine se eles são iguais em conteúdo, independentemente da ordem em que os elementos foram inseridos. Esse exercício reforça a ideia de que, em conjuntos, o que importa é a presença dos elementos, e não sua posição.

### Exercício 90

Crie um método utilitário capaz de receber arrays e transformá-los em conjuntos, removendo automaticamente valores duplicados. O objetivo é praticar conversão entre estruturas e explorar uma aplicação bastante comum dos conjuntos.

### Exercício 91

Implemente um método estático `of(E... e)` que receba uma quantidade variável de argumentos e retorne um conjunto com esses elementos. O exercício ajuda a praticar o uso de `varargs` e a construção de APIs mais flexíveis.

### Exercício 92

Desenvolva um programa que receba um texto grande e conte quantas palavras únicas existem nele. O algoritmo deve separar as palavras, normalizar o conteúdo se necessário e armazená-las em um conjunto. Esse exercício aproxima o uso de conjuntos de problemas de análise textual.

### Exercício 93

Crie uma rotina que receba dois arrays e determine se existe pelo menos um elemento em comum entre eles. O algoritmo deve retornar um valor booleano indicando a existência ou não de interseção. Esse exercício mostra uma aplicação prática de conjuntos para comparação rápida entre coleções.

### Exercício 94

Implemente um multiconjunto, também chamado de bag, em que um mesmo elemento pode aparecer mais de uma vez, mas a estrutura registra a quantidade de ocorrências associada a cada valor. O exercício ajuda a entender a diferença entre conjunto tradicional e estruturas baseadas em contagem.

### Exercício 95

Desenvolva um algoritmo que calcule a interseção entre três conjuntos simultaneamente, retornando apenas os elementos que estejam presentes nos três. O exercício expande o raciocínio de operações entre conjuntos para múltiplas coleções.

---

## Capítulo 8 — Dicionários e Hashes

### Exercício 96

Implemente uma classe `Dictionary<K,V>` simples, encapsulando internamente um `HashMap` e oferecendo uma interface própria para armazenar pares chave-valor. O objetivo é compreender a abstração de dicionário como estrutura de associação entre chaves únicas e valores correspondentes.

### Exercício 97

Adicione ao seu dicionário os métodos fundamentais de inserção, busca, remoção, verificação de existência de chave, verificação de existência de valor e consulta do tamanho. O exercício reforça o domínio das operações essenciais de mapas e tabelas associativas.

### Exercício 98

Crie exemplos que percorram as chaves, os valores e as entradas completas de um mapa utilizando laços `for-each`. O objetivo é entender as diferentes formas de iteração sobre estruturas chave-valor e quando cada uma delas é mais apropriada.

### Exercício 99

Implemente um contador de frequência de palavras utilizando `Map<String, Integer>`. O programa deve receber um texto, separar as palavras e atualizar o mapa para registrar quantas vezes cada termo aparece. Esse exercício mostra uma aplicação muito comum de dicionários em processamento textual.

### Exercício 100

Implemente sua própria tabela hash com uma função hash básica e estratégia de encadeamento separado para tratamento de colisões. O objetivo é compreender a mecânica interna das estruturas de hashing, em vez de apenas utilizá-las prontas.

### Exercício 101

Adicione à sua tabela hash a operação de inserção, tratando colisões por meio de listas encadeadas ou outra estrutura por bucket. O exercício ajuda a visualizar como múltiplas chaves podem cair na mesma posição e ainda assim serem armazenadas corretamente.

### Exercício 102

Implemente uma segunda versão da tabela hash utilizando sondagem linear, na qual colisões são resolvidas buscando a próxima posição disponível no array. O objetivo é comparar diferentes estratégias de tratamento de colisões.

### Exercício 103

Desenvolva os métodos de busca e remoção para sua tabela hash própria, garantindo que funcionem corretamente mesmo quando houver colisões. Esse exercício exige atenção ao percurso de busca e à consistência da estrutura após exclusões.

### Exercício 104

Escreva uma comparação entre sua implementação de tabela hash e o `HashMap` da biblioteca padrão, destacando diferenças de API, desempenho, flexibilidade e recursos internos. O objetivo aqui é unir prática de implementação com reflexão conceitual.

### Exercício 105

Melhore sua função hash utilizando combinações mais robustas com `hashCode()` e operações bit a bit, buscando reduzir colisões e distribuir melhor as chaves pela tabela. Esse exercício aprofunda o entendimento sobre a qualidade de funções hash.

### Exercício 106

Modele o conceito de mapa tradicional e discuta o uso de `WeakHashMap`, ainda que a implementação prática fique restrita ao mapa comum. O exercício busca ampliar a visão sobre diferentes comportamentos de mapeamento e gerenciamento de memória.

### Exercício 107

Crie um dicionário de sinônimos utilizando `Map<String, Set<String>>`, em que cada palavra esteja associada a um conjunto de termos equivalentes. O programa deve permitir cadastro, consulta e exibição dos sinônimos associados a uma determinada entrada.

### Exercício 108

Implemente uma cache LRU simples utilizando `LinkedHashMap`, sobrescrevendo o método adequado para remover automaticamente o elemento menos recentemente utilizado quando a capacidade máxima for excedida. Esse exercício aproxima o estudo de mapas de problemas reais de otimização.

### Exercício 109

Desenvolva um índice invertido de documentos no formato `termo -> lista de ids`, permitindo consultar rapidamente em quais documentos determinado termo aparece. Esse exercício é muito relevante para busca textual, sistemas de pesquisa e recuperação de informação.

### Exercício 110

Implemente a persistência de um mapa em arquivo, utilizando serialização binária ou JSON, e crie também a rotina de recarregamento desses dados para a memória. O objetivo é mostrar como estruturas de dados podem sair do contexto temporário da execução e serem armazenadas permanentemente.

---

## Capítulo 9 — Recursão

### Exercício 111

Implemente o cálculo do fatorial de um número tanto de forma recursiva quanto iterativa, e compare as duas abordagens em termos de legibilidade, consumo de memória e funcionamento lógico. O exercício é uma introdução clássica à recursão.

### Exercício 112

Desenvolva três versões do cálculo de Fibonacci: uma puramente recursiva, uma recursiva com memoização e uma iterativa. Em seguida, compare o desempenho e a quantidade de recomputações realizadas por cada abordagem. O objetivo é entender os impactos práticos da recursão ingênua.

### Exercício 113

Crie um método recursivo que receba uma string e retorne essa mesma string invertida. O algoritmo deve trabalhar reduzindo o problema a subproblemas menores até atingir o caso-base. O exercício reforça a ideia de decomposição recursiva.

### Exercício 114

Implemente a soma dos elementos de um array de forma recursiva, tratando o problema como a soma do primeiro elemento com a soma recursiva do restante do array. Esse exercício ajuda a enxergar como estruturas lineares podem ser processadas recursivamente.

### Exercício 115

Desenvolva uma função recursiva capaz de contar quantas vezes um valor `x` aparece em um array. A solução deve percorrer logicamente o array por meio da recursão, reduzindo gradualmente a faixa analisada. O exercício combina recursão com contagem de frequência.

### Exercício 116

Modele uma estrutura semelhante a uma árvore JSON utilizando `Map` e `List`, e implemente uma rotina recursiva que percorra essa estrutura coletando todas as chaves encontradas. O exercício mostra a utilidade da recursão em dados hierárquicos heterogêneos.

### Exercício 117

Crie um gerador recursivo de combinações de tamanho `k` a partir de uma lista de elementos. O algoritmo deve construir as combinações passo a passo, avançando ou retrocedendo conforme necessário. O exercício é um ótimo exemplo de backtracking.

### Exercício 118

Implemente a solução clássica das Torres de Hanói, gerando a sequência de movimentos necessários para transferir os discos de uma torre de origem para uma torre de destino. Esse exercício é um dos exemplos mais tradicionais para compreender recursão.

### Exercício 119

Crie uma função recursiva que determine o maior valor presente em um array. O algoritmo deve comparar o elemento atual com o maior valor do restante da estrutura, reduzindo o problema progressivamente. O objetivo é praticar recursão com comparação acumulada.

### Exercício 120

Implemente a multiplicação de dois inteiros positivos utilizando apenas somas recursivas, sem usar diretamente o operador `*`. Esse exercício demonstra como uma operação aparentemente simples pode ser decomposta em chamadas recursivas menores.

---

## Capítulo 10 — Árvores

### Exercício 121

Implemente uma classe `Node<T>` e uma árvore binária de busca genérica com operação de inserção. O exercício tem como objetivo introduzir a estrutura hierárquica das árvores e a propriedade que organiza seus elementos de acordo com comparação de chaves.

### Exercício 122

Insira uma sequência de valores em uma árvore binária de busca e implemente um percurso em ordem que retorne os elementos em sequência crescente. O objetivo é mostrar, na prática, uma das propriedades mais importantes da BST.

### Exercício 123

Crie um método de percurso in-order que devolva uma `List<T>` em vez de apenas imprimir os valores. Isso torna a operação mais reutilizável em outros contextos do sistema e reforça a ideia de separação entre processamento e apresentação.

### Exercício 124

Implemente também os percursos pré-ordem e pós-ordem, retornando listas com os elementos visitados em cada ordem. O exercício ajuda a compreender diferentes estratégias de travessia de árvores e suas aplicações.

### Exercício 125

Desenvolva um método `contains(T key)` para verificar se um determinado valor está presente em uma árvore binária de busca. O algoritmo deve aproveitar a propriedade de ordenação para reduzir o espaço de busca a cada passo.

### Exercício 126

Implemente os métodos `min()` e `max()` em uma BST, retornando respectivamente o menor e o maior valor armazenado na estrutura. O exercício mostra como a organização da árvore facilita certas consultas.

### Exercício 127

Crie uma função recursiva para calcular a altura de uma árvore. O valor retornado deve representar o maior número de níveis ou arestas entre a raiz e uma folha, dependendo da convenção adotada. Esse exercício é importante para análise estrutural.

### Exercício 128

Implemente rotinas que contem a quantidade total de nós e a quantidade de folhas de uma árvore binária. O objetivo é extrair informações estatísticas da estrutura e reforçar percursos recursivos.

### Exercício 129

Desenvolva a operação de remoção em uma árvore binária de busca, tratando corretamente os três casos possíveis: remoção de nó sem filhos, com um filho e com dois filhos. Esse é um dos exercícios mais importantes para domínio completo da BST.

### Exercício 130

Implemente uma árvore AVL com inserção automática mantendo o balanceamento após cada nova chave adicionada. O objetivo é compreender como árvores autobalanceadas melhoram o desempenho de busca.

### Exercício 131

Desenvolva as rotações simples LL e RR necessárias para reequilibrar uma árvore AVL em cenários apropriados. Esse exercício foca no mecanismo central de correção estrutural das árvores balanceadas.

### Exercício 132

Implemente também as rotações duplas LR e RL, aplicadas quando uma rotação simples não é suficiente para restaurar o balanceamento da árvore. O exercício aprofunda o estudo de AVL.

### Exercício 133

Crie um método que calcule o fator de balanceamento de um nó e verifique se sua árvore atende às restrições de uma AVL. O objetivo é formalizar a regra que define quando a estrutura está ou não balanceada.

### Exercício 134

Realize testes com inserção múltipla em uma AVL, verificando se a árvore permanece balanceada após sequências variadas de dados. O exercício reforça a importância da validação empírica em estruturas complexas.

### Exercício 135

Implemente a inserção em uma árvore rubro-negra, respeitando as regras de coloração e balanceamento características dessa estrutura. Esse exercício é mais avançado e exige cuidado com invariantes.

### Exercício 136

Crie uma rotina que valide as propriedades de uma árvore rubro-negra após inserções, como raiz preta, ausência de dois nós vermelhos consecutivos e consistência da altura negra. O exercício complementa a implementação anterior com verificação formal.

### Exercício 137

Implemente as rotações e recolorações necessárias para corrigir a árvore rubro-negra sempre que uma inserção violar suas propriedades. O objetivo é compreender o processo de restauração de equilíbrio.

### Exercício 138

Desenvolva um método genérico para contar folhas em qualquer árvore binária, independentemente de ela ser BST, AVL ou rubro-negra. O exercício destaca a reutilização de lógica estrutural.

### Exercício 139

Crie uma função que determine o nível ou profundidade de um nó específico em uma árvore com base em seu valor. O algoritmo deve indicar quantos passos separam o nó da raiz. Esse exercício ajuda a compreender posição relativa em estruturas hierárquicas.

### Exercício 140

Implemente um método que compare duas árvores e verifique se elas são idênticas, isto é, se possuem exatamente a mesma forma e os mesmos valores nas mesmas posições. O exercício trabalha comparação estrutural recursiva.

---

## Capítulo 11 — Heaps

### Exercício 141

Implemente uma `MinHeap` com operações de inserção, consulta ao menor elemento, remoção do menor e consulta de tamanho. O objetivo é compreender a propriedade de heap e sua representação eficiente em array.

### Exercício 142

Insira sucessivos valores na min-heap e garanta, após cada inserção, que a propriedade da estrutura seja mantida por meio de subidas apropriadas do elemento recém-adicionado. Esse exercício foca no processo de `siftUp`.

### Exercício 143

Implemente a operação de extração do menor elemento, reorganizando a heap para que continue válida após a remoção. O foco está na lógica de `siftDown` e na manutenção da propriedade da raiz mínima.

### Exercício 144

Crie métodos que retornem o menor e o maior valor em uma min-heap, observando que o menor está na raiz, mas o maior pode exigir varredura. O exercício ajuda a entender o que a estrutura garante e o que ela não garante diretamente.

### Exercício 145

Implemente uma `MaxHeap` com as mesmas operações fundamentais, mas agora organizada de forma que o maior elemento esteja sempre na raiz. O objetivo é comparar min-heaps e max-heaps.

### Exercício 146

Desenvolva um algoritmo `heapify` capaz de transformar um array comum em heap em tempo linear. Esse exercício é essencial para entender construção eficiente de heaps e serve de base para outros algoritmos.

### Exercício 147

Utilize sua min-heap para simular uma fila de prioridade, mostrando como tarefas ou elementos com menor valor de prioridade podem ser recuperados antes dos demais. O exercício aproxima heaps de aplicações práticas.

### Exercício 148

Implemente os métodos `siftUp` e `siftDown` de maneira clara, modular e testável. O objetivo é deixar a implementação da heap mais organizada e favorecer testes unitários dos mecanismos centrais da estrutura.

### Exercício 149

Crie o algoritmo Heap Sort utilizando sua max-heap para ordenar um array. O exercício ajuda a compreender como estruturas de dados podem ser usadas como base para algoritmos clássicos de ordenação.

### Exercício 150

Realize um experimento comparando o tempo de execução do heap sort com o quick sort em arrays grandes, registrando observações sobre desempenho em diferentes tamanhos de entrada. O foco está em análise empírica de algoritmos.

---

## Capítulo 12 — Grafos

### Exercício 151

Implemente uma classe genérica de grafo, permitindo adicionar vértices, adicionar arestas, remover conexões, remover vértices e consultar vizinhos. O objetivo é construir a estrutura base para os demais algoritmos de grafos.

### Exercício 152

Implemente a busca em largura, iniciando em um vértice escolhido e retornando a ordem de visita dos nós. O algoritmo deve utilizar fila para explorar o grafo em camadas sucessivas. Esse exercício é fundamental para travessia em grafos.

### Exercício 153

Desenvolva a busca em profundidade nas versões recursiva e iterativa, retornando a ordem de visita em pré-ordem. O exercício permite comparar duas estratégias de exploração do grafo e entender o uso de pilha implícita ou explícita.

### Exercício 154

Crie um método que determine se um grafo não dirigido é conectado, ou seja, se todos os vértices podem ser alcançados a partir de qualquer ponto inicial. O objetivo é aplicar travessias para análise de conectividade.

### Exercício 155

Implemente a obtenção do caminho mais curto em grafos não ponderados utilizando BFS e reconstrução do caminho com vetor ou mapa de pais. O exercício é importante para mostrar que a BFS não serve apenas para visitar nós, mas também para resolver caminhos mínimos em certos cenários.

### Exercício 156

Desenvolva um algoritmo que identifique todos os componentes conectados de um grafo, retornando grupos de vértices separados conforme a conectividade. O exercício amplia a análise estrutural de grafos.

### Exercício 157

Implemente o algoritmo de Dijkstra para calcular os menores custos a partir de um vértice origem em um grafo com pesos não negativos. O exercício é central no estudo de caminhos mínimos em grafos ponderados.

### Exercício 158

Crie a implementação do algoritmo de Floyd-Warshall para obter as menores distâncias entre todos os pares de vértices a partir de uma matriz de adjacência ponderada. O exercício introduz programação dinâmica aplicada a grafos.

### Exercício 159

Desenvolva uma rotina que detecte ciclos em grafos dirigidos utilizando marcação de cores ou uma pilha de recursão auxiliar. O objetivo é compreender dependências cíclicas e validação estrutural em grafos orientados.

### Exercício 160

Implemente o algoritmo de Prim para construir uma árvore geradora mínima, retornando as arestas escolhidas e o peso total da solução. O exercício mostra como conectar todos os vértices com custo mínimo.

### Exercício 161

Implemente também o algoritmo de Kruskal utilizando uma estrutura Union-Find com compressão de caminho e união por rank. O objetivo é comparar outra estratégia clássica para obter árvore geradora mínima.

### Exercício 162

Crie um método que verifique se um grafo é bipartido, utilizando BFS para colorir os vértices com duas cores e detectar conflitos. O exercício é útil para problemas de particionamento e modelagem de incompatibilidades.

### Exercício 163

Implemente rotinas para calcular o grau de cada vértice, considerando grau total em grafos não dirigidos e graus de entrada e saída em grafos dirigidos. O exercício trabalha propriedades locais de vértices.

### Exercício 164

Desenvolva um algoritmo para calcular menores caminhos em um DAG utilizando ordenação topológica. O objetivo é mostrar que grafos acíclicos dirigidos permitem soluções mais eficientes para certos problemas.

### Exercício 165

Implemente a ordenação topológica utilizando o algoritmo de Kahn ou DFS com pós-ordem. Esse exercício é essencial para resolver problemas de dependência entre tarefas, módulos ou etapas.

---

## Capítulo 13 — Ordenação e Busca

### Exercício 166

Implemente uma versão otimizada do Bubble Sort que interrompa a execução caso nenhuma troca seja realizada em uma passagem completa. Além disso, conte quantas trocas foram feitas ao longo da ordenação. O exercício trabalha otimização simples e instrumentação de algoritmos.

### Exercício 167

Desenvolva o Selection Sort registrando, a cada iteração, qual índice foi escolhido como o menor da parte não ordenada. O objetivo é tornar o funcionamento do algoritmo mais visível e analítico.

### Exercício 168

Implemente o Insertion Sort contabilizando o número de deslocamentos realizados durante a ordenação. Esse exercício permite avaliar com mais precisão o custo da movimentação de elementos.

### Exercício 169

Crie uma implementação estável do Merge Sort e destaque sua complexidade temporal e espacial. O objetivo é compreender um algoritmo de divisão e conquista muito importante e amplamente utilizado.

### Exercício 170

Implemente o Quick Sort in-place usando pivô por mediana de três e, opcionalmente, caindo para insertion sort em subarrays pequenos. O exercício aprofunda o estudo de otimizações em algoritmos clássicos de ordenação.

### Exercício 171

Desenvolva o Counting Sort para inteiros não negativos, garantindo estabilidade na ordenação. Esse exercício mostra uma abordagem não comparativa para ordenação de dados.

### Exercício 172

Implemente o Bucket Sort para números de ponto flutuante no intervalo `[0,1)`, utilizando insertion sort dentro de cada balde. O exercício ajuda a entender algoritmos de distribuição.

### Exercício 173

Crie uma implementação do Radix Sort LSD em base 10 para inteiros não negativos. O objetivo é estudar ordenação por dígitos e sua relação com counting sort.

### Exercício 174

Implemente a busca linear comum e uma versão com sentinela, comparando o funcionamento das duas abordagens. Esse exercício trabalha pequenas otimizações em algoritmos simples de busca.

### Exercício 175

Desenvolva uma variação da busca binária que retorne a primeira ocorrência de um valor repetido em um array ordenado. O objetivo é ir além da busca binária básica e explorar problemas de limite inferior.

### Exercício 176

Implemente a busca por interpolação assumindo distribuição aproximadamente uniforme dos valores. O exercício permite comparar outra estratégia de busca ordenada e seus pressupostos.

### Exercício 177

Realize um experimento de tempo médio com cinco execuções para bubble sort, insertion sort, merge sort e quick sort em diferentes tamanhos de entrada, utilizando `System.nanoTime()`. O foco está em medição experimental e comparação prática.

### Exercício 178

Exporte os tempos coletados para um arquivo CSV, de modo que eles possam ser analisados ou plotados externamente. O exercício aproxima programação de análise de dados e documentação experimental.

### Exercício 179

Implemente o algoritmo Fisher-Yates para embaralhar um array e, em seguida, tente validar empiricamente a uniformidade do embaralhamento contando frequências de permutações em pequenos casos. O exercício aborda aleatoriedade e geração de permutações.

### Exercício 180

Crie uma ordenação multi-chave para objetos `Pessoa`, priorizando sobrenome, depois nome e, por fim, idade. O exercício reforça composição de comparadores e ordenação de objetos com múltiplos critérios.

---

## Capítulo 14 — Designs e Técnicas

### Exercício 181

Implemente a solução de mochila 0/1 com programação dinâmica bottom-up, retornando não apenas o valor máximo obtido, mas também quais itens foram escolhidos para alcançar esse valor. Esse exercício é uma introdução clássica à otimização discreta.

### Exercício 182

Desenvolva o problema do troco mínimo usando programação dinâmica, encontrando a menor quantidade de moedas necessária para formar um valor alvo e, se possível, reconstruindo a combinação utilizada. O objetivo é entender otimização incremental por subproblemas.

### Exercício 183

Implemente o algoritmo de Maior Subsequência Comum entre duas strings, retornando tanto o tamanho quanto a subsequência reconstruída. Esse exercício é um clássico da programação dinâmica aplicada a sequências.

### Exercício 184

Desenvolva a solução para o problema da cadeia de multiplicação de matrizes, calculando o custo mínimo de multiplicação e indicando a parentização ótima. O exercício exige raciocínio sobre ordem de operações e minimização de custo.

### Exercício 185

Implemente um resolvedor de Sudoku 9x9 utilizando backtracking e, opcionalmente, uma heurística como MRV para escolher a próxima célula. O exercício mostra uma aplicação rica de busca com retrocesso.

### Exercício 186

Modele um labirinto em grade e utilize BFS para encontrar o caminho mínimo entre uma posição inicial e uma posição final. O objetivo é aplicar busca em largura em um problema espacial.

### Exercício 187

Implemente o algoritmo de Kadane para encontrar o subarray de soma máxima e compare com uma versão por divisão e conquista. O exercício permite comparar estratégias diferentes para o mesmo problema.

### Exercício 188

Crie funções utilitárias `lowerBound` e `upperBound` para arrays ordenados, retornando respectivamente a primeira posição possível de inserção de um valor e a posição após sua última ocorrência. O exercício aprofunda conceitos relacionados à busca binária.

### Exercício 189

Resolva o problema de seleção de atividades utilizando uma estratégia gulosa baseada no horário de término. O programa deve escolher o maior número possível de atividades compatíveis entre si. Esse exercício introduz algoritmos gulosos.

### Exercício 190

Implemente a mochila fracionária com abordagem gulosa, ordenando os itens pela razão valor/peso e escolhendo frações quando necessário. O exercício mostra um caso em que a estratégia gulosa produz solução ótima.

### Exercício 191

Construa um exemplo em que uma estratégia gulosa falha para a mochila 0/1, mas a programação dinâmica encontra a solução ótima. O objetivo é desenvolver senso crítico sobre quando uma técnica é adequada ou insuficiente.

### Exercício 192

Implemente um gerador e solucionador de Sudoku, produzindo tabuleiros válidos com diferentes níveis de dificuldade e validando se a solução pode ser obtida corretamente. Esse exercício é mais avançado e combina geração, validação e resolução.

### Exercício 193

Crie um mecanismo simples de memoização que associe listas de argumentos a resultados já computados, e aplique essa ideia a uma função como Fibonacci. O objetivo é compreender reuso de resultados e redução de recomputação.

### Exercício 194

Refatore um processamento de coleção para o estilo funcional com Streams, calculando a soma dos quadrados dos números pares sem utilizar mutações externas. O exercício trabalha transformação declarativa de dados.

### Exercício 195

Crie um pipeline real com Streams a partir de uma lista de pedidos, calculando faturamento por categoria e ticket médio por agrupamento. O exercício aproxima a API funcional do Java de situações comuns em sistemas de negócio.

---

## Capítulo 15 — Complexidade

### Exercício 196

Analise assintoticamente um trecho de código com dois laços aninhados, explicando por que sua complexidade temporal é quadrática e qual é o espaço adicional utilizado. O exercício introduz formalização de custo de algoritmos.

### Exercício 197

Classifique três trechos de código distintos quanto à complexidade temporal, identificando um caso linear, um logarítmico e um quadrático. Além de classificar, justifique com clareza por que cada trecho pertence à classe indicada.

### Exercício 198

Monte uma tabela comparativa contendo, para vários algoritmos de ordenação, seus melhores, médios e piores casos, além de informar se são estáveis e se operam in-place. O objetivo é consolidar visão comparativa entre algoritmos.

### Exercício 199

Gere valores para funções de crescimento como `n`, `n log n`, `n²` e `2^n` em um intervalo pequeno, salve os resultados em CSV e escreva uma breve análise sobre como essas curvas se afastam conforme `n` cresce. O exercício relaciona matemática e desempenho de algoritmos.

### Exercício 200

Implemente uma heurística para o problema do caixeiro viajante utilizando vizinho mais próximo e, em seguida, refine a rota com 2-opt. Ao final, compare a distância inicial com a distância melhorada e registre suas observações. Esse exercício encerra a lista com um problema clássico de otimização heurística.
