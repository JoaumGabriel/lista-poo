import java.util.Scanner;

public class Question09 {
    public static void main(String[] args) {

        /*
         * Escreva um programa que leia um número inteiro positivo n e em seguida
         * imprima n linhas do
         * chamado Triângulo de Floyd. Para n = 6, temos:
         */

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o número de linhas que deseja imprimir: ");

        int n;
        int i, j, k = 1;

        try {
            n = scan.nextInt();

            for (i = 1; i <= n; i++) {
                for (j = 1; j <= i; j++) {
                    System.out.print(k + " ");
                    k++;
                }
                System.out.println();
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Só é permitido a entrada de números!");
        }

        scan.close();

    }
}