import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;

        System.out.println("Digite um número pra ver se é negativo ou positivo");
        numero = scanner.nextInt();

        if (numero > 0) {
            System.out.println("Positivo");

        } else if (numero < -0) {
            System.out.println("Negativo");

        }
    }
}
