package If;

import java.util.Scanner;

public class Hugo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int x, y;

        System.out.println("Digite o x: ");
        x = entrada.nextInt();
        System.out.println("Digite o y: ");
        y = entrada.nextInt();

        if (x == 0 && y == 0) {
            System.out.println("Origem");
        } else if (x == 0) {
            System.out.println("Eixo Y");
        } else if (y == 0) {
            System.out.println("Eixo X");
        } else if (x > 0 && y > 0) {
            System.out.println("Quadrante 1");
        } else if (x < 0 && y > 0) {
            System.out.println("Quadrante 2");
        } else if (x < 0 && y < 0) {
            System.out.println("Quadrante 3");
        } else if (x > 0 && y < 0) {
            System.out.println("Quadrante 4");
        }

        entrada.close();
    }
}
