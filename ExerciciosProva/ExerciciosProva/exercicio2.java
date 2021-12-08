import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o número 1: ");
        int valor1 = in.nextInt();
        System.out.println("Digite o número 2: ");
        int valor3 = in.nextInt();
        System.out.println("Digite o número 3: ");
        int valor2 = in.nextInt();
        in.close();
        if (valor2 >= valor1 && valor2 < valor3) {
            System.out.println("O valor 3 encontra-se no intervalo entre valor 1 e valor 2");
        } else {
            System.out.println("O valor 3 não está presente no intervalo entre valor 1 e valor 2");
        }
    }
}