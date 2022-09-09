import java.util.Scanner;

public class Question15 {

    public static void main(String[] args) {

        /*
         * Leia um número positivo do usuário, então, calcule e imprima a sequência
         * Fibonacci até o primeiro
         * número superior ao número lido.
         */

        Scanner scan = new Scanner(System.in);

        int num, f1 = 0, f2 = 1, f3 = 0;

        try {
            System.out.println("Digite um número positivo:");
            num = scan.nextInt();

            if (num < 0) {
                System.out.println("Número invalido");
            } else {
                System.out.println("Sequência:");
                while (f2 <= num) {
                    f3 = f2 + f1;
                    System.out.println(" - " + f3);
                    f1 = f2;
                    f2 = f3;
                }
                System.out.println("\n");

            }
        } catch (Exception e) {
            System.out.println("Só é permitido a entrada de números!");
        }

        scan.close();

    }
}
