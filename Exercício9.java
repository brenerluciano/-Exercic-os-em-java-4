import java.util.Scanner;

public class Exercício9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numAlunos = 100;
        int matriculaMaiorNota1 = 0, matriculaMaiorNota2 = 0;
        double maiorNota1 = 0, maiorNota2 = 0;

        for (int i = 1; i <= numAlunos; i++) {
            System.out.println("Ficha do aluno " + i + ":");
            System.out.print("Número de matrícula: ");
            int matricula = scanner.nextInt();
            System.out.print("Nota: ");
            double nota = scanner.nextDouble();

            if (nota > maiorNota1) {
                maiorNota2 = maiorNota1;
                matriculaMaiorNota2 = matriculaMaiorNota1;
                maiorNota1 = nota;
                matriculaMaiorNota1 = matricula;
            } else if (nota > maiorNota2) {
                maiorNota2 = nota;
                matriculaMaiorNota2 = matricula;
            }
        }

        System.out.println("As duas maiores notas são:");
        System.out.println("Maior nota: " + maiorNota1 + ", Matrícula: " + matriculaMaiorNota1);
        System.out.println("Segunda maior nota: " + maiorNota2 + ", Matrícula: " + matriculaMaiorNota2);

        scanner.close();
    }
}