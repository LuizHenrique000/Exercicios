import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = in.nextInt();
        System.out.println("\nCalculando...");
        in.close();
        if (idade >= 18) {
            System.out.println("\nPode tirar a carteira de motorista");
        } else {
            System.out.println("\nVocê é de menor ainda :)");
        }
    }
}