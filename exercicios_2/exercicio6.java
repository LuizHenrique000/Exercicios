import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o número 1: ");
        int numero1 = in.nextInt();
        System.out.println("Digite o número 2: ");
        int numero2 = in.nextInt();
        System.out.println("Digite o número 3: ");
        int numero3 = in.nextInt();
        if (numero2 < numero1 && numero1 > numero3) {
            System.out.println("\nO maior é: " + numero1);
        } else if (numero1 < numero2 && numero2 > numero3) {
            System.out.println("\nO maior é: " + numero2);
        } else if (numero2 < numero3 && numero3 > numero1) {
            System.out.println("\nO maior é: " + numero3);
            in.close();
        }
    }
}