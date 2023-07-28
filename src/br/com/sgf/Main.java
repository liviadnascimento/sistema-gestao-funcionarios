package br.com.sgf;

import br.com.sgf.model.Endereco;
import br.com.sgf.model.Funcionario;

public class Main {
    public static void main(String[] args) {
        // Criar objetos Endereco
        Endereco endereco1 = new Endereco(1, "Rua A", "123", "Bairro X", "Cidade Y", "Estado Z", "12345-678");
        Endereco endereco2 = new Endereco(2, "Rua B", "456", "Bairro Y", "Cidade Z", "Estado X", "98765-432");

        // Criar objetos Funcionario com os endereços associados
        Funcionario funcionario1 = new Funcionario(1, "João", "Analista", 3500.0, "111111111", endereco1);
        Funcionario funcionario2 = new Funcionario(2, "Maria", "Gerente", 5000.0, "222222222", endereco2);

        // Imprimir detalhes dos funcionários
        System.out.println("Detalhes do funcionário 1:");
        System.out.println(funcionario1);

        System.out.println("\nDetalhes do funcionário 2:");
        System.out.println(funcionario2);

        // Atualizar salário do funcionário 1
        funcionario1.setSalario(4000.0);

        // Imprimir detalhes atualizados do funcionário 1
        System.out.println("\nDetalhes atualizados do funcionário 1:");
        System.out.println(funcionario1);
    }
}
