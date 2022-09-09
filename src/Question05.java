import java.util.Scanner;

public class Question05 {
    public static void main(String[] args) {
        
        /*
         * Leia a idade e o tempo de serviço de um trabalhador e escreva se ele pode ou
         * não se aposentar. As
         * condições para aposentadoria são:
         * ○ Ter pelo menos 65 anos;
         * ○ Ou ter trabalhado pelo menos 30 anos;
         * ○ Ou ter pelo menos 60 anos e trabalhado pelo menos 25 anos.
         */

        int year, workTime;

        Scanner scan = new Scanner(System.in);

        try {
            System.out.print("Olá trabalhador!\n\nDigite a sua idade: ");
            year = scan.nextInt();

            System.out.print("Agora insira o tempo de trabalho (anos): ");
            workTime = scan.nextInt();

            if (year >= 65) {
                System.out.println("STATUS: Pode se aposentar pela idade!");
            } else if (workTime >= 30) {
                System.out.println("STATUS: Pode se aposentar pelo tempo de trabalho!");
            } else if (year >= 60 && workTime >= 25) {
                System.out.println("STATUS: Pode se aposentar pela sua idade e pelo seu tempo de trabalho");
            } else {
                System.out.println(
                        "STATUS: Você não pode se aposentar atualmente, pois não cumpre nenhum dos requisitos!");
            }
        } catch (Exception e) {
            System.out.println("Entrada inválida!");
        }

        scan.close();

    }
}
