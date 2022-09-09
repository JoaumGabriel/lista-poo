public class Question13 {
    public static void main(String[] args) {

        /*
         * Faça um programa que some todos os números naturais abaixo de 1000 que são
         * múltiplos de 3 ou 5.
         */
        int soma = 0;

        for (int i = 0; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                soma += i;
            }
        }

        System.out.println("Resultado: " + soma);
    }
}
