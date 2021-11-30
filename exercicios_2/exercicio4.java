import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o valor 1: ");
        int valor1 = in.nextInt();
        System.out.println("Digite o valor 2: ");
        int valor2 = in.nextInt();
        if (valor1 % 2 == 0 && valor2 % 2 == 0) {
            System.out.println("São pares");
        } else if (valor1 % 2 != 0 && valor2 % 2 != 0) {
            System.out.println("São ímpares");
        } else if (valor1 % 2 == 0 && valor2 % 2 != 0) {
            System.out.println("Valor 1 é par e Valor 2 é ímpar");
        } else if (valor1 % 2 != 0 && valor2 % 2 == 0) {
            System.out.println("Valor 1 é ímpar e valor 2 é par");
        }
        in.close();
    }
}