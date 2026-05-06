package Orientacao_ao_objeto.Calcular_Areas;

import java.util.Locale;
import java.util.Scanner;

public class Retangulo {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Area calculo_area = new Area();
        System.out.println("Digite a altura do retangulo");
        calculo_area.altura = sc.nextDouble();
        System.out.println("Digite a base do retangulo");
        calculo_area.base = sc.nextDouble();


        System.out.println("A area do retangulo é: "+calculo_area.calcular_area());
    }
}
