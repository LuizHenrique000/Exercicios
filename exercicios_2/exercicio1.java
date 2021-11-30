import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o valor 1: ");
        int valor1 = in.nextInt();
        System.out.println("Digite o valor 2: ");
        int valor2 = in.nextInt();
        int soma = valor1 + valor2;
        System.out.println("Sua soma é: " + soma);
        in.close();
    }
}