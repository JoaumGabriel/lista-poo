import java.util.Scanner;

public class Question07 {
    public static void main(String[] args) {

        /*
         * Faça um algoritmo que calcule o IMC de uma pessoa e mostre sua classificação
         * de acordo com a
         * tabela abaixo:
         */
        Scanner scan = new Scanner(System.in);

        String peso, altura;

        try {
            System.out.print("Informe seu peso (em Kg): ");
            peso = scan.nextLine();

            System.out.print("Informe sua altura (em metros): ");
            altura = scan.nextLine();

            float pesoConvert = Float.parseFloat(peso);
            float alturaConvert = Float.parseFloat(altura);

            float imc = pesoConvert / (alturaConvert * alturaConvert);

            if (imc < 18.5) {
                System.out.println("Você está abaixo do peso!");
                System.out.println("Média de IMC: " + imc);
            } else if (imc >= 18.6 && imc <= 24.9) {
                System.out.println("Você está saudável!");
                System.out.println("Média de IMC: " + imc);
            } else if (imc >= 25.0 && imc <= 29.9) {
                System.out.println("Você está com peso em excesso");
                System.out.println("Média de IMC: " + imc);
            } else if (imc >= 30.0 && imc <= 34.9) {
                System.out.println("Você está com obesidade grau 1");
                System.out.println("Média de IMC: " + imc);
            } else if (imc >= 35.0 && imc <= 39.9) {
                System.out.println("Você está com obesidade grau 2");
                System.out.println("Média de IMC: " + imc);
            } else if (imc >= 40) {
                System.out.println("Você está com obesidade grau 3");
                System.out.println("Média de IMC: " + imc);
            }
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida");
        }

        scan.close();

    }
}
