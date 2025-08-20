Projeto: Aprovados ✅

Este projeto resolve o problema “aprovados”, onde o programa lê o nome e
as notas de alunos em duas provas (NP1 e NP2) e exibe os nomes dos
alunos aprovados, considerando aprovados aqueles cuja média seja maior
ou igual a 6.0.

------------------------------------------------------------------------

📝 Descrição do programa

-   O programa solicita ao usuário quantos alunos serão digitados.
-   Para cada aluno, são coletados:
    -   Nome
    -   Nota da NP1
    -   Nota da NP2
-   Cada aluno é representado por um objeto da classe Student.
-   Após a leitura, o programa calcula a média de cada aluno e imprime
    apenas os alunos aprovados.

------------------------------------------------------------------------

📂 Estrutura do projeto

    src/
     ├── entities/
     │    └── Student.java
     └── Main.java

Classe Student

-   Responsável por armazenar os dados do aluno:
    -   name → Nome do aluno
    -   np1 → Nota da primeira prova
    -   np2 → Nota da segunda prova
-   Possui o método getAverage() que retorna a média aritmética das
    notas.

Classe Main

-   Responsável pela execução do programa.
-   Lê os dados dos alunos utilizando Scanner.
-   Cria um vetor de Student para armazenar os alunos.
-   Calcula e exibe os nomes dos alunos aprovados, mostrando também a
    média final.

------------------------------------------------------------------------

📌 Exemplo de execução

    Quantos aluno(a)s serão digitados? 4
    Informe o nome do Aluno(a): Joao Silva
    Informe a nota da NP1: 7.0
    Informe a nota da NP2: 8.5
    Informe o nome do Aluno(a): Maria Teixeira
    Informe a nota da NP1: 9.2
    Informe a nota da NP2: 6.5
    Informe o nome do Aluno(a): Carlos Carvalho
    Informe a nota da NP1: 5.0
    Informe a nota da NP2: 6.0
    Informe o nome do Aluno(a): Teresa Pires
    Informe a nota da NP1: 5.5
    Informe a nota da NP2: 6.5

    Alunos aprovados: 
    Joao Silva (Average: 7.8)
    Maria Teixeira (Average: 7.9)
    Teresa Pires (Average: 6.0)

------------------------------------------------------------------------

🚀 Tecnologias utilizadas

-   Java 17+
-   Programação orientada a objetos (POO)
