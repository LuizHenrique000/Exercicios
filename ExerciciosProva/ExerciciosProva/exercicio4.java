import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o número 1: ");
        int valor1 = in.nextInt();
        System.out.println("Digite o número 2: ");
        int valor2 = in.nextInt();
        System.out.println("Digite o número 3: ");
        int valor3 = in.nextInt();
        in.close();
        int media = ((valor1 + valor2 + valor3) / 3);
        if (valor1 > valor2 && valor1 > valor3 && valor2 < valor1 && valor2 < valor3) {
            System.out.println("Valor 1 é o maior e o valor 2 é o menor");
            System.out.println("A média deles é: " + media);
        } else if (valor2 > valor1 && valor2 > valor3 && valor1 < valor2 && valor1 < valor3) {
            System.out.println("Valor 2 é o maior e o valor 1 é o menor");
            System.out.println("A média deles é: " + media);
        } else if (valor3 > valor1 && valor3 > valor2 && valor2 < valor1 && valor2 < valor3) {
            System.out.println("Valor 3 é o maior e o valor 2 é o menor");
            System.out.println("A média deles é: " + media);
        } else if (valor2 > valor1 && valor2 > valor3 && valor3 < valor1 && valor3 < valor2) {
            System.out.println("Valor 2 é o maior e o valor 3 é o menor");
            System.out.println("A média deles é: " + media);
        } else if (valor3 > valor1 && valor3 > valor2 && valor1 < valor2 && valor1 < valor3) {
            System.out.println("Valor 3 é o maior e o valor 1 é o menor");
            System.out.println("A media deles é: " + media);
        } else if (valor1 > valor2 && valor1 > valor3 && valor3 < valor1 && valor3 < valor2) {
            System.out.println("Valor 1 é o maior e o valor 3 é o menor");
        }
    }
}
