package Orientacao_ao_objeto.Termometro_Inteligente;

import java.util.Locale;
import java.util.Scanner;

public class Conversao {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Termometro conversaoCelsius = new Termometro();

        System.out.println("Digite quantos graus Celsius quer converter para Fahrenheit e Kelvin");
        conversaoCelsius.celsius = sc.nextDouble();
        System.out.printf("Fahrenheit: %.2f%n", conversaoCelsius.fahrenheit());
        System.out.printf("Kelvin: %.2f%n", conversaoCelsius.Kelvin());
    }
}
