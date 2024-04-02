import java.util.Scanner;

public class Exercício11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de termos da série a ser gerada (N): ");
        int N = scanner.nextInt();

        gerarSerie(N);

        scanner.close();
    }

    public static void gerarSerie(int N) {
        int x = 1;
        int count = 0;

        System.out.println("Os " + N + " termos da série são:");

        while (count < N) {
            System.out.print(x + " ");

            if (count < N - 1) {
                System.out.print(x + 3 + " ");
                System.out.print(x + 3 + " ");
                System.out.print(x + 1 + " ");
            }

            count += 4;
            x++;
        }

        System.out.println();
    }
}