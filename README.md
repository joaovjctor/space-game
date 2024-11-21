# **🚀 Space Game: Complexidade e Computabilidade de Algoritmos**  

Projeto desenvolvido como parte da Avaliação A1, com foco na aplicação prática de algoritmos em um jogo interativo.  

---

## **📌 Definição do Tema**  
O tema do projeto é um jogo arcade de naves espaciais, inspirado em clássicos.  
### **Objetivo do Jogo:**  
Controlar uma nave, destruir asteroides e sobreviver o maior tempo possível enquanto a dificuldade aumenta progressivamente.  

---

## **📋 Planejamento**  

| **Etapa**              | **Descrição**                                                                                   | **Prazo**       |
|-------------------------|-----------------------------------------------------------------------------------------------|-----------------|
| Definição do Tema       | Escolha do conceito e descrição do objetivo do jogo.                                          | 04/11           |
| Esboço do Algoritmo     | Planejamento da lógica de spawn, movimentação e colisão.                                      | 07/11           |
| Desenvolvimento         | Implementação do código principal, mecânica do jogo e interface.                             | 12/11           |
| Testes e Ajustes        | Testes com foco em desempenho, funcionalidade e melhorias.                                   | 16/11           |
| Documentação            | Redação e organização do README, além da análise da complexidade do algoritmo.                | 18/11           |

---

## **⚙️ Tecnologias Utilizadas**  
| **Tecnologia/Ferramenta** | **Descrição**                                           |
|---------------------------|-------------------------------------------------------|
| **Java**                  | Linguagem de programação principal do projeto.        |
| **LibGDX**                | Framework para desenvolvimento de jogos 2D.          |
| **Gradle**                | Sistema de automação de builds.                       |
| **Launch4j**              | Ferramenta para criar o executável do jogo (.exe).    |
| **Git/GitHub**            | Controle de versão e repositório para o projeto.      |

---

## **💻 Identificação da Complexidade do Jogo**  

### **Análise de Algoritmos:**  
- **Spawn de Asteroides:** Algoritmo utiliza uma abordagem dinâmica para calcular o intervalo de geração com base no tempo decorrido.  
  - **Complexidade:** O(1) por iteração, pois é baseado em um timer fixo.  
- **Movimentação da Nave:** Algoritmo simples de input de teclado.  
  - **Complexidade:** O(1) por frame.  
- **Colisão:** Verificação de colisão para cada asteroide no campo.  
  - **Complexidade:** O(n), onde *n* é o número de asteroides ativos.  

### **Gestão da Complexidade:**  
1. **Uso de Estruturas de Dados Eficientes:** Listas para gerenciar asteroides ativos.  
2. **Atualização por Quadros (Frames):** Operações são distribuídas em intervalos de tempo fixos para evitar sobrecarga.  
3. **Testes e Otimizações:** Ajustes realizados para manter a taxa de quadros (FPS) estável de acordo com o *Delta Time*.  

---

## **🎮 Regras (Jogabilidade)**  

### **Como Jogar:**  
1. Use as **setas esquerda e direita** para movimentar a nave.  
2. Pressione as setas para atirar e destruir os asteroides.  
3. Evite colisões com os asteroides para não perder o jogo.  

### **Objetivo:**  
- **Sobreviver o maior tempo possível.**  
- **Destruir o máximo de asteroides para ganhar pontos.**

---

## **🎥 Demo**  

[Link para o vídeo da demonstração do jogo](https://drive.google.com/file/d/1b_7HIKCfEar3l2WX3Ogg99etz2RbLzkF/view?usp=drive_link) 

---

## **📊 Checklist do Desenvolvimento**  

### **Análise**  
- [x] Problema selecionado e definido claramente.  
- [x] Modelo teórico desenvolvido para representar a mecânica do jogo.  

### **Planejamento**  
- [x] Objetivos definidos com clareza.  
- [x] Estratégia geral de resolução do problema proposta.  
- [x] Subproblemas identificados e estruturados.  

### **Desenvolvimento e Testes**  
- [x] Algoritmo traduzido em código de programação.  
- [x] Código escrito de forma clara e modular.  
- [x] Testes realizados em diferentes cenários.  
- [x] Casos limite identificados e resolvidos.  

### **Documentação e Avaliação**  
- [x] Especificação do algoritmo e análise de complexidade realizadas.  
- [x] Eficácia avaliada em termos de tempo de execução e uso de recursos.  

---

## **📂 Organização do Repositório**  

| **Diretório**       | **Descrição**                                                                 |
|---------------------|-----------------------------------------------------------------------------|
| `/core`             | Código principal do jogo.                                                  |
| `/desktop`          | Arquivo para executar o jogo no desktop.                                   |
| `/build`            | Diretório de saída do Gradle, contendo o `.jar` e o `.exe`.                |
| `/assets`           | Recursos do jogo.                                     |
| `README.md`         | Documentação detalhada do projeto.                                         |

---

## **📂 Endereço do Repositório**  
O repositório público pode ser acessado em: [https://github.com/joaovjctor/space-game](https://github.com/joaovjctor/space-game)  

---

## **⬇️ Como Baixar o Jogo**

Para baixar o jogo, siga as instruções abaixo:

1. Acesse a seção de releases do nosso repositório no GitHub:  
   [Releases do Projeto](https://github.com/joaovjctor/space-game/releases)

2. Na seção de releases, localize a versão mais recente do jogo.

3. Clique no arquivo **`space-game.exe`** para iniciar o download.

4. Após o download ser concluído, basta executar o arquivo **`space-game.exe`** em seu computador para iniciar o jogo.

> **Nota:** Caso encontre problemas para rodar o jogo, verifique se possui a versão mais recente do Java instalada em seu sistema. Você pode baixá-lo em [java.com](https://www.java.com/).

Pronto! Agora você pode aproveitar o jogo e desafiar-se a sobreviver o máximo de tempo possível enquanto destrói asteroides! 🚀

---

## **📚 Referências**  
1. [Documentação Oficial do LibGDX](https://libgdx.com/dev/)  
2. [Launch4j para Executáveis Java](https://launch4j.sourceforge.net/)  
3. [Gradle para Build Automation](https://gradle.org/)  

---

**Autores:**  
- Davi Serafim Jovane (RGM: 30185271)
- Guilherme Araújo Rodrigues (RGM: 30311705)  
- João Victor Buzin (RGM: 30233712)  
- João Victor Martins (RGM: 30946948) 
- Matheus Martins Máximo (RGM: 29912997)  
