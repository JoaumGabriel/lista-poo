import java.util.Scanner;

public class Question14 {
    public static void main(String[] args) {

        /*
         * Faça um programa que calcula o fatorial de um número positivo.
         */

        Scanner scan = new Scanner(System.in);

        try {
            System.out.print("Insira o número para fatorar: ");
            double x = scan.nextDouble();

            double f = x;

            while (x > 1) {

                f = f * (x - 1);
                x--;

            }
            System.out.println("Fatorial do número " + x + "é: " + f);
        } catch (Exception e) {
            System.out.println("Só é permitido a entrada de números!");
        }

        scan.close();
    }
}
