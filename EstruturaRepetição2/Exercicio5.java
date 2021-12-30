import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int percentual = 0;
        float altura = 0;
        float maiorAltura = 0;
        float menorAltura = 1000;
        int contadorMulheres = 0;
        int contadorHomens = 0;
        float mediaMulheres = 0;
        float mediaAlturaPopulação = 0;
        float alturaMasculina = 0;
        float alturaFeminina = 0;
        for (int i = 0; i < 51; i++) {
            System.out.println("Digite seu sexo: ");
            System.out.println("1 - Masculino, 2 - Feminino");
            int sexo = in.nextInt();
            System.out.println("Digite sua altura: ");
            altura = in.nextFloat();
            if (sexo == 1) {
                contadorHomens++;
                alturaMasculina = alturaMasculina + altura;
                percentual = (100 / 51) * contadorHomens;
            }
            if (sexo == 2) {
                contadorMulheres++;
                alturaFeminina = alturaFeminina + altura;
                mediaMulheres = (alturaFeminina / contadorMulheres);
            }
            if (altura > maiorAltura) {
                maiorAltura = altura;
            } else if (altura < menorAltura) {
                menorAltura = altura;
            }
        }
        mediaAlturaPopulação = (alturaFeminina + alturaMasculina) / 51;
        System.out.println("------RESULTADOS------");
        System.out.println("A maior altura encontrada é: " + maiorAltura);
        System.out.println("A menor altura encontrada é: " + menorAltura);
        System.out.println("A media da altura das mulheres é: " + mediaMulheres);
        System.out.println("A media da altura da população é: " + mediaAlturaPopulação);
        System.out.println("O percentual de homens na população é: " + percentual + "%");
        in.close();
    }
}
