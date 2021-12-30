import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int medias = 0;
        int faltas = 0;
        for (int i = 0; i < 51; i++) {
            System.out.println("Digite o número da média: ");
            medias = in.nextInt();
            System.out.println("Digite o número de faltas: ");
            faltas = in.nextInt();
            if (medias >= 7 && faltas < 15) {
                System.out.println("Aprovado por média e presença!");
            } else if (medias >= 7 && faltas >= 15) {
                System.out.println("Aprovado por média e reprovado por presença!");
            } else if (medias < 7 && faltas <= 15) {
                System.out.println("Reprovado por média e aprovado por presença!");
            } else if (medias < 7 && faltas >= 15) {
                System.out.println("Reprovado por média e presença!");
            }
        }
        in.close();
    }
}