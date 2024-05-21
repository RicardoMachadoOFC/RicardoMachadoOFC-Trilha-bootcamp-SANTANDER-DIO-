import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double salBase = 2000.00;

        System.out.println("Digite sua pretensão salarial:");
        float pretencao = input.nextFloat();

        if(salBase > pretencao) {
            System.out.println("LIGAR PARA CANDIDATO");
        } else if(salBase == pretencao) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        } else {
            System.out.println("Aguardando resultado dos demais candidatos");
        }
        
        input.close(); // Fechando o scanner para evitar vazamento de recursos
    }
}
