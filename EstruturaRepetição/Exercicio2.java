import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = in.nextInt();
        int soma = 0;
        int i = 0;
        for (i = 0; i <= numero; i++) {
            soma = soma + i;
            System.out.println(soma);
            in.close();
        }
        if (soma == 0) {
            System.out.println("\nO número somado: " + soma + "\nÉ igual a 0");
        } else if (soma >= 100) {
            System.out.println("\nO número somado: " + soma + "\nÉ maior que 100");
        } else if (soma < 100) {
            System.out.println("\nO número somado: " + soma + "\nÉ menor que 100");

        }
    }
}
