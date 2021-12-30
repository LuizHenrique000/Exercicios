import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int soma = 0;
        int contadorNegativo = 0;
        for (int i = 0; i < 21; i++) {
            System.out.println("Digite um número: ");
            int numero = in.nextInt();
            if (numero > 0) {
                soma = soma + numero;
            }
            if (numero < 0) {
                contadorNegativo++;
            }
        }
        System.out.println("A soma dos positivos é: " + soma);
        System.out.println("A quantidade de negativos é: " + contadorNegativo);
        in.close();
    }
}
