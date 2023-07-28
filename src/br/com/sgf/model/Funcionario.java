package br.com.sgf.model;

public class Funcionario {

    private int id;
    private String nome;
    private String designacao;
    private double salario;
    private String numeroTelefone;
    private Endereco endereco;

    public Funcionario(int id, String nome, String designacao, double salario, String numeroTelefone, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.designacao = designacao;
        this.salario = salario;
        this.numeroTelefone = numeroTelefone;
        this.endereco = endereco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDesignacao() {
        return designacao;
    }

    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", designacao='" + designacao + '\'' +
                ", salario=" + salario +
                ", numeroTelefone='" + numeroTelefone + '\'' +
                ", endereco=" + endereco +
                '}';
    }
}