import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o número : ");
        int numero = in.nextInt();
        int antecessor = numero - 1;
        int sucessor = numero + 1;
        System.out.println("Seu antecessor: " + antecessor);
        System.out.println("Seu sucessor: " + sucessor);
        in.close();
    }
}
