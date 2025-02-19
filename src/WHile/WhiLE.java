package WHile;

import java.util.Scanner;

public class WhiLE {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int alcool = 1;
        int gasolina = 2;
        int diesel = 3;
        int codigo = 0;

        System.out.println("Digite o combustivel preferido:" +
                "\n1 - Álcool" +
                "\n2 - Gasolina" +
                "\n3 - Diesel" +
                "\n4 - ENCERRAR PROGRAMA");
        while (true){
            System.out.println("Escolha uma opção desejada:");
            codigo = input.nextInt();
            if (codigo == 4){
                break;
            }
            switch (codigo){
                case 1:
                    alcool ++;
                    break;
                case 2:
                    gasolina ++;
                    break;
                case 3:
                    diesel ++;
                    break;
                default:
                    System.out.println("CODIGO INVALIDO");
            }
        }
        System.out.println("Muito Obrigado");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        input.close();
        }

}




