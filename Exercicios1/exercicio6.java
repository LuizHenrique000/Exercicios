import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a quantidade atual em estoque: ");
        int estoqueAtual = in.nextInt();
        System.out.println("Digite a quantidade máxima de estoque: ");
        int estoqueMaximo = in.nextInt();
        System.out.println("Digite a quantidade mínima em estoque: ");
        int estoqueMinimo = in.nextInt();
        in.close();
        int quantidadeMedia = (estoqueMaximo + estoqueMinimo) / 2;
        if (estoqueAtual >= quantidadeMedia) {
            System.out.println("Não efetuar compra");
        } else {
            System.err.println("Efetuar compra");
        }
    }
}
