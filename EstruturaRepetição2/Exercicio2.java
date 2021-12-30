import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int antecessor = 0;
        int sucessor = 0;
        int quadrado = 0;
        int dobro = 0;
        float metade = 0;
        for (int i = 0; i < 16; i++) {
            System.out.println("Digite um número: ");
            int numero = in.nextInt();
            antecessor = numero - 1;
            sucessor = numero + 1;
            quadrado = (numero * numero);
            dobro = (numero * 2);
            metade = (numero / 2);
            System.out.println("------RESULTADOS------");
            System.out.println("O antecessor do seu número é: " + antecessor);
            System.out.println("O sucessor do seu número é: " + sucessor);
            System.out.println("O quadrado do seu número é: " + quadrado);
            System.out.println("O dobro do seu número é: " + dobro);
            System.out.println("A metade do seu número é: " + metade);
        }
        in.close();
    }
}
