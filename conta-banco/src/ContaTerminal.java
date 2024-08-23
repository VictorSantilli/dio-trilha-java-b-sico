import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numero;
        String agencia;
        String nomeCliente;
        float saldo;

        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor, digite o seu nome!");
        nomeCliente = scan.nextLine();
        System.out.println("Por favor, digite o número da Agência!");
        agencia = scan.nextLine();       
        System.out.println("Por favor, digite o número da sua conta!");
        numero = scan.nextInt();
        System.out.println("Digite seu saldo!");
        saldo = scan.nextFloat();

        System.out.printf("Olá "+ nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +" conta "+ numero+", e seu saldo "+saldo+" já está disponível para saque");

        scan.close();
    }
}
