import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i;
        System.out.println("Digite o número : ");
        int numero = in.nextInt();
        in.close();
        for (i = 1; i <= 10; i++) {
            System.out.printf(" %2d * %d = %2d \n", i, numero, (i * numero));
        }
    }

}