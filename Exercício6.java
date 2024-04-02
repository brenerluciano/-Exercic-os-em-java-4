import java.util.Scanner;
public class Exercício6{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual é o tamanho da população A: ");
        int populacaoA = scanner.nextInt();
        double taxaNatalidadeA = 0.03;
          
        System.out.println("Qual é o tamanho da população B: ");
        int populacaoB = scanner.nextInt();
        double taxaNatalidadeB = 0.02; 

        int anos = 0;

        while (populacaoA <= populacaoB) {
            populacaoA += (int) (populacaoA * taxaNatalidadeA);
            populacaoB += (int) (populacaoB * taxaNatalidadeB);
            anos++;
        }

        System.out.println("Em " + anos + " anos, a população de A ultrapassará a população de B.");
        System.out.println("População de A: " + populacaoA + " pessoas");
        System.out.println("População de B: " + populacaoB + " pessoas");

        scanner.close();
    }
}