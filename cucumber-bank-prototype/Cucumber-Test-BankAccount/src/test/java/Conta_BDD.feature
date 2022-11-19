@tag
Feature: Cliente faz saque de dinheiro como um cliente, eu gostaria de sacar dinheiro em caixa eletrônico, 
para que eu não tenha que esperar numa fila do banco.

  @tag1
  Scenario: Cliente especial com saldo negativo
    Given Um cliente especial com saldo atual de -200 reais
    When For solicitado um saque no valor de 100 reais
    Then deve efetuar o saque e atualizar o saldo da conta para -300 reais

  @tag2
  Scenario Outline: Cliente comum com saldo negativo
    Given Um cliente comum com saldo atual de -300 reais
    When Solicitar um saque de 200 reais
    Then Nao deve efetuar o saque e deve retornar a mensagem saldo insuficiente