package PraticandoLógica;
import java.util.Scanner;

public class VerificadorNumeroConta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            String numeroConta = scanner.nextLine();

            verificarNumeroConta(numeroConta);
            
            
            System.out.println("Numero de conta valido.");
        } catch (IllegalArgumentException e) {
           
            System.out.println("Erro: numero de conta invalido " + e.getMessage());
        } finally {
            
            scanner.close();
        }
    }

    private static void verificarNumeroConta(String numeroConta) {
        if (numeroConta.length() != 8) {
               throw new IllegalArgumentException("Número de conta inválido. Digite exatamente 8 dígitos.");
              
            
            
        }
    }
}