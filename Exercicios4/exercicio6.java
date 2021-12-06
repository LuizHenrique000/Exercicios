import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o seu salário: ");
        double salario = in.nextDouble();
        System.out.println("Digite sua categoria");
        System.out.println("1 - Gerente\n2 - Desenvolvedores e Analistas\n3 - analistas");
        int categoria = in.nextInt();
        in.close();
        double Salariototal;
        switch (categoria) {
            case 1:
                Salariototal = salario + 15;
                System.out.println("Seu Salariototal é de: " + Salariototal + " R$");
                break;
            case 2:
                Salariototal = salario + 8;
                System.out.println("Seu Salariototal é de: " + Salariototal + " R$");
                break;
            case 3:
                Salariototal = salario + 12;
                System.out.println("Seu Salariototal é de: " + Salariototal + " R$");
            default:
                Salariototal = salario + 5;
                System.out.println("Seu Salariototal é de: " + Salariototal + " R$");
        }
    }
}