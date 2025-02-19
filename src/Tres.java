import java.util.Scanner;

public class Tres {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int A,B,calculo,D;

        System.out.println("Bem-vindo ao calculadora de tempo");

        System.out.println("Digite a primeiro tempo: ");
        A = entrada.nextInt();
        calculo = 24 - A;
        System.out.println("Digite a segundo tempo: ");
        B = entrada.nextInt();
        D = calculo + B;

        System.out.println("O jogo durou "+ D +" Horas ");
    }
}
