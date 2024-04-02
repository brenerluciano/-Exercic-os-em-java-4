import java.util.Scanner;

public class Exercício8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número real A: ");
        double A = scanner.nextDouble();

        System.out.print("Digite o número inteiro B: ");
        int B = scanner.nextInt();

        double produto = calcularProduto(A, B);

        System.out.println("O produto de " + A + " por " + B + " é: " + produto);

        scanner.close();
    }

    public static double calcularProduto(double A, int B) {
        double produto = 0;
        boolean negativo = false;

        if (B < 0) {
            negativo = true;
            B = -B;
        }

        for (int i = 0; i < B; i++) {
            produto += A;
        }

        if (negativo) {
            produto = -produto;
        }

        return produto;
    }
}