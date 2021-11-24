import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o valor A: ");
        int valorA = in.nextInt();
        System.out.println("Digite o valor B: ");
        int valorB = in.nextInt();
        System.out.println("Digite o valor C: ");
        int valorC = in.nextInt();
        in.close();
        if ((valorA + valorB) < valorC) {
            System.out.println("A soma é menor que C");
        } else if ((valorA + valorB) > valorC) {
            System.out.println("A soma é maior que C");
        } else if ((valorA + valorB) == valorC) {
            System.out.println("A soma é igual a C");
        }
    }
}
