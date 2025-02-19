package WHile;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int Senha;
        int Senha_Correta = 2002;

        System.out.println("Digite sua senha: ");
        Senha = entrada.nextInt();

        while (Senha != Senha_Correta) {
            System.out.println("Senha incorreta!");
            System.out.println("Digite sua senha: ");
            Senha = entrada.nextInt();
        }
        System.out.println("Senha correta!");
    }
}