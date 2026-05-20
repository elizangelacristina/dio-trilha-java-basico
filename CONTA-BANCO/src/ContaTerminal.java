import java.util.Scanner;

public class ContaTerminal {
    private static int numero;
    private static String agencia;
    private static String nomeCliente;
    private static double  saldo;

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            String strSaldo;
            try {
                System.out.print("Por favor, digite o número da Conta ! ");
                numero = sc.nextInt();
                System.out.print("Por favor, digite o número da Agência ! ");
                agencia = sc.next();
                System.out.print("Por favor, digite o nome do Cliente ! ");
                nomeCliente = sc.next();
                System.out.print("Por favor, digite o saldo ! ");
                strSaldo = sc.next();
                saldo = Double.parseDouble(strSaldo);

                System.out.print("Olá " + nomeCliente + ", ");
                System.out.print("obrigado por criar uma conta em nosso banco, ");
                System.out.print("sua agência é "+ agencia +", conta " + numero + " ");
                System.out.print("e seu saldo "+ saldo +" já está disponível para saque.");
            } catch (NumberFormatException e) {
                System.out.println("Erro: " + e.getMessage());
            }
            sc.close();
        }
    }

}
