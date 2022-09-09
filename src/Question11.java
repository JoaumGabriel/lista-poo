import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {

        /*
         * Faça um programa que leia um número indeterminado de idades de indivíduos
         * (pare quando for
         * informada a idade 0) e calcule a idade média desse grupo.
         */

        Scanner scan = new Scanner(System.in);

        List<Integer> yearList = new ArrayList<Integer>();

        int year = 1;

        try {
            while (year != 0) {
                System.out.println("Insira a idade da pessoa do grupo:");
                year = scan.nextInt();
                if (year != 0) {
                    yearList.add(year);
                } else {
                    System.out.println("Parando programa");
                }
            }

            System.out.println("Lista de idades inseridas: " + yearList);

            int tamanho = yearList.size();
            int teste = 0;

            for (int x : yearList) {
                teste += x;
            }

            float media = (float) teste / tamanho;
            System.out.println("A média das idades inseridas é: " + media);

        } catch (Exception e) {
            System.out.println("Só é permitido a entrada de números!");
        }

        scan.close();
    }
}
