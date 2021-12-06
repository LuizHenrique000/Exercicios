import java.util.Scanner;

public class exercicio13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe a velocidade do carro: ");
        int velocidadeCarro = in.nextInt();
        System.out.println("Informe a velocidade máxima para a rua: ");
        int velocidadePermitida = in.nextInt();
        in.close();
        if (velocidadeCarro - velocidadePermitida == 10) {
            System.out.println("Você ultrapassou o limite de velocidade e recebeu uma multa de 50 reais");
        } else if ((velocidadeCarro - velocidadePermitida) >= 51) {
            System.out.println("Você ultrapassou o limite de velocidade e recebeu uma multa de 300 reais");
        } else if (velocidadeCarro <= velocidadePermitida) {
            System.out.println("Você está andando na velocidade permitida");
        } else {
            System.out.println("Você ultrapassou o limite de velocidade e recebeu uma multa de 100 reais");
        }
    }
}
