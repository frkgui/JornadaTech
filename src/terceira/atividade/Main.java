package terceira.atividade;
//Escreva um programa Java que receba uma temperatura em graus Celsius e, em seguida,
// converta essa temperatura em graus Fahrenheit e Kelvin e imprima o resultado

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double temperaturaGraus,temperaturaFahrenheit,temperaturaKelvin;

        System.out.print("Digite uma temperatura em graus Celsius: ");
        temperaturaGraus = input.nextInt();

        temperaturaFahrenheit =  (temperaturaGraus * 1.8) + 32;
        System.out.println("Temperatura em Fahrenheit -> " + temperaturaFahrenheit);

        temperaturaKelvin = temperaturaGraus + 273;
        System.out.println("Temperatura em Kelvin -> " + temperaturaKelvin);



    }
}
