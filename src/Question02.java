import java.util.Scanner;

public class Question02 {
    public static void main(String[] args) {

        /*
         * Escreva um programa que leia um número inteiro de três algarismos maior do
         * que zero e devolva,
         * na tela, a soma de todos os seus algarismos. Por exemplo, ao número 251
         * corresponderá ao valor
         * 8 (2 + 5 + 1). Se o número lido não for maior do que zero, o programa
         * terminará com a
         * mensagem: número invalido.
         */

        Scanner scan = new Scanner(System.in);

        String numero;

        System.out.print("Digite um número de 3 algarismos: ");
        numero = scan.nextLine();

        String numeroSplit[] = numero.split("");

        int vetor[] = new int[numeroSplit.length];

        int resultado = 0;

        try {

            for (int i = 0; i < numeroSplit.length; i++) {
                vetor[i] = Integer.parseInt(numeroSplit[i]);

                resultado += vetor[i];
            }

            System.out.println("Resultado da soma dos números: " + resultado);

        } catch (NumberFormatException e) {

            System.out.println("Número inválido!");

        }

        scan.close();

    }
}
