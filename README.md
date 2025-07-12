# Análise de Dados de Pessoas (Idade e Altura) em Java

Este projeto consiste em um programa Java simples que coleta informações sobre um grupo de pessoas (nome, idade e altura), calcula a altura média do grupo, determina o percentual de pessoas menores de 16 anos e lista o nome dessas pessoas.

**Autor:** gustavodees

## Arquivos Incluídos

* `principal/Main.java`: Contém a classe principal com o método `main`, responsável por obter a entrada do usuário, armazenar os dados das pessoas, realizar os cálculos e exibir os resultados.

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
    * O programa primeiro solicitará que você digite a quantidade de pessoas que terão seus dados inseridos. Digite o número desejado e pressione Enter.
    * Em seguida, para cada pessoa, o programa pedirá que você digite o nome, a idade e a altura, nesta ordem, pressionando Enter após cada informação. Certifique-se de fornecer a idade como um número e a altura como um número decimal (utilize ponto como separador decimal).

5.  **Resultado:** Após inserir os dados de todas as pessoas, o programa exibirá:
    * A altura média de todas as pessoas digitadas, formatada com duas casas decimais.
    * O percentual de pessoas com menos de 16 anos, formatado com uma casa decimal.
    * Uma lista com o nome de cada pessoa que possui menos de 16 anos.

## Explicação do Código

### `principal/Main.java`

Este arquivo contém a classe `Main`, que é o ponto de entrada do programa.

* **Método `main`:**
    1.  Cria um objeto da classe `Scanner` para permitir a leitura de dados inseridos pelo usuário no console.
    2.  Solicita ao usuário que digite a quantidade de pessoas e armazena esse valor na variável inteira `n`.
    3.  Declara variáveis para armazenar o número de pessoas menores de 16 anos (`nmenores`), a média de altura (`mediaAltura`) e o percentual de menores (`percentualMenores`).
    4.  Cria três arrays:
        * `nome`: Um array de strings para armazenar o nome de cada pessoa.
        * `idade`: Um array de doubles para armazenar a idade de cada pessoa.
        * `altura`: Um array de doubles para armazenar a altura de cada pessoa.
    5.  Utiliza um loop `for` para iterar `n` vezes (para cada pessoa):
        * Solicita ao usuário que digite o nome, a idade e a altura da pessoa, utilizando o índice `i` para indicar o número da pessoa.
        * Lê as informações fornecidas pelo usuário e armazena nos respectivos arrays (`nome`, `idade`, `altura`).
    6.  Inicializa as variáveis `nmenores` com 0 e `mediaAltura` com 0.0.
    7.  Utiliza outro loop `for` para percorrer os arrays de dados das pessoas:
        * Verifica se a idade da pessoa na posição `i` é menor que 16. Se for, incrementa o contador `nmenores`.
        * Adiciona a altura da pessoa na posição `i` à variável `mediaAltura`.
    8.  Calcula o percentual de pessoas menores de 16 anos, dividindo `nmenores` pelo número total de pessoas `n` e multiplicando por 100.0. O cast para `double` é importante para garantir que a divisão seja feita como ponto flutuante.
    9.  Imprime a altura média, formatada com duas casas decimais, utilizando `printf`.
    10. Imprime o percentual de pessoas menores de 16 anos, formatado com uma casa decimal, utilizando `printf`.
    11. Utiliza um último loop `for` para percorrer o array de nomes:
