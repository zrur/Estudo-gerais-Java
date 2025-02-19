package If;

import java.util.Scanner;



public class Quatro {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int escolha, quantidade, ValorTotal,codigo;
        double preco,total;

        System.out.println("CARDAPIO");
        System.out.println("Digite o codigo do produto");
        codigo = entrada.nextInt();
        System.out.println("Digite a quantidade do produto");
        quantidade = entrada.nextInt();

        if (codigo == 1) {
            total = quantidade * 4.0;
        }
        else if (codigo == 2) {
            total = quantidade * 4.5;
        }
        else if (codigo == 3) {
            total = quantidade * 5.0;
        }
        else if (codigo == 4) {
            total = quantidade * 2.0;
        }
        else {
            total = quantidade * 1.5;
        }

        System.out.println("O valor total " + total);

    }
}
