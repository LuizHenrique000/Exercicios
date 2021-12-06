import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        int valor1 = in.nextInt();
        in.close();
        if (valor1 % 3 == 0) {
            System.out.println("É múltiplo de 3");
        } else {
            System.out.println("Não é múltiplo de 3");
        }
    }
}