# Sistema de Controle de Reservas de Hotel

Esse projeto é um sistema simples de reservas de hotel feito em Java, com interação pelo terminal. A ideia foi praticar lógica de programação, arrays, métodos e orientação a objetos.

## Funcionalidades

- Cadastrar reservas com nome do cliente, tipo de quarto, quantidade de diárias e valor da diária.
- Listar as reservas cadastradas.
- Pesquisar reservas pelo nome do cliente.
- Listar as reservas ordenadas pela quantidade de dias, da maior para a menor.
- Calcular e mostrar o valor total da reserva.
- Validar a quantidade de dias e o valor da diária para não aceitar valores menores ou iguais a zero.

O programa permite cadastrar até 10 reservas por execução.

## Tecnologias e conceitos utilizados

- Java
- Classes e objetos
- Encapsulamento
- Construtor, getters e setters
- Array para armazenar as reservas
- Laços de repetição e estruturas condicionais
- Métodos para separar as opções do menu
- Sobrescrita do método `toString()`

## Como executar

1. Abra o projeto em uma IDE que suporte Java, como o IntelliJ IDEA.
2. Confira se o JDK está configurado.
3. Execute a classe `MainHotel`.
4. Use o menu no terminal para cadastrar, pesquisar e listar reservas.

## Observação

As reservas ficam armazenadas em um array durante a execução do programa. Ao encerrar o programa, os dados não são salvos em arquivo ou banco de dados.

## Objetivo

Esse projeto foi uma forma de praticar a criação de classes, o armazenamento de objetos em arrays e a divisão do programa em métodos, simulando algumas operações básicas de um sistema de reservas.
