import java.util.Scanner;

public class Exercicío3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pessoasAcima50Anos = 0;
        double somaAlturas = 0;
        int pessoasEntre10e20Anos = 0;
        int pessoasComPesoInferior40Kg = 0;
        int totalPessoas = 10;

        for (int i = 1; i <= totalPessoas; i++) {
            System.out.println("Pessoa " + i);
            System.out.print("Idade: ");
            int idade = scanner.nextInt();

            System.out.print("Altura (em metros): ");
            double altura = scanner.nextDouble();
            somaAlturas += altura;

            System.out.print("Peso (em quilos): ");
            double peso = scanner.nextDouble();

            if (idade > 50) {
                pessoasAcima50Anos++;
            }

            if (idade >= 10 && idade <= 20) {
                pessoasEntre10e20Anos++;
            }

            if (peso < 40) {
                pessoasComPesoInferior40Kg++;
            }
        }

        double mediaAlturas = somaAlturas / totalPessoas;
        double porcentagemPesoInferior40Kg = (double) pessoasComPesoInferior40Kg / totalPessoas * 100;

        System.out.println("\nResultados:");
        System.out.println("Pessoas com idade acima de 50 anos: " + pessoasAcima50Anos);
        System.out.println("Média das alturas das pessoas entre 10 e 20 anos: " + mediaAlturas + " metros");
        System.out.println("Porcentagem de pessoas com peso inferior a 40 kg: " + porcentagemPesoInferior40Kg + "%");

        scanner.close();
    }
}