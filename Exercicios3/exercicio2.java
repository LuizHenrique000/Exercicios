import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite uma letra: ");
        String letra = in.next();
        in.close();
        switch (letra.toUpperCase()) {
        case "A":
        case "E":
        case "I":
        case "O":
        case "U":
            System.out.println("Sua letra é uma vogal");
            break;
        default:
            System.out.println("Sua letra é uma consoante");
        }
    }
}