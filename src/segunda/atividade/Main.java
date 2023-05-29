package segunda.atividade;

import java.util.Scanner;

//Escreva um programa Java que receba dois números inteiros e,
// em seguida, imprima a soma desses dois números.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int valor1, valor2,soma;

        System.out.print("Digite o valor [1]: ");
        valor1 = input.nextInt();
        System.out.print("Digite o valor [2]:");
        valor2 = input.nextInt();

        soma = valor1 + valor2;
        System.out.println("\nSoma de ["+valor1+"] e ["+valor2+"]: " + soma);

    }
}
