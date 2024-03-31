import java.util.Scanner;
import java.util.Random;
public class Exercicío5 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    
    
    int numeroAleatorio = random.nextInt(100) + 1;
    int tentativas = 0;

    System.out.println("Vamos começar o jogo da adivinhação.");
    System.out.println("Tente adivinhar um número entre 0 e 100. ");
    
    while (true) {
        System.out.println("Digite o seu palpite:");
        int palpite = scanner.nextInt();
        tentativas++;
        if (palpite == numeroAleatorio) {
            System.out.println("Parabéns, Você acertou com " +tentativas+ " tentativas.");
        break;
        }else if(palpite < numeroAleatorio){
        System.out.println("Tente um número maior.");
        }else{
            System.out.println("Tente um número menor.");
        }
        
    }
    
    scanner.close();
}
}