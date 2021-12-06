import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o seu consumo em kWh: ");
        double consumo = in.nextDouble();
        System.out.println("Digite seu tipo de conta");
        System.out.println("1 - Residencial\n2 - Comercial\n3 - Industrial");
        int conta = in.nextInt();
        in.close();
        double total;
        switch (conta) {
            case 1:
                total = consumo * 0.30;
                System.out.println("Seu total é de: " + total + "R$");
                break;
            case 2:
                total = consumo * 0.50;
                System.out.println("Seu total é de: " + total + "R$");
                break;
            case 3:
                total = consumo * 0.70;
                System.out.println("Seu total é de: " + total + "R$");
            default:
                System.out.println("Digite um código válido!");
        }
    }
}