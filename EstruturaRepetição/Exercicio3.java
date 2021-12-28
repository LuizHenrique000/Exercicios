import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int contador = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite sua idade: ");
            int idades = in.nextInt();
            if (idades > 18) {
                contador++;
            }
        }
        System.out.println("A quantidade de pessoas maiores de 18 são: " + contador);
        in.close();
    }
}
