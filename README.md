🏦 Sistema Bancário em Java

Projeto desenvolvido com foco em boas práticas 100% java puro, aplicando conceitos fundamentais de Programação Orientada a Objetos (POO) e simulação de regras de negócio de um sistema bancário.

📌 Sobre o Projeto

Este sistema simula operações bancárias básicas, permitindo o gerenciamento de contas e execução de transações financeiras via terminal.
O objetivo é demonstrar domínio em lógica de programação, modelagem orientada a objetos e organização de código.

🚀 Funcionalidades
✔️ Criação de contas (Corrente e Poupança)
✔️ Listagem de contas cadastradas
✔️ Depósito em conta
✔️ Saque com regras específicas por tipo
✔️ Transferência entre contas
🧠 Tecnologias e Conceitos Aplicados
🔹 Programação Orientada a Objetos
Abstração → Classe base Conta
Encapsulamento → Controle de acesso aos atributos
Herança → Especialização de tipos de conta
Polimorfismo → Uso de List<Conta>
🔹 Arquitetura e Boas Práticas
Separação de responsabilidades
Regras de negócio centralizadas
Métodos com validações
🔹 Interface
Autenticavel para controle de acesso
🔹 Recursos da Linguagem
Coleções (List)
Entrada de dados com Scanner
🛠️ Estrutura do Projeto
src/
 ├── entities/
 │    ├── Conta.java
 │    ├── ContaCorrente.java
 │    ├── ContaPoupanca.java
 │
 ├── interfaces/
 │    └── Autenticavel.java
 │
 └── application/
      └── Program.java
🎮 Como Executar
Clone o repositório:
git clone https://github.com/seu-usuario/seu-repositorio.git
Compile o projeto:
javac application/Program.java
Execute:
java application.Program
📋 Menu do Sistema
1 - Criar Conta
2 - Listar Contas
3 - Depositar
4 - Sacar
5 - Transferir
0 - Sair
💡 Regras de Negócio
Conta Corrente possui taxa de saque
Conta Poupança não possui taxa
Não é permitido acesso direto ao saldo (encapsulamento)
Transferências utilizam métodos internos controlados

Emanuel Silva
Desenvolvedor em formação, com foco em backend Java e construção de soluções orientadas a boas práticas.

⭐ Considerações

Este projeto representa a evolução prática no uso de Java, saindo do nível básico para uma estrutura mais próxima de aplicações reais, com foco em clareza, organização e aplicação correta dos conceitos de POO.
