import java.util.Scanner;

public class Exercício7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao programa de formas geométricas!");
        System.out.println("Escolha uma opção:");
        System.out.println("1. Retângulo");
        System.out.println("2. Diagonal superior esquerda");
        System.out.println("3. Diagonal superior direita");
        System.out.println("4. Diagonal inferior esquerda");
        System.out.println("5. Diagonal inferior direita");
        System.out.print("Opção: ");
        int opcao = scanner.nextInt();

        System.out.print("Digite o número de colunas: ");
        int colunas = scanner.nextInt();

        switch (opcao) {
            case 1:
                desenharRetangulo(colunas);
                break;
            case 2:
                diagonalSuperiorEsquerda(colunas);
                break;
            case 3:
                diagonalSuperiorDireita(colunas);
                break;
            case 4:
                diagonalInferiorEsquerda(colunas);
                break;
            case 5:
                diagonalInferiorDireita(colunas);
                break;
            default:
                System.out.println("Opção inválida!");
        }

        scanner.close();
    }

    public static void desenharRetangulo(int colunas) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void diagonalSuperiorEsquerda(int colunas) {
        for (int i = 0; i < colunas; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void diagonalSuperiorDireita(int colunas) {
        for (int i = 0; i < colunas; i++) {
            for (int j = 0; j < colunas - i; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k < i + 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void diagonalInferiorEsquerda(int colunas) {
        for (int i = colunas; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void diagonalInferiorDireita(int colunas) {
        for (int i = 0; i < colunas; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int k = i; k < colunas; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}