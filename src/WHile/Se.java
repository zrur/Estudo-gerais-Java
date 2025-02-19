package WHile;

import java.util.Scanner;

public class Se {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);

        System.out.println("Bem-vindo ao Conversor de Temperatura!");
        System.out.println("Escolha uma opção de conversão:");
        System.out.println("1 - Celsius para Fahrenheit");
        System.out.println("2 - Celsius para Kelvin");
        System.out.println("Outro valor - Encerrar o programa");

        int Escolha = Entrada.nextInt();

        while (Escolha == 1 || Escolha == 2) {
            System.out.print("Digite a temperatura para conversão: ");
            double temperatura = Entrada.nextDouble();

            if (Escolha == 1) {
                double resultado = (temperatura * 9 / 5) + 32;
                System.out.println(temperatura + "°C é igual a " + resultado + "°F");
            } else if (Escolha == 2) {
                double resultado = temperatura + 273.15;
                System.out.println(temperatura + "°C é igual a " + resultado + "K");
            }
            System.out.println("\nEscolha outra opção de conversão:");
            System.out.println("1 - Celsius para Fahrenheit");
            System.out.println("2 - Celsius para Kelvin");
            System.out.println("Outro valor - Encerrar o programa");
            Escolha = Entrada.nextInt();
        }

        System.out.println("Programa encerrado.");
    }
}
