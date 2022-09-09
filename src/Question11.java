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

        List<Integer> testList = new ArrayList<Integer>();

        int year = 1;

        while (year != 0) {
            System.out.println("Insira a idade da pessoa do grupo:");
            year = scan.nextInt();
            if (year != 0) {
                testList.add(year);
            } else {
                System.out.println("Parando programa");
            }
        }

        System.out.println("Lista de idades inseridas: " + testList);

        int tamanho = testList.size();
        int teste = 0;

        for (int x : testList) {
            teste += x;
        }

        float media = (float) teste / tamanho;
        System.out.println(media);
        scan.close();
    }
}
