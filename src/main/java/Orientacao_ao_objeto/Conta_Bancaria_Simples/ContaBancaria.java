package Orientacao_ao_objeto.Conta_Bancaria_Simples;

import java.util.Locale;
import java.util.Scanner;

public class ContaBancaria {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Banco seubanco = new Banco();

        System.out.println("Digite o nome do titular");
        seubanco.titular = sc.nextLine();
        System.out.println("Digite seu saldo");
        seubanco.saldo = sc.nextDouble();
        System.out.println("Digite (1) para depositar");
        System.out.println("Digite (2) para sacar");
        seubanco.opcao = sc.nextInt();

        System.out.println("O seu saldo agora é: "+seubanco.transferencia());
    }
}
