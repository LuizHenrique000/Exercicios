import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        int valor1 = in.nextInt();
        in.close();
        if (valor1 > 100) {
            System.out.println("É maior que 100");
        } else if (valor1 == 100) {
            System.out.println("É igual a 100");
        } else {
            System.out.println("Não é maior que 100");
        }
    }
}