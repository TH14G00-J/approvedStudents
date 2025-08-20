import entities.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos aluno(a)s serão digitados? ");
        int n = sc.nextInt();
        sc.nextLine();
        Student[] students = new Student[n];

        for (int i = 0; i < students.length; i++) {
            System.out.print("Informe o nome do Aluno(a): ");
            String name = sc.nextLine();
            System.out.print("Informe a nota da NP1: ");
            double np1 = sc.nextDouble();
            System.out.print("Informe a nota da NP2: ");
            double np2 = sc.nextDouble();
            sc.nextLine();
            students[i] = new Student(name, np1, np2);
        }

        System.out.println("\nAlunos aprovados: ");
        for (Student s : students) {
            if (s.getAverage() >= 6.0) {
                System.out.printf("%s (Average: %.1f)\n", s.getName(), s.getAverage());
            }
        }
        sc.close();
    }
}