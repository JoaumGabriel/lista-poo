import java.util.Scanner;

public class Question01 {
    public static void main(String[] args) {

        /*
         * Faça um programa que leia duas notas de um aluno, verifique se as notas são
         * válidas e exiba na
         * tela a média destas notas. Uma nota válida deve ser, obrigatoriamente, um
         * valor entre 0.0 e 10.0,
         * onde caso a nota não possua um valor válido, este fato deve ser informado ao
         * usuário e o
         * programa termina.
         */

        Scanner scan = new Scanner(System.in);

        float n1, n2;

        try {

            System.out.print("Insira uma nota válida: ");
            n1 = scan.nextFloat();

            System.out.print("Insira outra nota válida: ");
            n2 = scan.nextFloat();

            if (n1 < 0.0 || n1 > 10.0 || n2 < 0.0 || n2 > 10.0) {
                System.out.println("Você inseriu um valor INVÁLIDO em alguma das notas!");
            } else {
                float media = (n1 + n2) / 2;

                System.out.println("A média das notas válidas foi: " + media);
            }

        } catch (Exception e) {
            System.out.println("Só é permitido a entrada de números!");
        }

        scan.close();
    }
}