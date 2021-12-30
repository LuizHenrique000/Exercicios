import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float mediaSalarios = 0;
        int maiorIdade = 0;
        int menorIdade = 1000;
        int QuantidadeMulheresSalario200 = 0;
        float soma = 0;
        float salario = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Digite sua idade:");
            int idade = in.nextInt();
            System.out.println("Digite seu sexo: ");
            System.out.println("1 - Feminino, 2 - Masculino");
            int sexo = in.nextInt();
            System.out.println("Digite seu salário: ");
            salario = in.nextFloat();
            soma = soma + salario;
            mediaSalarios = (soma / 3);
            if (sexo == 1 && salario <= 200) {
                QuantidadeMulheresSalario200++;
            }
            if (idade > maiorIdade) {
                maiorIdade = idade;
            } else if (idade < menorIdade) {
                menorIdade = idade;
            }
        }
        System.out.println("------RESULTADOS------");
        System.out.println("A media de salários é: " + mediaSalarios);
        System.out.println("A maior idade é: " + maiorIdade);
        System.out.println("A menor idade é: " + menorIdade);
        System.out.println("A quantidade de mulheres com salário até R$ 200,00: " + QuantidadeMulheresSalario200);
        in.close();
    }
}
