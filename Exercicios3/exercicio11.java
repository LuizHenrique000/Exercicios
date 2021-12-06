import java.util.Scanner;

public class exercicio11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int numero1 = in.nextInt();
        System.out.println("Digite o segundo número: ");
        int numero2 = in.nextInt();
        System.out.println("Digite o terceiro número: ");
        int numero3 = in.nextInt();
        in.close();
        if (numero2 < numero1 && numero3 < numero1) {
            System.out.println("\n" + numero1);
        } else if (numero1 < numero2 && numero3 < numero2) {
            System.out.println("\n" + numero2);
        } else if (numero2 < numero3 && numero2 < numero3)
            System.out.println("\n" + numero3);
    }
}