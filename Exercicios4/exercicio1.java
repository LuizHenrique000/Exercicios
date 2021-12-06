import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o código do produto: ");
        double codigo = in.nextDouble();
        System.out.println("Digite a quantidade comprada: ");
        int quantidade = in.nextInt();
        if (codigo == 1001) {
            codigo = 5.32;
            double total = quantidade * codigo;
            System.out.println("Preço total: " + total);
        } else if (codigo == 1002) {
            codigo = 63.89;
            double total = quantidade * codigo;
            System.out.println("Preço total: " + total);
        } else if (codigo == 1003) {
            codigo = 9.87;
            double total = quantidade * codigo;
            System.out.println("Preço total: " + total);
        } else if (codigo == 1004) {
            codigo = 53.00;
            double total = quantidade * codigo;
            System.out.println("Preço total: " + total);
        } else {
            System.out.println("Digite um código válido");
        }
        System.out.println("Deseja comprar novamente ?");
        System.out.println("1 - sim\n2 - não");
        int resposta = in.nextInt();
        if (resposta == 2) {
            System.out.println("Muito obrigado pela compra!");
        } else {
            System.out.println("Digite o código do produto: ");
            double codigo2 = in.nextDouble();
            System.out.println("Digite a quantidade comprada: ");
            int quantidade2 = in.nextInt();
            in.close();
            if (resposta == 1 && codigo2 == 1001) {
                codigo2 = 5.32;
                double total2 = quantidade2 * codigo2;
                System.out.println("Preço total: " + total2);
            } else if (resposta == 1 && codigo2 == 1002) {
                codigo2 = 63.89;
                double total = quantidade2 * codigo2;
                System.out.println("Preço total: " + total);
            } else if (resposta == 1 && codigo2 == 1003) {
                codigo2 = 9.87;
                double total = quantidade2 * codigo2;
                System.out.println("Preço total: " + total);
            } else if (resposta == 1 && codigo2 == 1004) {
                codigo2 = 53.00;
                double total = quantidade2 * codigo2;
                System.out.println("Preço total: " + total);
            } else {
                System.out.println("Digite um código válido");
            }
        }
    }
}