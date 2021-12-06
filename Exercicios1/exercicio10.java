import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nome;
        double valorPorca = 0.50;
        double valorParafuso = 0.60;
        double valorArruela = 0.70;
        int quantidadePorcas = 0;
        int quantidadeParafusos = 0;
        int quantidadeArruelas = 0;
        System.out.print("Digite o seu nome : ");
        nome = in.next();
        System.out.print("Digite a quantidade de porcas : ");
        quantidadePorcas = in.nextInt();
        System.out.print("Digite a quantidade de parafusos : ");
        quantidadeParafusos = in.nextInt();
        System.out.print("Digite a quantidade de arruelas : ");
        quantidadeArruelas = in.nextInt();
        double valorTotalPorcas = (valorPorca * 10 / 100) * quantidadePorcas;
        double valorTotalParafusos = (valorParafuso * 20 / 100) * quantidadeParafusos;
        double valorTotalArruelas = (valorArruela * 30 / 100) * quantidadeArruelas;
        double totalCompra = valorTotalPorcas + valorTotalParafusos + valorTotalArruelas;
        System.out.print("\nNome: " + nome);
        System.out.println("\nQuantidade de porcas: " + quantidadePorcas + " -10% de desconto");
        System.out.println("\nQuantidade de parafusos: " + quantidadeParafusos + " -20% de desconto");
        System.out.println("\nQuantidade de arruelas: " + quantidadeArruelas + " -30% de desconto");
        System.out.print("\nTotal da sua compra: " + totalCompra);
        in.close();
    }
}

