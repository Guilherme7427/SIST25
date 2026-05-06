package Orientacao_ao_objeto.Objeto_Digital;

public class Estado {
    public boolean ligada;
    public String botao;

    public void acao() {
        if (botao.equalsIgnoreCase("Ligar")) {
            ligada = true;
        } else if (botao.equalsIgnoreCase("Desligar")) {
            ligada = false;
        }
    }
}