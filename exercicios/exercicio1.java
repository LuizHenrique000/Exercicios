import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a quantidade de maçãs: ");
        int quantidade = in.nextInt();
        double maçã = 0;
        in.close();
        if (maçã <= 12) {
            maçã = 1.30;
        } else {
            maçã = 1.00;
        }
        double valorTotal = maçã * quantidade;
        System.out.println("O valor da sua compra é de: " + valorTotal);
    }
}
