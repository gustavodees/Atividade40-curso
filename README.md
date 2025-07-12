# Calculadora de Soma e Média de Números em Java

Este projeto consiste em um programa Java simples que lê uma quantidade especificada de números (podendo ser decimais) inseridos pelo usuário, calcula a soma e a média desses números e, em seguida, exibe todos os valores digitados, a soma total e a média.

**Autor:** gustavodees

## Arquivos Incluídos

* `principal/Main.java`: Contém a classe principal com o método `main`, responsável por obter a entrada do usuário, armazenar os números, calcular a soma e a média e exibir os resultados.

## Como Usar

1.  **Salve o arquivo:** Salve o código fornecido em um arquivo chamado `Main.java` dentro de uma pasta chamada `principal`.
2.  **Compile o código:** Abra um terminal ou prompt de comando, navegue até o diretório raiz do seu projeto e compile o arquivo Java utilizando o compilador Java:

    ```bash
    javac principal/Main.java
    ```

3.  **Execute o programa:** Após a compilação ser concluída com sucesso, execute a classe `Main` com o comando:

    ```bash
    java principal.Main
    ```

4.  **Entrada de Dados:**
    * O programa primeiro solicitará que você digite a quantidade de números que você deseja inserir. Digite o número desejado e pressione Enter.
    * Em seguida, o programa pedirá que você digite cada um dos números, um por vez. Para cada número, digite-o e pressione Enter.

5.  **Resultado:** Após inserir todos os números, o programa exibirá:
    * Uma lista de todos os valores que você digitou, mostrando o índice (posição) de cada valor.
    * A soma total de todos os números digitados.
    * A média dos números digitados.

## Explicação do Código

### `principal/Main.java`

Este arquivo contém a classe `Main`, que é o ponto de entrada do programa.

* **Método `main`:**
    1.  Cria um objeto da classe `Scanner` para permitir a leitura de dados inseridos pelo usuário no console.
    2.  Solicita ao usuário que digite a quantidade de números que ele vai digitar e armazena esse valor na variável inteira `n`.
    3.  Cria um array de números de ponto flutuante de dupla precisão (`double`) chamado `vect` com o tamanho especificado por `n`. Este array será utilizado para armazenar os números digitados pelo usuário.
    4.  Utiliza um loop `for` para iterar `n` vezes (para cada número que o usuário irá digitar). Em cada iteração:
        * Solicita ao usuário que digite o próximo número.
        * Lê o número decimal inserido pelo usuário e armazena no array `vect` na posição correspondente ao índice `i`.
    5.  Inicializa uma variável `double` chamada `soma` com o valor 0.0. Esta variável será usada para acumular a soma de todos os números.
    6.  Utiliza outro loop `for` para percorrer o array `vect` novamente. Em cada iteração:
        * Adiciona o valor do número armazenado em `vect[i]` à variável `soma`.
    7.  Calcula a média dos números dividindo a `soma` pelo número de elementos no array (`vect.length`) e armazena o resultado na variável `double` chamada `media`.
    8.  Imprime a mensagem "Valores:".
    9.  Utiliza um loop `for` para percorrer o array `vect` e imprime cada valor, juntamente com seu índice (posição no array).
    10. Imprime a soma total dos números digitados.
    11. Imprime a média dos números digitados.
    12. O objeto `Scanner` é fechado ao final do método `main` para liberar os recursos.
