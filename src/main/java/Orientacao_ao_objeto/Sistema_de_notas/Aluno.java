package Orientacao_ao_objeto.Sistema_de_notas;

import java.util.Scanner;

public class Aluno {
    public String nome;
    public double[] notas = new double[3];

    public double calcularmedia() {
        Scanner sc = new Scanner(System.in);
        double soma = 0;
        for (int i=0; i < notas.length; i++) {
            System.out.println("Digite sua nota");
            notas[i] = sc.nextDouble();
            soma += notas[i];
        }
        return soma/ notas.length;
    }
    public String verificarSituacao() {
        double media = calcularmedia();
        if (media >= 7) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }
}
