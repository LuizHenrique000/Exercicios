import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o conceito do aluno: ");
        String conceito = in.next();
        in.close();
        switch (conceito.toUpperCase()) {
        case "A":
            System.out.println("Excelente");
            break;
        case "B":
            System.out.println("Ótimo");
            break;
        case "C":
            System.out.println("Bom");
            break;
        case "D":
            System.out.println("Regular");
            break;
        case "E":
            System.out.println("Ruim");
            break;
        case "F":
            System.out.println("Nos vemos no ano que vem");
        default:
            System.out.println("Conceito inválido!");
        }
    }
}