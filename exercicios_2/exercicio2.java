import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o valor A: ");
        int valor1 = in.nextInt();
        System.out.println("Digite o valor B: ");
        int valor2 = in.nextInt();
        int multiplicacao = valor1 * valor2;
        in.close();
        if (multiplicacao > 100) {
            System.out.println("Resultado é maior que 100");
        } else if (multiplicacao < 100) {
            System.out.println("Resultado é menor que 100");
        } else if (multiplicacao == 100) {
            System.out.println("Resultado é igual a 100");
        }
    }
}