package WHile;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        System.out.println("WHile.Calculadora de 2 números:(Selecione a operação)" +
                "\n 1 - Soma " +
                "\n 2 - Subtração" +
                "\n 3 - Divisão" +
                "\n 4 - Multiplicação" +
                "\nOutro valor - Encerrar o programa" );
        int operacao = Entrada.nextInt();

        while (operacao >= 1 && operacao <= 4){
            if (operacao == 1){
                System.out.println("Digite o primeiro valor: ");
                int ValorUm = Entrada.nextInt();
                System.out.println("Digite o segundo valor: ");
                int ValorDois = Entrada.nextInt();
                int soma = ValorUm + ValorDois;
                System.out.print("O resultado da soma é: " + soma);

            } else if (operacao ==2) {
                System.out.println("Digite o primeiro valor: ");
                int ValorUm = Entrada.nextInt();
                System.out.println("Digite o segundo valor: ");
                int ValorDois = Entrada.nextInt();
                int subtracao = ValorUm - ValorDois;
                System.out.print("O resultado da subtração é " + subtracao);

            } else if (operacao == 3) {
                System.out.println("Digite o primeiro valor: ");
                int ValorUm = Entrada.nextInt();
                System.out.println("Digite o segundo valor: ");
                int ValorDois = Entrada.nextInt();
                int divisão = ValorUm /ValorDois;
                System.out.print("O resultado da divisão "+ divisão);

            } else if (operacao == 4 ) {
                System.out.println("Digite o primeiro valor: ");
                int ValorUm = Entrada.nextInt();
                System.out.println("Digite o segundo valor: ");
                int ValorDois = Entrada.nextInt();
                int multiplicação = ValorUm * ValorDois;
                System.out.println("O resultado da multiplicação " + multiplicação);
                
            }
            System.out.println("WHile.Calculadora de 2 números:(Selecione a operação)" +
                    "\n 1 - Soma " +
                    "\n 2 - Subtração" +
                    "\n 3 - Divisão" +
                    "\n 4 - Multiplicação" +
                    "\nOutro valor - Encerrar o programa" );
            operacao = Entrada.nextInt();
        }
    }
}
