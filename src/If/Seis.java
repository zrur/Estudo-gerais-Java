package If;

import java.util.Scanner;

public class Seis {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;

        System.out.println("Digite o numero");
        numero = entrada.nextInt();

        if (numero >=0 || numero >=25 ) {
            System.out.println("Este número esta entre 0 e 25");
        } else if (numero >=25 || numero >=50) {
            System.out.println("Este número esta entre 25 e 50");
        } else if (numero >=50 || numero >=75) {
            System.out.println("Este número esta entre 50 e 75");
        } else if (numero >=75 || numero >=100) {
            System.out.println("Este número esta entre 75 e 100");

        }
    }
}
