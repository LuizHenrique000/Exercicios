import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numeros = 0;
        int x = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite 10 números: ");
            numeros = in.nextInt();
            in.close();
            for (x = 0; x <= 10; x++) {
                System.out.print(x + " x " + numeros + " = ");
                System.out.println(x * numeros);
            }
        }
        System.out.println(numeros);
    }
}