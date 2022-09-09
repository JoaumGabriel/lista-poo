import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {

        /*
         * Escreva um programa que leia um número inteiro e calcule a soma de todos os
         * divisores desse
         * número, com exceção dele próprio
         */

        Scanner scan = new Scanner(System.in);

        int soma = 0;
        int num;

        try {
            System.out.println("Insira um número: ");
            num = scan.nextInt();

            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    soma += i;
                }
            }

            System.out.println("Soma de todos os divisores da variavel: " + soma);
        } catch (Exception e) {
            System.out.println("Só é permitido a entrada de números!");
        }

        scan.close();
    }
}
