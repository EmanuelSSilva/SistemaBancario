# 🏦 Sistema Bancário em Java

Projeto desenvolvido com foco em boas práticas de desenvolvimento backend, aplicando conceitos fundamentais de Programação Orientada a Objetos (POO) e simulação de regras de negócio de um sistema bancário.

---

## 📌 Sobre o Projeto

Este sistema simula operações bancárias básicas, permitindo o gerenciamento de contas e execução de transações financeiras via terminal.

O principal objetivo é demonstrar domínio em:
- Lógica de programação
- Modelagem orientada a objetos
- Organização e estruturação de código

---

## 🚀 Funcionalidades

- ✔️ Criação de contas (Corrente e Poupança)  
- ✔️ Listagem de contas cadastradas  
- ✔️ Depósito em conta  
- ✔️ Saque com regras específicas por tipo de conta  
- ✔️ Transferência entre contas  

---

## 🧠 Conceitos Aplicados

### 🔹 Programação Orientada a Objetos
- **Abstração** → Classe base `Conta`
- **Encapsulamento** → Atributos privados com acesso controlado
- **Herança** → `ContaCorrente` e `ContaPoupanca`
- **Polimorfismo** → Uso de `List<Conta>`

### 🔹 Interface
- `Autenticavel` para controle de acesso

### 🔹 Estruturas e Recursos
- Coleções (`List`)
- Entrada de dados com `Scanner`
- Validações e regras de negócio

---

## 🛠️ Estrutura do Projeto
### 
- src/
- ├── entities/
- │ ├── Conta.java
- │ ├── ContaCorrente.java
- │ ├── ContaPoupanca.java
- │
- ├── interfaces/
- │ └── Autenticavel.java
- │
- └── application/
- └── Program.java


---

###  
- 1 - Criar Conta
- 2 - Listar Contas
- 3 - Depositar
- 4 - Sacar
- 5 - Transferir
- 0 - Sair

---

### 💡 Regras de Negócio
Conta Corrente possui taxa no saque
Conta Poupança não possui taxa
O saldo não pode ser alterado diretamente (encapsulamento)
Transferências utilizam métodos controlados

### 👨‍💻 Autor

Emanuel Silva
Desenvolvedor em formação, focado em backend Java e construção de sistemas com boas práticas.

⭐ Considerações Finais

Este projeto representa a aplicação prática dos principais conceitos de POO em Java, com foco em organização, clareza e evolução para cenários mais próximos do mercado.
