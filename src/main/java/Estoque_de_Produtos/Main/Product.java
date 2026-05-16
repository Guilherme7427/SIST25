package Estoque_de_Produtos.Main;

import Estoque_de_Produtos.Entities.Controle;

import java.util.Locale;
import java.util.Scanner;

public class Product {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Controle Resultado = new Controle();

        System.out.println("Digite o nome do produto");
        Resultado.name = sc.nextLine();
        System.out.println("Digite o valor do produto");
        Resultado.price = sc.nextDouble();
        System.out.println("Digite a quantidade de produtos");
        Resultado.quantity = sc.nextInt();

        char a;

        do {
            System.out.println(
                    "1_ Adicionar"+
                            "\n2_Remover"+
                            "\n3_ Mostrar resumo"+
                            "\n4_Sair"
            );
            a = sc.next().charAt(0);

            int quantidade;
            if (a == '1') {
                System.out.println("Digite a quantidade que quer adicionar");
                quantidade= sc.nextInt();
                Resultado.addProducts(quantidade);
                System.out.println(quantidade+" produtos adicionados");
            } else if (a == '2') {
                System.out.println("Digite quanto quer remover");
                quantidade = sc.nextInt();
                Resultado.removeProducts(quantidade);
                System.out.println(quantidade+" produtos removidos");
            } else if (a == '3') {
                System.out.println(Resultado.showData());
            } else if (a == '4') {
                System.out.println("Saindo....");
            } else {
                System.out.println("Digite uma resposta valida");
            }
        }while(a != '4');


    }
}
