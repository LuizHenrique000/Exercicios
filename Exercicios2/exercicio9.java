import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a temperatura em graus Celsius: ");
        int celsius = in.nextInt();
        int fahrenheit = (9 * celsius + 160) / 5;
        System.out.println("Sua temperatura em Fahrenheit: " + fahrenheit);
        in.close();
    }
}