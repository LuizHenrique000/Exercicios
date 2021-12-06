import java.util.Scanner;

public class exercicio14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o valor 1: ");
        int valor1 = in.nextInt();
        System.out.println("Digite o valor 2: ");
        int valor2 = in.nextInt();
        System.out.println("Digite o valor 3: ");
        int valor3 = in.nextInt();
        in.close();
        int soma = valor1 + valor2 + valor3;
        int subtracao = valor1 - valor2 - valor3;
        if (valor1 < valor2 && valor2 < valor3 && valor3 > valor1 && valor3 > valor2) {
            System.out.printf("Valor1: %d\nValor2: %d\nValor3: %d", valor1, valor2, valor3);
            System.out.println("\nSoma: " + soma);
            System.out.println("Subtração: " + subtracao);
        } else if (valor1 < valor2 && valor1 < valor3 && valor2 > valor1 && valor2 > valor3) {
            System.out.printf("Valor1: %d\nValor2: %d\nValor3: %d", valor1, valor3, valor2);
            System.out.println("\nSoma: " + soma);
            System.out.println("Subtração: " + subtracao);
        } else if (valor1 > valor2 && valor1 < valor3 && valor2 < valor3 && valor3 > valor1) {
            System.out.printf("Valor1: %d\nValor2: %d\nValor3: %d", valor2, valor1, valor3);
            System.out.println("\nSoma: " + soma);
            System.out.println("Subtração: " + subtracao);
        } else if (valor3 < valor1 && valor3 < valor2 && valor2 > valor3 && valor2 > valor1) {
            System.out.printf("Valor1: %d\nValor2: %d\nValor3: %d", valor3, valor1, valor2);
            System.out.println("\nSoma: " + soma);
            System.out.println("Subtração: " + subtracao);
        } else if (valor3 < valor1 && valor3 < valor2 && valor2 < valor1 && valor2 > valor3) {
            System.out.printf("Valor1: %d\nValor2: %d\nValor3: %d", valor3, valor2, valor1);
            System.out.println("\nSoma: " + soma);
            System.out.println("Subtração: " + subtracao);
        } else if (valor1 > valor2 && valor1 > valor3 && valor2 < valor3 && valor3 < valor1) {
            System.out.printf("Valor1: %d\nValor2: %d\nValor3: %d", valor2, valor3, valor1);
            System.out.println("\nSoma: " + soma);
            System.out.println("Subtração: " + subtracao);
        } else if (valor1 == valor2 && valor2 == valor3) {
            System.out.printf("Valor1: %d\nValor2: %d\nValor3: %d", valor1, valor2, valor3);
            System.out.println("\nSoma: " + soma);
            System.out.println("Subtração: " + subtracao);
        }
    }
}