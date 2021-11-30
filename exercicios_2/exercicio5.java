import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite sua primeira nota: ");
        float nota1 = in.nextFloat();
        System.out.println("Digite sua segunda nota: ");
        float nota2 = in.nextFloat();
        System.out.println("Digite sua terceira nota: ");
        float nota3 = in.nextFloat();
        System.out.println("Digite sua quarta nota: ");
        float nota4 = in.nextFloat();
        float media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("Sua média é: " + media);
        in.close();
    }
}