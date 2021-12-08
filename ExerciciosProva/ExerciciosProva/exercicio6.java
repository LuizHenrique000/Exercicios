import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int valor = in.nextInt();
        in.close();
        int op1 = (valor - 1) * (valor - 1);
        int op2 = (valor - 1) * (valor - 1) * (valor - 1);
        System.out.println("O quadrado do seu antecessor é: " + op1);
        System.out.println("O cubo do seu antecessor é: " + op2);

    }
}