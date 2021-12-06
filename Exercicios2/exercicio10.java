import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o valor A: ");
        int valorA = in.nextInt();
        System.out.println("Digite o valor B: ");
        int valorB = in.nextInt();
        in.close();
        if (valorA > 100 && valorB > 100) {
            System.out.println("São maiores que 100");
        } else if (valorA < 100 && valorB < 100) {
            System.out.println("São menores que 100");
        } else if (valorA == 100 && valorB == 100) {
            System.out.println("São iguais a 100, Você tentou testar né :) ");
        } else if (valorA == 100 && valorB != 100) {
            System.out.println("Apenas o valor A é igual a 100, Eu pensei nessa possibilidade também :) ");
        } else if (valorA != 100 && valorB == 100) {
            System.out.println("Apenas o valor B é igual a 100, hehe :) ");
        } else if (valorA > 100 && valorB < 100) {
            System.out.println("Apenas o valor A é maior que 100");
        } else if (valorB > 100 && valorA < 100) {
            System.out.println("Apenas o valor B é maior que 100");
        }
    }
}