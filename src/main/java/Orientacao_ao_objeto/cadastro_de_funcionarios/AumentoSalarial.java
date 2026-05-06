package Orientacao_ao_objeto.cadastro_de_funcionarios;

import java.util.Locale;
import java.util.Scanner;

public class AumentoSalarial {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Funcionario calculoSalario = new Funcionario();

        System.out.println("Informe seu salario");
        calculoSalario.salarioMensal = sc.nextDouble();
        System.out.println("Seu salario com aumento de 10%");
        System.out.println(calculoSalario.aumento());
    }
}

