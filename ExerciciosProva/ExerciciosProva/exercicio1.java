import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o número 1: ");
        int valor1 = in.nextInt();
        System.out.println("Digite o número 2: ");
        int valor2 = in.nextInt();
        System.out.println("Informe uma das opções abaixo: ");
        System.out.println("A - B - C - D - E");
        String opcoes = in.next();
        in.close();
        double operacaoA;
        double operacaoB;
        double operacaoC;
        double operacaoD;
        switch (opcoes.toUpperCase()) {
            case "A":
                operacaoA = valor1 + (valor2 * valor2);
                System.out.println(operacaoA);
                break;
            case "B":
                operacaoB = valor1 * 0.45;
                System.out.println(operacaoB);
                break;
            case "C":
                operacaoC = valor2 * 0.30 + (valor2);
                System.out.println(operacaoC);
                break;

            case "E":
                if (valor1 % 5 == 0) {
                    System.out.println("Seu número é: " + valor1 + "\nEle é múltiplo de 5");
                } else {
                    System.out.println("Seu número é: " + valor1 + "\nNão é múltiplo de 5");
                }
                break;
            case "D":
                operacaoD = valor2 * (valor1 * valor1);
                System.out.println(operacaoD);
                break;
            default:
                System.out.println("Insira um código válido");
        }
    }
}