import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um número: ");
        Float valor1 = in.nextFloat();
        System.out.println("Digite um outro número: ");
        Float valor2 = in.nextFloat();
        System.out.println("Digite a operação desejada:");
        String operador = in.next();
        float operacao;
        in.close();
        switch (operador) {
        case "+":
            operacao = valor1 + valor2;
            System.out.println(operacao);
            break;
        case "-":
            operacao = valor1 - valor2;
            System.out.println(operacao);
            break;
        case "*":
            operacao = valor1 * valor2;
            System.out.println(operacao);
            break;
        case "/":
            operacao = valor1 / valor2;
            System.out.println(operacao);
            if (valor2 == 0) {
                System.out.println("Divisão por zero é impossível :)");
            }
        }
    }
}
