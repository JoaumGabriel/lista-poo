import java.util.Random;
import java.util.Scanner;

public class Question06 {
    public static void main(String[] args) {
        
        /*
         * Faça uma prova de matemática para crianças que estão aprendendo a somar
         * números inteiros
         * menores do que 100. Escolha números aleatórios entre 1 e 100, e mostre na
         * tela a pergunta: qual é
         * a soma de a + b, onde a e b são os números aleatórios. Peça a resposta. Faça
         * cinco perguntas ao
         * aluno, e mostre para ele as perguntas e as respostas corretas, além de
         * quantas vezes o aluno
         * acertou.
         */

        try {

            Random rand = new Random();
            Scanner scan = new Scanner(System.in);

            int acertos = 0;

            for (int i = 0; i < 5; i++) {

                int a = rand.nextInt(100) + 1;
                int b = rand.nextInt(100) + 1;
                String response;

                System.out.println((i + 1) + "° Pergunta:");
                System.out.println("Qual a soma de " + a + " + " + b + "?");
                System.out.print("Responda aqui: ");

                response = scan.nextLine();

                if (Integer.parseInt(response) == a + b) {
                    acertos++;
                }
                System.out.println("A resposta era " + (a + b));

                System.out.println("");
            }

            System.out.println("Quantidade de acertos: " + acertos);

            scan.close();

        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida");
        }
        
    }
}
