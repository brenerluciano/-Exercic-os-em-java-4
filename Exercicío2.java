import java.util.Scanner;

public class Exercicío2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite valores positivos (ou zero para sair):");

        while (true) {
            System.out.print("Digite um número: ");
            double numero = scanner.nextDouble();

            if (numero <= 0) {
                break; 
            }

            double quadrado = Math.pow(numero, 2);
            double cubo = Math.pow(numero, 3);
            double raizQuadrada = Math.sqrt(numero);

            System.out.println("Número: " + numero);
            System.out.println("Quadrado: " + quadrado);
            System.out.println("Cubo: " + cubo);
            System.out.println("Raiz quadrada: " + raizQuadrada);
            System.out.println(); 
        }

        System.out.println("Programa encerrado. Obrigado!");
        scanner.close();
    }
}