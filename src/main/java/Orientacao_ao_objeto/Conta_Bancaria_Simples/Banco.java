package Orientacao_ao_objeto.Conta_Bancaria_Simples;

import java.util.Scanner;

public class Banco {
    public double saldo;
    public String titular;
    public int opcao;
    public double quantDepositar;
    public double quantSacar;

    public double transferencia() {
        Scanner sc = new Scanner(System.in);
        if (opcao == 1) {
            System.out.println("Quanto você quer depositar?");
            quantDepositar = sc.nextDouble();
            saldo = saldo + quantDepositar;
            return saldo;
        } else if (opcao == 2) {
            System.out.println("Quanto você quer sacar?");
            quantSacar = sc.nextDouble();
                if (quantSacar > saldo) {
                    System.out.println("Você não tem esse dinheiro");
            } else {
            saldo = saldo - quantSacar;
                    System.out.println("Você sacou: ");
                    return saldo;
                }
        }
        return saldo;
    }
}