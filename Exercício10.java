public class Exercício10 {
    public static void main(String[] args) {
        double massaInicial = 1.0; 
        double perdaPorcentagem = 0.25; 
        double massaLimite = 0.1; 
        int intervalo = 30; 

        double massaAtual = massaInicial;
        int tempo = 0;

        
        while (massaAtual >= massaLimite) {
            massaAtual *= (1 - perdaPorcentagem); 
            tempo += intervalo; 
        }

        System.out.println("Tempo necessário para a massa se tornar menor que " + massaLimite + " gramas: " + tempo + " segundos.");
    }
}