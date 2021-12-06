import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o seu salário fixo: ");
        double salarioFixo = in.nextFloat();
        System.out.println("Digite a quantidade de carros vendidos: ");
        int carrosVendidos = in.nextInt();
        System.out.println("Valor total das vendas: ");
        double valorVendas = in.nextDouble();
        System.out.println("Valor recebido por carro vendido: ");
        double valorPorCarroVendido = 5;
        double salarioTotal = (valorVendas * 0.05);
        double total = salarioTotal + salarioFixo + valorPorCarroVendido;
        System.out.println("Seu salário final é de: " + total);
        in.close();
    }
}