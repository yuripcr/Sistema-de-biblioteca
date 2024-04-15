package model;

public class Funcionario extends Pessoa {
    private String funcao;
    private float salario;

    public Funcionario(String nome, String cpf, String funcao, float salario) {
        super(nome, cpf);
        this.funcao = funcao;
        this.salario = salario;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
