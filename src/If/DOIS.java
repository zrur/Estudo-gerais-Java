package If;

import java.util.Scanner;

public class DOIS {
    public static void main(String[] args) {
        Scanner entrada  = new Scanner(System.in);

        int NumeroUm,NumeroDois;

        System.out.println("Digite o primeiro número ");
        NumeroUm = entrada.nextInt();

        System.out.println("Digite o segundo número");
        NumeroDois = entrada.nextInt();

           if (NumeroUm % NumeroDois == 0||NumeroDois % NumeroUm == 0){
               System.out.println("São Multiplos");
           } else{
               System.out.println(" Não Multiplos");
           }
    }

    }


