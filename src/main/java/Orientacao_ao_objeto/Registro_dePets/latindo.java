package Orientacao_ao_objeto.Registro_dePets;

import java.util.Locale;

public class latindo {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Cachorro cachorro1 = new Cachorro();
        cachorro1.nome = "Mel";
        cachorro1.idade = 5;
        cachorro1.raca = "Poodle";

        Cachorro cachorro2 = new Cachorro();
        cachorro2.nome = "Zeus";
        cachorro2.idade = 10;
        cachorro2.raca = "Pastor Alemão";

        cachorro1.latir();
        cachorro2.latir();
    }
}
