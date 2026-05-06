package Orientacao_ao_objeto.Controle_de_estoque_simples;

public class Produto {
    public String nome;
    public double preco;
    public int quantidade_estoque;

    public void infoEstoque() {
        System.out.println("Nome do produto: "+nome);
        System.out.println("Preço: "+preco);
        System.out.println("Quantidade em estoque: "+quantidade_estoque);
    }
}
