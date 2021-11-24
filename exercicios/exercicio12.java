import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nomeCliente = in.next();
        System.out.println("Digite o total de diárias: ");
        int totalDiarias = in.nextInt();
        in.close();
        double diaria = 60.00;
        if (totalDiarias > 15) {
            diaria = (60.00 + 5.50);
        } else if (totalDiarias == 15) {
            diaria = (60.00 + 6.00);
        } else if (totalDiarias < 15) {
            diaria = (60.00 + 8.00);
        }
        System.out.println(nomeCliente);
        System.out.println("Sua conta deu o total de: " + diaria);
    }
}