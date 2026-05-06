package Orientacao_ao_objeto.cadastro_de_funcionarios;

public class Funcionario {
    public String nome;
    public double salarioMensal;

    public double aumento() {
        salarioMensal = (salarioMensal * 10) /100;
        return salarioMensal;
    }
}
