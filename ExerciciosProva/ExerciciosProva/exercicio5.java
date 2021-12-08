import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o total de diárias: ");
        int totalDiarias = in.nextInt();
        in.close();
        double diaria = 120.00;
        if (totalDiarias > 7) {
            diaria = (120.00 + 4);
        } else if (totalDiarias == 7) {
            diaria = (120.00 + 7);
        } else if (totalDiarias < 7) {
            diaria = (120.00 + 10);
        }

        System.out.println("Sua conta deu o total de: " + diaria);
    }
}