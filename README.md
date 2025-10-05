Design e Arquitetura de Software 1 - 2025/2 Turma B

Marcelo Felipe Momm





📚 Fundamentos de Código e Programação Orientada a Objetos





--------------------------------------------------

📅 Aula 31/07 — Abstração e Complexidade



🔹 Abstração

Abstrair significa representar um problema do mundo real de forma simplificada no código, priorizando apenas os elementos essenciais.

&nbsp;Todo software é uma abstração — e, por isso, traz consigo certa complexidade.

&nbsp;Códigos mais simples e coesos facilitam o trabalho em equipe, a manutenção e a evolução do sistema.



🔹 Frameworks

Frameworks são coleções de ferramentas, bibliotecas e convenções que fornecem uma estrutura base para o desenvolvimento.

&nbsp;Eles agilizam o trabalho ao oferecer soluções já consolidadas para problemas comuns.

&nbsp;Dominar bem um framework ajuda a compreender outros com mais facilidade.



🔹 Padronização de Código

Estabelecer convenções de nomenclatura e formatação — como camelCase, snake\_case, espaçamentos e estrutura — garante legibilidade e consistência.

&nbsp;Essa padronização melhora a manutenção e a colaboração entre desenvolvedores.



🔹 Programação Orientada a Objetos (POO)

Base da engenharia de software moderna, a POO organiza o código em classes e objetos, promovendo: Encapsulamento, Reutilização, Modularidade e Manutenção facilitada





🔹 Estruturas de Dados

Listas, filas, árvores e grafos são essenciais para armazenar e manipular informações de forma eficiente.

&nbsp;Grandes aplicações — como Google e Amazon — utilizam fortemente essas estruturas em seus sistemas.



🔹 Ocultação de Informação

Consiste em esconder detalhes internos de uma classe, expondo apenas o necessário.

&nbsp;Essa prática reforça o encapsulamento e reduz dependências desnecessárias entre componentes.



Um bom código deve ser modular, permitindo que partes sejam alteradas ou removidas sem quebrar o restante do sistema.





---------------------------------------------

📅 Aula 04/08 — Coesão e Acoplamento

🔹 Getters e Setters

Métodos que controlam o acesso a atributos privados, protegendo os dados internos e mantendo a integridade das classes.



🔹 Coesão

Cada classe ou método deve ter uma responsabilidade bem definida.

&nbsp;Alta coesão resulta em código mais legível, testável e fácil de manter.



🔹 Acoplamento

Refere-se ao grau de dependência entre módulos:

🔴 Alto acoplamento: classes excessivamente conectadas, dificultando alterações.



🟢 Baixo acoplamento: componentes independentes e mais flexíveis.



👉 O ideal é alta coesão e baixo acoplamento.





---------------------------------------------

📅 Aula 07/08 — Princípios SOLID

Os princípios SOLID orientam o design de sistemas orientados a objetos de forma robusta e sustentável:

SRP — Single Responsibility Principle: cada classe deve ter uma única responsabilidade.



OCP — Open/Closed Principle: o código deve estar aberto para extensão, mas fechado para modificação.



ISP — Interface Segregation Principle: prefira várias interfaces pequenas e específicas a uma única interface genérica.



DIP — Dependency Inversion Principle: módulos de alto nível devem depender de abstrações, e não de implementações concretas.



🔹 Diagramas UML

Herança: linha sólida com seta aberta → classe pai



Associação: linha sólida, seta fechada opcional



Implementação: linha tracejada com seta aberta → interface





----------------------------------------------

📅 Aula 11/08 — Composição e Princípio de Demeter

🔹 Herança

Permite que uma classe filha herde características da classe pai.

&nbsp;➡ Pode gerar acoplamento forte e hierarquias rígidas se mal utilizada.



🔹 Composição

Cria relações entre objetos ao invés de heranças diretas.

&nbsp;➡ Traz flexibilidade, baixa dependência e facilidade de manutenção.



🔹 Princípio de Demeter

(Lei do Menor Conhecimento)

&nbsp;Uma classe deve interagir apenas com seus colaboradores diretos, evitando dependências desnecessárias e tornando o sistema mais estável e expansível.





-----------------------------------------------

📅 Aula 14/08 — Princípio de Liskov

🔹 LSP — Liskov Substitution Principle

Objetos de subclasses devem poder substituir os da classe base sem alterar o comportamento esperado.

&nbsp;Isso assegura compatibilidade, consistência e previsibilidade nas hierarquias de herança.





----------------------------------------------

📅 Aula 18/08 — Padrão Singleton

🔹 Singleton

Garante que apenas uma instância de uma classe exista durante toda a execução do programa.

&nbsp;Muito usado para gerenciar recursos compartilhados (como conexões de banco de dados).

&nbsp;⚠️ Em excesso, pode dificultar testes e aumentar o acoplamento — sendo considerado um anti-pattern em alguns contextos.





----------------------------------------------

📅 Aula 21/08 — Padrão Observer

🔹 Observer

Define uma relação um-para-muitos, onde a mudança de estado em um objeto notifica automaticamente seus observadores.

&nbsp;Promove baixo acoplamento e alta extensibilidade, sendo amplamente usado em:

-Sistemas de eventos

-Interfaces gráficas (GUIs)

-Mecanismos de notificação





---------------------------------------------

📅 Aula 28/08 — Fundamentos da Arquitetura de Software

A arquitetura de software é o esqueleto do sistema.

&nbsp;Ela define decisões técnicas que determinam desempenho, segurança e escalabilidade, servindo como base para um desenvolvimento estruturado e sustentável.





---------------------------------------------

📅 Aula 01/09 — Papel do Arquiteto e DevOps

🔹 Papel do Arquiteto

O arquiteto de software deve:

-Tomar decisões técnicas estratégicas

-Garantir que a arquitetura atenda requisitos funcionais e não funcionais

-Apoiar a equipe de desenvolvimento

-Manter-se atualizado e entender o domínio de negócio



🔹 Decisões Arquiteturais

Envolvem escolhas sobre tecnologias, frameworks e padrões que moldam a estrutura do sistema.

🔹 DevOps



Integra desenvolvimento e operações, promovendo:

-Entregas contínuas e rápidas

-Feedback constante

-Cultura de colaboração





----------------------------------------------

📅 Aula 04/09 — Arquitetura x Design e Modelo T

🔹 Arquitetura x Design



-Arquitetura: visão global e estratégica do sistema



-Design: detalhamento técnico e implementação

&nbsp;Ambos devem trabalhar em conjunto para garantir a integridade e eficiência do projeto.



🔹 Arquiteto Modelo T

Profundidade técnica em algumas áreas (barra vertical do T)



Conhecimento amplo em várias outras (barra horizontal)

&nbsp;Isso permite comunicação eficiente entre times e visão sistêmica do projeto.





-----------------------------------------------

📅 Aulas 08/09 e 11/09 — Análise de Trade-offs

&nbsp;trade-offs ponderar prós e contras de diferentes decisões arquiteturais.

&nbsp;Cada escolha traz benefícios, custos e riscos, buscar equilibrio





------------------------------------------------

📅 Aulas 15/09 e 18/09 — Implementação Prática

Aplicação prática do modelo Publisher/Subscriber em código Java





