import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero = 0;
        int contadorMaior = numero;
        int contadorMenor = numero;
        for (int i = 0; i < 15; i++) {
            System.out.println("Digite 15 números: ");
            numero = in.nextInt();
            if (numero > contadorMaior) {
                contadorMaior = numero;
            } else if (numero < contadorMenor) {
                contadorMenor = numero;
            }
        }
        System.out.println("O maior número é o: " + contadorMaior);
        System.out.println("O menor número é o: " + contadorMenor);
        in.close();
    }
}