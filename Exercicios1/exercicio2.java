import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o ano atual: ");
        int anoAtual = in.nextInt();
        System.out.println("Digite o seu ano de nascimento: ");
        int anoDeNascimento = in.nextInt();
        in.close();
        int idade;
        idade = anoAtual - anoDeNascimento;
        if (idade >= 16) {
            System.out.println("Você pode votar");
        } else {
            System.out.println("Você não pode votar");
        }
    }
}