import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        int valor1 = in.nextInt();
        int antecessor = valor1 - 1;
        in.close();
        if (antecessor % 2 == 0 && antecessor > 0) {
            System.out.println("\nSeu antecessor: " + antecessor + "\nEle é par e positivo");
        } else if (antecessor % 2 != 0 && antecessor > 0) {
            System.out.println("\nSeu antecessor: " + antecessor + "\nEle é ímpar e positivo");
        } else if (antecessor % 2 == 0 && antecessor < 0) {
            System.out.println("\nSeu antecessor: " + antecessor + "\nEle é par e negativo");
        } else if (antecessor % 2 != 0 && antecessor < 0) {
            System.out.println("\nSeu antecessor: " + antecessor + "\nEle é ímpar e negativo");
        } else if (antecessor == 0) {
            System.out.println("\nZero é neutro :)");
        }
    }
}