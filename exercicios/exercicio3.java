
import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int v1;
        int v2;
        int v3;
        System.out.println("Digite o valor 1: ");
        v1 = in.nextInt();
        System.out.println("Digite o valor 2: ");
        v2 = in.nextInt();
        System.out.println("Digite o valor 3: ");
        v3 = in.nextInt();
        if (v1 < v2 && v2 < v3 && v3 > v1 && v3 > v2) {
            System.out.printf("Valor1: %d\nValor2: %d\nValor3: %d", v1, v2, v3);
        } else if (v1 < v2 && v1 < v3 && v2 > v1 && v2 > v3) {
            System.out.printf("Valor1: %d\nValor2: %d\nValor3: %d", v1, v3, v2);
        } else if (v1 > v2 && v1 < v3 && v2 < v3 && v3 > v1) {
            System.out.printf("Valor1: %d\nValor2: %d\nValor3: %d", v2, v1, v3);
        } else if (v3 < v1 && v3 < v2 && v2 > v3 && v2 > v1) {
            System.out.printf("Valor1: %d\nValor2: %d\nValor3: %d", v3, v1, v2);
        } else if (v3 < v1 && v3 < v2 && v2 < v1 && v2 > v3) {
            System.out.printf("Valor1: %d\nValor2: %d\nValor3: %d", v3, v2, v1);
        } else if (v1 > v2 && v1 > v3 && v2 < v3 && v3 < v1) {
            System.out.printf("Valor1: %d\nValor2: %d\nValor3: %d", v2, v3, v1);
        } else {
            System.out.println("Fim do programa");
            in.close();
        }
    }
}
