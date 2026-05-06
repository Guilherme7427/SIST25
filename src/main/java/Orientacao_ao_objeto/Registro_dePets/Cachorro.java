package Orientacao_ao_objeto.Registro_dePets;

public class Cachorro {
    public String nome;
    public String raca;
    public int idade;

    public void latir() {
        System.out.println("Nome "+ nome + " de raça "+ raca + " de "+ idade + " anos" + " Esta latindo: Au Au Au Au!");
    }
}
