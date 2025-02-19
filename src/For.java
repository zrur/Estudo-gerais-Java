import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int x;
        System.out.println("Digite o número");
        x = entrada.nextInt();

        for (int i = 1;i <=x; i++) {
            if (x % 2 != 1 ){
                System.out.println(x);

        }
            entrada.close();
    }
}
}