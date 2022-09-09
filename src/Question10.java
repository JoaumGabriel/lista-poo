public class Question10 {
    public static void main(String[] args) {

        /*
         * Faça um programa que calcule a diferença entre a soma dos quadrados dos
         * primeiros 100 números
         * naturais e o quadrado da soma.
        */

        int quadSoma = 0;
        int allSoma = 0;
        int response2 = 0;

        for (int i = 1; i <= 100; i++) {
            quadSoma += i;
        }

        int response1 = (quadSoma * quadSoma);

        System.out.println("A soma de todos os numero elevado ao quadrado é: " + response1);

        for (int i = 1; i <= 100; i++) {
            allSoma = i * i;
            response2 += allSoma;
        }

        System.out.println("A soma de cada numero elevado ao seu quadrado é: " + response2);

        System.out.println("A diferença pedida é: " + (response1 - response2));
    }
}
