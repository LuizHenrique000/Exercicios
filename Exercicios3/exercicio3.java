import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite seu mês em número: ");
        int mes = in.nextInt();
        in.close();
        switch (mes) {
        case 2:
            System.out.println("Seu mês tem 28 dias");
            break;
        case 4:
        case 6:
        case 9:
        case 11:
            System.out.println("Seu mês tem 30 dias");
            break;
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
            System.out.println("Seu mês tem 31 dias");
            break;
        default:
            System.out.println("Digite um mês válido");
        }
    }
}