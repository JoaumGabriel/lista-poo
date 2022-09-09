public class Question09 {
    public static void main(String[] args) {

        /*
         * Escreva um programa que leia um número inteiro positivo n e em seguida
         * imprima n linhas do
         * chamado Triângulo de Floyd. Para n = 6, temos:
         */

        int n = 10;
        int i, j, k = 1;

        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(k + " ");
                k++;
            }
            System.out.println();
        }
    }
}