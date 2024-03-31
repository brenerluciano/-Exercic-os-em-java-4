import java.util.Scanner;

public class Exercicío4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numerosDeKills = 0;
        int numeroDeDeaths = 0;
        int numeroDeAssists = 0;
        int partida = 1;
        int numeroDeNexus = 0;

       
            
        for(int i = 1; i <= partida; i++) {
            System.out.println("Bem vindo a Summoner's Rift, A partica já começou..");
            System.out.println("Quantida de Kills: ");
            int kills = scanner.nextInt();

            System.out.println("Número de mortes: ");
            int deaths = scanner.nextInt();

            System.out.println("Quantas Assists: ");
            int assists = scanner.nextInt();

            System.out.println("Nexus destroidos: ");
            int nexus = scanner.nextInt();

                if (kills >= 20) {
                numerosDeKills++;
                System.out.println("\n\nMaster");
             }else {
                System.out.println("\nNoob");
             }
             if (deaths >= 20) {
                numeroDeDeaths++;
                System.out.println("\nHouston, we have a problem");
             }
             if (assists >= 20) {
                numeroDeAssists++;
                System.out.println("\nteam work");
            }
            if (nexus == 1) {
                numeroDeNexus++;
                System.out.println("\n\nVitoria....");
            }
            if (nexus == 0) {
                numeroDeNexus++;
                System.err.println("Você tem que Destroir o Nexus para vencer.....");
                System.out.println("\n\nRecomeçe a partida.....");
            }break;
          
    }
    scanner.close();
    
        
    }
}
