package exercicios.exercicio04;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean isIdadeValida = false;

        while (!isIdadeValida) {
            System.out.println("Informe sua idade");
            Scanner scanner = new Scanner(System.in);
            int idade = scanner.nextInt();
            try {
                // aqui for lancado a excecao, vai quebrar direto pro catch
                if (idade <= 0 || idade > 100 ) {
                    // throw new IllegalArgumentException("Idade invalida");
                    throw new IdadeInvalidaException("Vc informou uma idade invalida");  // vai lancar a excecao IdadeInvalidaEXception
                }
                System.out.println("Olá, você tem " + idade +" anos de idade!");
                isIdadeValida = true;
            } catch (IdadeInvalidaException e) {
                System.out.println( e.getMessage() );
                isIdadeValida = false;
            }
        }

    }

}
