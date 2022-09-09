import java.util.Scanner;

public class Question14 {
    public static void main(String[] args) {

        /*
         * Faça um programa que calcula o fatorial de um número positivo.
         */

        Scanner scan = new Scanner(System.in);
        double x = 6;
        double f = x;

        while (x > 1) {
            f = f * (x - 1);
            x--;

        }
        System.out.println(f);

        scan.close();
    }
}
