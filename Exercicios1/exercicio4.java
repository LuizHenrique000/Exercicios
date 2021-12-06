import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite seu salário fixo: ");
        int salarioFixo = in.nextInt();
        System.out.println("Digite o valor das vendas efetuadas: ");
        int valorVendas = in.nextInt();
        double salarioTotal = 0;
        in.close();
        if (valorVendas <= 1500) {
            salarioTotal = (1500 * 0.03) + salarioFixo;
        } else {
            salarioTotal = (1500 * 0.05) + salarioFixo;
        }
        System.out.println("Seu salário total é: " + salarioTotal);
    }
}