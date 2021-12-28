import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = 0;
        System.out.println("Digite um número: ");
        int numeros = in.nextInt();
        in.close();
        for (i = 1; i < numeros; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " - Par");
            }
            if (i % 2 != 0)
                System.out.println(i);
        }
    }
}