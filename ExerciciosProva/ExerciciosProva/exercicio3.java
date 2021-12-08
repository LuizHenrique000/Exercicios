import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o valor A: ");
        int valorA = in.nextInt();
        System.out.println("Digite o valor B: ");
        int valorB = in.nextInt();
        System.out.println("Digite o valor C: ");
        int valorC = in.nextInt();
        in.close();
        if (valorA > (valorB + valorC)) {
            System.out.println("Valor A é maior que a soma do valor B com o valor C");
        } else if (valorB < (valorC - 1)) {
            System.out.println("Valor B é menor que o antecessor do valor C");
        } else if (valorC == (valorA * valorA)) {
            System.out.println("Valor C é igual ao quadrado do valor A");
        } else if (valorA % 2 == 0) {
            System.out.println("Valor A é par");
        } else if (valorA % 2 != 0) {
            System.out.println("Valor A é ímpar");
        } else if (valorB > (2 * valorC)) {
            System.out.println("Valor B é maior que o dobro do valor C");
        }
    }
}
