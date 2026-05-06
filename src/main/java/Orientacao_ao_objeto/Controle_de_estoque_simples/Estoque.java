package Orientacao_ao_objeto.Controle_de_estoque_simples;

import java.util.Locale;

public class Estoque {
    static void main() {
        Locale.setDefault(Locale.US);

        Produto estoque_produto = new Produto();
        estoque_produto.nome = "Detergente";
        estoque_produto.preco = 5.90;
        estoque_produto.quantidade_estoque = 40;

        estoque_produto.infoEstoque();
    }
}
