import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Por favor, digite seu nome: ");
            String nomeCliente = scanner.nextLine();
            
            System.out.println("Por favor, digite o número de sua agência: ");
            String numeroAgencia = scanner.nextLine();
            
            System.out.println("Por favor, digite o número da sua conta bancária: ");
            int contaBancaria = scanner.nextInt();
            scanner.nextLine();
            
            System.out.println("Por favor, digite seu saldo: ");
            double saldo = scanner.nextDouble();
            
            System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é " + numeroAgencia + ", conta " + contaBancaria + " e seu saldo de " + saldo + " já está disponível para saque.");
        }
    }
}
