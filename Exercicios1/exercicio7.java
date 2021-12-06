import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = in.nextInt();
        in.close();
        if (numero <= 10) {
            System.out.println("\nF1");
        } else if (numero > 10 && numero <= 100) {
            System.out.println("\nF2");
        } else if (numero > 100) {
            System.out.println("\nF3");
        } else {
            System.out.println("\nFim do programa");
        }
    }
}