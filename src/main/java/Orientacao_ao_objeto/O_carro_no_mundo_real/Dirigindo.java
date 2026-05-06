package Orientacao_ao_objeto.O_carro_no_mundo_real;

import java.util.Locale;
import java.util.Scanner;

public class Dirigindo {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Carro pedais = new Carro();

        System.out.println("Digite o modelo do veiculo");
        pedais.modelo = sc.nextLine();
        System.out.println("Digite a marca do veiculo");
        pedais.marca = sc.nextLine();
        System.out.println("Digite a velocidade que você esta pilotando");
        pedais.velocidadeAtual = sc.nextInt();

        System.out.println("Digite (1) para acelerar");
        System.out.println("Digite (2) para frear");
        pedais.situacao = sc.nextInt();
        System.out.println("velocidade do "+pedais.modelo+ " " +pedais.marca+ " esta " +pedais.acelerar()+ " KM/H");
    }
}
