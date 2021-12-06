import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o primeiro time: ");
        String time1 = in.next();
        System.out.println("Digite o número de gols: ");
        int placarGols1 = in.nextInt();
        System.out.println("Digite o segundo time: ");
        String time2 = in.next();
        System.out.println("Digite o número de gols: ");
        int placarGols2 = in.nextInt();
        in.close();
        if (placarGols1 > placarGols2) {
            System.out.println(time1 + " É o vencedor");
        } else if (placarGols2 > placarGols1) {
            System.out.println(time2 + " É o vencedor");
        } else if (placarGols1 == placarGols2) {
            System.out.println("Empate");
        }
    }
}