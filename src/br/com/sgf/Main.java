package br.com.sgf;

import br.com.sgf.model.Endereco;
import br.com.sgf.model.Funcionario;

public class Main {
    public static void main(String[] args) {

        Endereco endereco1 = new Endereco(1, "Rua Roberto Selmi Dei", "740", "Bairro Jd. Sta. Margarida", "Cidade São Paulo", "Estado SP", "04931-010");
        Endereco endereco2 = new Endereco(2, "Rua Itaquaxiara", "11", "Bairro Pq. Sto. Amaro", "Cidade São Paulo", "Estado SP", "04931-020");

        Funcionario funcionario1 = new Funcionario(1, "João", "Analista", 3500.0, "111111111", endereco1);
        Funcionario funcionario2 = new Funcionario(2, "Maria", "Gerente", 5000.0, "222222222", endereco2);

        System.out.println("Detalhes do funcionário 1:");
        System.out.println(funcionario1);

        System.out.println("\nDetalhes do funcionário 2:");
        System.out.println(funcionario2);

        funcionario1.setSalario(4000.0);

        System.out.println("\nDetalhes atualizados do funcionário 1:");
        System.out.println(funcionario1);
    }
}
