import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o número da sua conta: ");
        in.nextInt();
        System.out.println("Digite o seu saldo: ");
        int saldoCliente = in.nextInt();
        System.out.println("Digite o seu débito: ");
        int debitoCliente = in.nextInt();
        System.out.println("Digite o seu crédito: ");
        int creditoCliente = in.nextInt();
        in.close();
        int saldoAtual = (saldoCliente - debitoCliente + creditoCliente);
        System.out.println("Seu saldo atual é " + saldoAtual);
        if (saldoAtual > 0) {
            System.out.println("Saldo positivo");
        } else {
            System.out.println("Saldo negativo");
        }
    }
}
