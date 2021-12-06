import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o código: ");
        int codigoDigitado = in.nextInt();
        in.close();
        switch (codigoDigitado) {
        case 1:
            System.out.println("Código 1 - Alimento não perecível");
            break;
        case 2:
            System.out.println("Código 2 - Alimento perecível");
            break;
        case 3:
            System.out.println("Código 3 - Vesturário");
            break;
        case 4:
            System.out.println("Código 4 - Limpeza");
            break;
        default:
            System.out.println("Digite um código válido");
        }
    }
}