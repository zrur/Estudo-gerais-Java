package WHile;

import java.util.Scanner;

public class Java {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int Vezes = 1 ;
        int x = entrada.nextInt();

        System.out.println("Bem vindo ao calculador de tabuada: ");
        System.out.println("Digite o número:");


        System.out.println("A tabuada do " + x + ":");
        while (Vezes <= 10){
           System.out.println( x + " x " + Vezes + " = " +( x * Vezes));
           Vezes++;
        }


    }
}
