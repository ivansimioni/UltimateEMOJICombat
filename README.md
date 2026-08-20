Markdown
# 🥊 Ultra Emoji Combat — POO em Java

O **Ultra Emoji Combat** é uma aplicação desenvolvida em Java para praticar e consolidar conceitos fundamentais da **Programação Orientada a Objetos (POO)**, com foco principal em **Agregação de Objetos**, encapsulamento e lógica de regras de negócio.

---

## 🎯 Conceitos de POO Aplicados

* **Agregação (`Luta` -> `Lutador`)**: A classe `Luta` necessita de duas instâncias da classe `Lutador` para existir e ser executada.
* **Encapsulamento**: Atributos privados controlados por métodos modificadores (`getters` e `setters`), além de regras de negócio internas (como o cálculo automático da categoria do lutador baseado no seu peso).
* **Regras de Negócio**:
  * Uma luta só pode ser marcada entre lutadores da **mesma categoria**.
  * Um lutador não pode lutar contra **si mesmo**.
  * Atualização dinâmica do cartel (vitórias, derrotas e empates) após o resultado sorteado.

---

## 🏗️ Estrutura das Classes

```text
  ┌─────────────────┐             ┌─────────────────┐
  │     Lutador     │             │      Luta       │
  ├─────────────────┤             ├─────────────────┤
  │ - nome          │ ◄─(desafiado)│ - desafiado     │
  │ - peso          │ ◄─(desafiante│ - desafiante    │
  │ - categoria     │             │ - aprovada      │
  │ - vitorias      │             │                 │
  │ - derrotas      │             ├─────────────────┤
  │ - empates       │             │ + marcarLuta()  │
  ├─────────────────┤             │ + lutar()       │
  │ + apresentar()  │             └─────────────────┘
  │ + status()      │
  └─────────────────┘
⚔️ Exemplo de Execução
Ao executar a classe Main, os lutadores são instanciados e o combate é simulado com resultado aleatório:

Plaintext
--- STATUS INICIAL ---
Pretty Boy | Peso LEVE | 11 vitórias | 3 derrotas | 1 empate
Putscript  | Peso LEVE | 14 vitórias | 2 derrotas | 3 empates

--- APRESENTAÇÃO DO COMBATE ---
### DESAFIADO ###
Com vocêsss, o lutador Pretty Boy!!
Diretamente de França!!
Medindo 1.75m de altura.

### DESAFIANTE ###
Com vocêsss, o lutador Putscript!!
Diretamente de Brasil!!
Medindo 1.68m de altura.

--- RESULTADO ---
O desafiante Putscript venceu!
--------------------

--- STATUS APÓS A LUTA ---
Pretty Boy | Peso LEVE | 11 vitórias | 4 derrotas | 1 empate
Putscript  | Peso LEVE | 15 vitórias | 2 derrotas | 3 empates
🛠️ Tecnologias Utilizadas
Linguagem: Java

IDE: IntelliJ IDEA

Controle de Versão: Git & GitHub
