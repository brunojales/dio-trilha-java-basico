import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
   

    Scanner scanner = new Scanner(System.in);

    System.out.println("Informe a sua Agência: ");
    String agencia = scanner.nextLine();

    System.out.println("Informe o numero da sua Conta: ");
    int numero = scanner.nextInt();

    scanner. nextLine();

    System.out.println("Informe o seu nome completo: ");
    String nomeCliente = scanner.nextLine();

    System.out.println("Por favor, informar seu Saldo: ");
    double saldo = scanner.nextDouble();



    System.out.println ("Olá " +nomeCliente+ ", obrigado por criar uma conta em nosso banco, sua Agência é " +agencia+ " e seu saldo de R$" +saldo+ " já está disponivel para saque." );

        scanner.close();

    }
}
