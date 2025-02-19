package If;

import java.util.Scanner;

public class UM {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int Numero;

        System.out.println("Digite o número: ");
        Numero = entrada.nextInt();

        if (Numero % 2 == 0 ){
            System.out.println("Par");
        } else if (Numero % 2 == 1) {
            System.out.println("Impar");
        }
    }
}
