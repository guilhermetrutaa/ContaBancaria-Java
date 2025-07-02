# 🏦 Meu Primeiro Projeto Java: Sistema de Conta Bancária Simples

Olá! 👋 Bem-vindo ao meu primeiro projeto Java: um sistema de gerenciamento de contas bancárias em console! Este projeto marca uma etapa super importante na minha jornada de aprendizado em programação.

Desenvolvi esta aplicação para colocar em prática os conceitos básicos de Java, **POO (Programação Orientada a Objetos)**, estruturas de dados e interação com o usuário.

---

## ✨ Funcionalidades

Este sistema bancário simples permite que você:

* **Criar Contas**: Cadastre novas contas bancárias com um nome de titular e saldo inicial (geralmente R$ 0,00).
* **Verificar Saldo**: Visualize o nome e o saldo de todas as contas cadastradas no sistema.
* **Depositar**: Adicione fundos a uma conta existente. O sistema garante que você só pode depositar valores positivos.
* **Sacar**: Retire fundos de uma conta existente. Há validação para garantir que você não saque mais do que tem em conta e que o valor do saque seja positivo.

---

## 🚀 Como Rodar o Projeto

Para executar este projeto na sua máquina, siga os passos abaixo:

1.  **Clone o Repositório** (ou baixe os arquivos diretamente):
    ```bash
    git clone https://github.com/guilhermetrutaa/ContaBancaria-Java.git
    cd ContaBancaria-Java
    ```

2.  **Compile o Código**:
    Abra seu terminal/prompt de comando na pasta raiz do projeto (`ContaBancaria-Java`) e compile os arquivos Java. Assumindo que você tem as classes `Main.java` e `ContaBancaria.java` no mesmo nível:
    ```bash
    javac Main.java ContaBancaria.java
    ```

3.  **Execute a Aplicação**:
    Após a compilação, execute o programa no mesmo terminal:
    ```bash
    java Main
    ```

    O sistema será iniciado no seu console, apresentando um menu interativo de opções.

---

## 🛠️ Tecnologias Utilizadas

* **Java**: A linguagem de programação utilizada para construir a aplicação.
* **`Scanner`**: Essencial para ler a entrada de dados do usuário através do console.
* **`ArrayList`**: Usado para armazenar e gerenciar dinamicamente múltiplas instâncias de `ContaBancaria`.
* **Programação Orientada a Objetos (POO)**: Conceitos aplicados na criação da classe `ContaBancaria`, que modela as características e comportamentos de uma conta.
* **Tratamento de Exceções**: Implementação de blocos `try-catch` para lidar com entradas inválidas do usuário, como digitar texto onde um número é esperado (`InputMismatchException`).

---

## 🌟 Aprendizados Chave

Ao desenvolver este projeto, tive a oportunidade de aplicar e reforçar vários conceitos fundamentais de Java e programação:

* Criação e manipulação de **classes e objetos** personalizados.
* Utilização de **métodos `get` e `set`** (ou getters/setters) para controlar o acesso e a modificação dos atributos dos objetos.
* Trabalho com **coleções dinâmicas** (`ArrayList`) para gerenciar listas de objetos.
* Controle do fluxo do programa com **estruturas condicionais** (`if/else`, `switch`) e **laços de repetição** (`do-while`).
* **Validação de entrada** do usuário e **tratamento de erros** para tornar o programa mais robusto.
* A importância do **encapsulamento** em POO, protegendo os dados internos de um objeto.

---

Este projeto é um marco no meu aprendizado e me anima para os próximos desafios!

---

Feito com ❤️ por Guilherme Truta

---
