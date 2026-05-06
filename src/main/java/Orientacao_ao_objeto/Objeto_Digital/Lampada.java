package Orientacao_ao_objeto.Objeto_Digital;


import java.util.Locale;
import java.util.Scanner;

public class Lampada {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Estado minhalampada = new Estado();

        System.out.println("Digite Ligar para ligar a lampada");
        System.out.println("Digite desligar para desligar a lãmpada");
        minhalampada.botao = sc.nextLine();

        minhalampada.acao();
        if (minhalampada.ligada) {
            System.out.println("Luz acesa");
        } else {
            System.out.println("Luz apagada");
        }
        sc.close();
    }
}
