import java.util.Scanner;

public class exercicio16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe o primeiro valor: ");
        int valor1 = in.nextInt();
        System.out.println("Informe o segundo valor: ");
        int valor2 = in.nextInt();
        in.close();
        if (valor2 == 0) {
            System.out.println("Divisão por 0 é impossível :)");
            int divisao = valor1 / valor2;
            System.out.println("Sua divisão: " + divisao);
        }
    }
}