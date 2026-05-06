package Orientacao_ao_objeto.O_carro_no_mundo_real;

import java.util.Scanner;

public class Carro {
    public String modelo;
    public String marca;
    public int velocidadeAtual;
    public int situacao;

    public int acelerar() {
        Scanner sc = new Scanner(System.in);
        if (situacao == 1) {
           velocidadeAtual= velocidadeAtual + 10;
            return velocidadeAtual;
        } else if (situacao == 2) {
            velocidadeAtual = velocidadeAtual - 10;
            if (velocidadeAtual > 0) {
                System.out.println("Freando!");
                return velocidadeAtual;
            } else {
                return velocidadeAtual;
            }
        }
        return velocidadeAtual;
    }
}
