package WHile;

import java.util.Scanner;

public class Sas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Contagem de Números Pares e Ímpares: (limite 10 números)");

        int Pares = 0;
        int Impares = 0;

        int Contador = 0;

        while (Contador < 10) {
            System.out.println("Digite o número");
            int N = input.nextInt();
            if (N % 2 == 0) {
                Pares++;
            }else {
                Impares++;
            }
            Contador++;
        }
        System.out.println("O Resultado dos impares e pares foi esse: ");
        System.out.println(Impares + " Impares");
        System.out.println(Pares + " Pares");
    }
}