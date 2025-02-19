package If;

import java.util.Scanner;
import java.util.Locale;

public class Fat {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        double Salario,calculo;
        double imposto;

        System.out.println("Digite o salario");
        Salario = entrada.nextDouble();

        if (Salario <= 2000.0) {
            imposto = 0.0;
        }
        else if (Salario <= 3000.0) {
            imposto = (Salario - 2000.0) * 0.08;
        }
        else if (Salario <= 4500.0) {
            imposto = (Salario - 3000.0) * 0.18 + 1000.0 * 0.08;
        }
        else {
            imposto = (Salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
        }

        if (imposto == 0.0) {
            System.out.println("Isento");
        }
        else {
            System.out.printf("R$ %.2f%n", imposto);
        }

        entrada.close();
    }
}
