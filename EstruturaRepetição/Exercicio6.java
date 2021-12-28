import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int fatorial = 0;
        System.out.println("Digite um número: ");
        int numero = in.nextInt();
        in.close();
        fatorial = numero;
        for (int fat = (numero - 1); fat >= 1; fat--) {
            if (fat == 0) {
                fat = 1;
            }
            fatorial = fatorial * fat;
        }
        System.out.println(fatorial);
    }
}
