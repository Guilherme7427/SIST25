package Orientacao_ao_objeto.Termometro_Inteligente;

public class Termometro {
    public double celsius;
    public int opcao;

    public double fahrenheit() {
        celsius = (celsius * 5/9) +32;
        return celsius;
    }
    public double Kelvin() {
        celsius = celsius + 273.15;
        return celsius;
    }
}
