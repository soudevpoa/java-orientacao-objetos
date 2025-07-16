# 🏦 Exercício: Conta Bancária em Java

Este exercício tem como objetivo praticar a criação de classes com atributos, métodos e comportamento orientado a objetos. A classe `Conta` simula operações bancárias simples como **depósito**, **saque** e **exibição de saldo**.

---

## 📁 Estrutura

```bash
conta-bancaria/
├── Conta.java        # Classe principal com operações bancárias
├── BancoMain.java    # Classe de teste com método main()
└── README.md         # Documentação do exercício
```
# 👨‍💻 Conceito Aplicado

Criação de objetos com estado inicial

Métodos que alteram estado interno

Testes práticos com instâncias independentes

# 💰 Classe Conta

🔧 Atributos:

titular (String)

saldo (double)

# 🛠️ Métodos:

depositar(double valor)

sacar(double valor)

exibirSaldo()

# ▶️ Como executar

1. Compilar os arquivos

```bash
javac Conta.java BancoMain.java

```

2. Executar o programa

```bash
java BancoMain
```
# 📦 Saída esperada

Titular: Jonathan | Saldo: R$1000.0

Titular: Copilot | Saldo: R$500.0

Saque de R$200.0 realizado.

Depósito de R$150.0 realizado.

Titular: Jonathan | Saldo: R$800.0

Titular: Copilot | Saldo: R$650.0

# Importante

O método sacar() inclui validação de saldo.

O método depositar() atualiza o saldo dinamicamente.

Dois objetos da mesma classe (conta1, conta2) podem agir de forma independente.