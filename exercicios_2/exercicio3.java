import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Seu primeiro nome: ");
        String primeiroNome = in.nextLine();
        System.out.println("Seu sobrenome: ");
        String sobrenome = in.nextLine();
        System.out.println("Olá, seu nome é: " + primeiroNome + " " + sobrenome);
        in.close();
    }
}