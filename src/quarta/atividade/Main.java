package quarta.atividade;

//Escreva um programa Java que calcule a área de um retângulo.
// O programa deve receber a largura e a altura do retângulo e, em seguida, imprimir a área.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int larguraRetangulo, alturaRetangulo, areaRetangulo;

        System.out.println("Caculadora - Área de um retângulo");

        System.out.print("Digite a largura do retângulo (metros): ");
        larguraRetangulo = input.nextInt();

        System.out.print("Digite a altura do retângulo (metros): ");
        alturaRetangulo = input.nextInt();

        areaRetangulo = larguraRetangulo*alturaRetangulo;

        System.out.println("A área do retângulo é de " + areaRetangulo + " metros");
    }
}
