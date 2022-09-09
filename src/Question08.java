public class Question08 {
    public static void main(String[] args) {

        /*
         * Chico tem 1.50 metro e cresce 2 centímetros por ano, enquanto Zé tem 1.10
         * metros e cresce 3
         * centímetros por ano. Escreva um programa que calcule e imprima quantos anos
         * serão necessários para
         * que Zé seja maior que Chico.
         */
        
        double chicoWeight = 1.50;
        double zeWeight = 1.10;

        int countYears = 0;

        do {
            zeWeight += 0.03;
            chicoWeight += 0.02;
            countYears += 1;
        } while (zeWeight < chicoWeight);

        System.out.println("De acordo com o contador... \nZé precisa de " + countYears + " anos para ser mais alto que Chico");
    }
}
