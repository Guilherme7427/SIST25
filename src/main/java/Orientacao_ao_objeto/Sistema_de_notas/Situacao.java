package Orientacao_ao_objeto.Sistema_de_notas;

import java.util.Locale;
import java.util.Scanner;

public class Situacao {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Aluno calculoNotas = new Aluno();

        System.out.println("Nome do aluno");
        calculoNotas.nome = sc.nextLine();

        String resultadoFinal = calculoNotas.verificarSituacao();
        System.out.println("O aluno "+calculoNotas.nome+ " foi "+resultadoFinal);
    }
}
