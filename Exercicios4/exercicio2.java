import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o seu gênero: ");
        System.out.println("1 - Masculino\n2 - Feminino");
        int genero = in.nextInt();
        System.out.println("Digite o seu tempo de casa em anos: ");
        int tempo = in.nextInt();
        System.out.println("Digite o seu salário:");
        float salario = in.nextFloat();
        in.close();
        float salarioComBonus;
        if (genero == 1 && tempo >= 15) {
            salarioComBonus = salario + (salario * 20) / 100;
            System.out.println("Seu salário com bônus: " + salarioComBonus);
        } else if (genero == 2 && tempo >= 10) {
            salarioComBonus = salario + (salario * 25) / 100;
        } else {
            salarioComBonus = salario + 5000;
            System.out.println("Seu salário com bônus:" + salarioComBonus);
        }
    }
}