package EstuturasDeDecisao;

import java.util.Scanner;

public class Saudaçao {

    public static void main(String[] agrs) {
        Scanner leitor = new Scanner(System.in);

        String nome;

        System.out.print("seu nome:  ");
        nome = leitor.next();

        if (nome == nome) {
            System.out.printf("ola,  "+ nome );

        } else {
            System.out.println("ola mundo.");
        }

    }

}
// incompleto......
