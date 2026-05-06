package Orientacao_ao_objeto.Agenda_de_contatos;

import java.util.Scanner;

public class Agenda {
    public Contato[] contatos = new Contato[5];

    public void listarNomes() {
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<contatos.length; i++) {
            System.out.println("Digite o numero de contato");
            contatos[i] = new Contato();
            System.out.println("Cadastre o contato "+ (i+1));
            System.out.println("Digite o nome do contato:");
            contatos[i].nome = sc.nextLine();
            System.out.println("Digite o numero de telefone");
            contatos[i].telefone = sc.nextLine();
        }
        for (int i=0; i<contatos.length; i++) {
            System.out.println("Nome: "+contatos[i].nome+ " Telefone: "+contatos[i].telefone);
        }
    }
}
