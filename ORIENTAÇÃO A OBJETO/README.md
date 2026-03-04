# Projeto Armário Inteligente - FIAP

## Descrição do Objeto
Este projeto faz parte de uma atividade prática de Programação Orientada a Objetos. O objeto **Armário** foi desenvolvido para representar um compartimento físico no mundo real, transformando atributos estáticos em comportamentos dinâmicos através de métodos.

## Regras de Negócio e Funcionalidades
Diferente de uma simples lista de dados, este objeto possui inteligência para proteger seu estado interno:

* **guardarItem(int volumeItem)**: Adiciona volume ao armário.
    * **Validação**: Impede a entrada de volumes negativos ou que excedam a capacidade total (tamanhoEmCm) do armário.
* **esvaziarArmario()**: Redefine o volume ocupado para zero, permitindo a reutilização do espaço.

## Aplicação de Critérios "Clean Code"
O código foi revisado conforme os padrões de qualidade exigidos:
1. **Ações são Verbos**: Os métodos foram nomeados como `guardarItem` e `esvaziarArmario` para representar ações claras.
2. **Funções Pequenas**: Cada método possui uma única responsabilidade: validar a regra e alterar o estado.
3. **Nomes Significativos**: Argumentos como `volumeItem` foram utilizados para facilitar a leitura por outros desenvolvedores, evitando termos genéricos.

---
*Projeto desenvolvido para a disciplina de Programação Orientada a Objetos Aplicada.*