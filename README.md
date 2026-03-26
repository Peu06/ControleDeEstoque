# 📦 Sistema de Gerenciamento de Estoque em Java

Este é um projeto simples de **gerenciamento de estoque** desenvolvido em Java, executado via console. Ele permite cadastrar, visualizar, editar e excluir produtos de uma lista em memória.

---

## 🚀 Funcionalidades

- 📋 Listar todos os produtos cadastrados
- ➕ Cadastrar um novo produto
- ✏️ Editar um produto existente
- ❌ Remover um produto
- 🔎 Buscar produto por ID

---

## 🛠️ Tecnologias utilizadas

- Java
- Programação Orientada a Objetos (POO)
- Coleções (`List`, `ArrayList`)
- Entrada de dados com `Scanner`

---

## 📁 Estrutura do Projeto


📦 projeto
┣ 📜 Main.java
┗ 📜 itens.java


### 🔹 `itens.java`
Classe responsável por representar um produto e conter as regras de negócio:

- Atributos:
  - `id` (gerado automaticamente)
  - `nome`
  - `descricao`
  - `quantity`
  - `preco`

- Métodos principais:
  - `criarItem()`
  - `getAll()`
  - `getById()`
  - `editItem()`
  - `excluirItem()`

---

### 🔹 `Main.java`
Classe principal que executa o sistema:

- Menu interativo via console
- Controle das operações do usuário
- Gerenciamento da lista de produtos

---

## ▶️ Como executar o projeto

### Pré-requisitos:
- Java JDK instalado

### Passos:

1. Clone o repositório:
```bash
git clone https://github.com/Peu06/ControleDeEstoque.git
```
Acesse a pasta do projeto:
cd seu-repositorio
Compile os arquivos:
javac Main.java itens.java
Execute o programa:
java Main
## 🧠 Como usar

Ao executar o programa, você verá o seguinte menu:

1. Ver estoque.
2. Cadastrar produto.
3. Editar produto.
4. Excluir produto.
5. Parar execução

Basta digitar o número correspondente à operação desejada.

## ⚠️ Observações
- Os dados são armazenados apenas em memória (não há banco de dados).
- Ao encerrar o programa, todas as informações são perdidas.
- O ID dos produtos é gerado automaticamente.

Desenvolvido por João Pedro 🚀
