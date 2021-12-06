import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nome = in.next();
        System.out.println("Digite a sua nota em Português: ");
        int primeiraNota = in.nextInt();
        System.out.println("Digite a sua nota em Matemática: ");
        int segundaNota = in.nextInt();
        System.out.println("Digite a sua nota em Conhecimentos Gerais: ");
        int terceiraNota = in.nextInt();
        in.close();
        float media = (primeiraNota + segundaNota + terceiraNota) / 3;
        System.out.println("Nome:" + nome);
        System.out.println("\nNota em português: " + primeiraNota);
        System.out.println("\nNota em Matemática: " + segundaNota);
        System.out.println("\nNota em Conhecimentos Gerais: " + terceiraNota);
        System.out.println("\nSua média: " + media);
        if (media > 7 && primeiraNota >= 5 && segundaNota >= 5 && terceiraNota >= 5) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}
