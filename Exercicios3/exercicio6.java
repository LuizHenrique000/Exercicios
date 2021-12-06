import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um ano: ");
        int ano = in.nextInt();
        in.close();
        if (((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0)) {
            System.out.println("Seu ano é bissexto");
        } else {
            System.out.println("Seu ano não é bissexto");
        }
    }
}