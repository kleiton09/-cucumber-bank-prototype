# CucumberTest-BankAccount

## Implementação do Junit
Para esta fase do projeto foi implementado o uso do Junit para trabalhar em conjunto com o Cucumber e Maven, implementação essa que ajuda na visualização do cenários de teste.

![image](https://user-images.githubusercontent.com/80266374/201446897-5acb7751-460e-489a-ba9c-7e9fe33fd1d0.png) Console Junit

![image](https://user-images.githubusercontent.com/80266374/201446942-6c90c13f-5585-48d6-bc63-64d4a56c80c3.png) Configurações Junit
Nas configurações do Junit é utilizado o método @CucumberOptions para personalizar a saída dos testes, como por exemplo o "plugin" e o "monochrome", que são definidos para deixar a saída monocromática e menos "bagunçada", e também o snippets, que ao definir como "CAMELCASE" deixa as primeiras letras do cenário em letra maiúscula e o restante em letras minúsculas. Porém, o mais interessante é o "strict" e o "dryRun"; o "strict" se definido como verdadeiro, fará com que se houver uma falha em algum passo do teste, pare todo o teste; já o dryRun, irá checar se cada cenário foi implementado corretamente e se não tiver sido implementado, aparecerá uma mensagem.
