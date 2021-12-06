import java.util.Scanner;

public class exercicio11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double salarioAjustado = 0;
        String[] arr = new String[25];
        arr[0] = "a";
        arr[1] = "b";
        arr[2] = "c";
        arr[3] = "d";
        arr[4] = "e";
        arr[5] = "f";
        arr[6] = "h";
        arr[7] = "i";
        arr[8] = "j";
        arr[9] = "k";
        arr[10] = "l";
        arr[11] = "m";
        arr[12] = "n";
        arr[13] = "o";
        arr[14] = "p";
        arr[15] = "q";
        arr[16] = "r";
        arr[17] = "s";
        arr[18] = "t";
        arr[19] = "u";
        arr[20] = "v";
        arr[21] = "w";
        arr[22] = "x";
        arr[23] = "y";
        arr[24] = "z";
        System.out.println("Digite o seu nome: ");
        String nome = in.next();
        System.out.println("Digite a sua categoria: ");
        String categoria = in.next();
        System.out.println("Digite seu salário atual");
        double salario = in.nextDouble();
        if (categoria.equals(arr[0]) || categoria.equals(arr[2]) || categoria.equals(arr[5])
                || categoria.equals(arr[6])) {
            salarioAjustado = salario + (salario * 10 / 100);

        } else if (categoria.equals(arr[1]) || categoria.equals(arr[3]) || categoria.equals(arr[4])
                || categoria.equals(arr[7]) || categoria.equals(arr[8]) || categoria.equals(arr[18])) {
            salarioAjustado = salario + (salario * 15 / 100);

        } else if (categoria.equals(arr[9]) || categoria.equals(arr[16])) {
            salarioAjustado = salario + (salario * 25 / 100);

        } else if (categoria.equals(arr[10]) || categoria.equals(arr[11]) || categoria.equals(arr[12])
                || categoria.equals(arr[13]) || categoria.equals(arr[14]) || categoria.equals(arr[15])
                || categoria.equals(arr[17])) {
            salarioAjustado = salario + (salario * 35 / 100);

        } else if (categoria.equals(arr[19]) || categoria.equals(arr[20]) || categoria.equals(arr[22])
                || categoria.equals(arr[23]) || categoria.equals(arr[21]) || categoria.equals(arr[24])) {
            salarioAjustado = salario + (salario * 50 / 100);
        }
        System.out.println("Nome: " + nome);
        System.out.println("Categoria: " + categoria);
        System.out.println(salarioAjustado);
        in.close();
    }
}
