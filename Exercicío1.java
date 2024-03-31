import java.util.Scanner;

public class Exercicío1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int produtoImpares = 1; 
        int somaPares = 0;

        System.out.print("Quantos números você deseja inserir? ");
        int quantidadeNumeros = scanner.nextInt();

        for (int i = 0; i < quantidadeNumeros; i++) {
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();

            if (numero % 2 == 0) {
                somaPares += numero;
            } else {
                produtoImpares *= numero;
            }
        }

        System.out.println("Soma dos números pares: " + somaPares);
        System.out.println("Produto dos números ímpares: " + produtoImpares);

        scanner.close();
    }
}