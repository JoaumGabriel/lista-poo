import java.util.Scanner;

public class Question04 {
    public static void main(String[] args) {

        /*
         * Faça um programa que mostre ao usuário um menu com 4 opções de operações
         * matemáticas (as
         * básicas, por exemplo). O usuário escolhe uma das opções e o seu programa
         * então pede dois
         * valores numéricos e realiza a operação, mostrando o resultado e saindo.
         */

        Scanner scan = new Scanner(System.in);

        String userChoice;
        int control = 0;

        try {

            while (control != 1) {
                System.out.println("Escolha uma das 4 operações abaixo:");
                System.out.println("");
                System.out.println("1 - Adição");
                System.out.println("2 - Subtração");
                System.out.println("3 - Multiplicação");
                System.out.println("4 - Divisão");
                System.out.println("");
                System.out.println("5 - Sair da aplicação");

                System.out.println("");
                System.out.print("Digite aqui: ");
                userChoice = scan.nextLine();

                switch (Integer.parseInt(userChoice)) {
                    case 1:
                        // soma
                        System.out.println("[ ADIÇÃO ]");

                        System.out.println("");

                        System.out.print("Digite um número: ");
                        String n1 = scan.nextLine();

                        System.out.print("Digite outro número: ");
                        String n2 = scan.nextLine();

                        try {
                            float n1Convert = Float.parseFloat(n1);
                            float n2Convert = Float.parseFloat(n2);

                            System.out.println("Resultado da soma: " + (n1Convert + n2Convert));

                            System.out.println("");
                        } catch (NumberFormatException e) {
                            System.out.println("Você inseriu um valor de forma incorreta!");

                            System.out.println("");
                        }

                        break;
                    case 2:
                        // subtração
                        System.out.println("[ SUBTRAÇÃO ]");

                        System.out.println("");

                        System.out.print("Digite um número: ");
                        String sub1 = scan.nextLine();

                        System.out.print("Digite outro número: ");
                        String sub2 = scan.nextLine();

                        try {
                            float sub1Convert = Float.parseFloat(sub1);
                            float sub2Convert = Float.parseFloat(sub2);

                            System.out.println("Resultado da subtração: " + (sub1Convert - sub2Convert));

                            System.out.println("");
                        } catch (NumberFormatException e) {
                            System.out.println("Você inseriu um valor de forma incorreta!");

                            System.out.println("");
                        }

                        break;
                    case 3:
                        // multiplicação
                        System.out.println("[ MULTIPLICAÇÃO ]");

                        System.out.println("");

                        System.out.print("Digite um número: ");
                        String m1 = scan.nextLine();

                        System.out.print("Digite outro número: ");
                        String m2 = scan.nextLine();

                        try {
                            float m1Convert = Float.parseFloat(m1);
                            float m2Convert = Float.parseFloat(m2);

                            System.out.println("Resultado da multiplicação: " + (m1Convert * m2Convert));

                            System.out.println("");
                        } catch (NumberFormatException e) {
                            System.out.println("Você inseriu um valor de forma incorreta!");

                            System.out.println("");
                        }

                        break;
                    case 4:
                        // divisão
                        System.out.println("[ DIVISÃO ]");

                        System.out.println("");

                        System.out.print("Digite um número: ");
                        String d1 = scan.nextLine();

                        System.out.print("Digite outro número: ");
                        String d2 = scan.nextLine();

                        try {
                            float d1Convert = Float.parseFloat(d1);
                            float d2Convert = Float.parseFloat(d2);

                            System.out.println("Resultado da divisão (aproximadamente): " + (d1Convert / d2Convert));

                            System.out.println("");
                        } catch (Exception e) {
                            System.out.println("Você inseriu um valor de forma incorreta!");

                            System.out.println("");
                        }

                        break;
                    case 5:
                        // saida
                        System.out.println("[ SAÍDA ]");
                        control = 1;

                        break;
                    default:
                        // fora do padrão

                        System.out.println("[ INVÁLIDO ] ");
                        System.out.println("");
                        System.out.println("Você inseriu um valor inválido");

                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida!");
        }

        scan.close();
    }
}
