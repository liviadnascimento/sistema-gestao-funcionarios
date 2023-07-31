package br.com.sgf;

import br.com.sgf.model.Endereco;
import br.com.sgf.model.Funcionario;
import br.com.sgf.service.FuncionarioService;

public class Main {

    static FuncionarioService funcionarioService = new FuncionarioService();
    public static void main(String[] args) {

        // Cenário de inclusão de funcionário 1
        Endereco endereco1 = new Endereco(1, "Rua Roberto Selmi Dei", "740", "Bairro Jd. Sta. Margarida", "Cidade São Paulo", "Estado SP", "04931-010");
        Funcionario funcionario1 = new Funcionario(1, "João", "Analista", 3500.0, "11987654321", endereco1);

        incluirFuncionario(funcionario1);

        // Cenário de inclusão de funcionário 2
        Endereco endereco2 = new Endereco(2, "Rua Itaquaxiara", "11", "Bairro Pq. Sto. Amaro", "Cidade São Paulo", "Estado SP", "04931-020");
        Funcionario funcionario2 = new Funcionario(2, "Maria", "Analista", 3500.0, "11992345678", endereco2);

        incluirFuncionario(funcionario2);

        Endereco enderecoNovo = new Endereco(3, "Rua novo", "123", "Bairro X", "Cidade Y", "Estado Z", "12345-678");
        funcionario2.setNome("Maria Francisca");
        funcionario2.setEndereco(enderecoNovo);
        alterarDadosFuncionario(2,funcionario2);

        excluirFuncionario(2);

    }

    private static void incluirFuncionario(Funcionario funcionario) {

        int id = funcionarioService.adicionarFuncionario(funcionario);

        System.out.println("\nInclusão do funcionário " + funcionario.getNome() + ":");
        System.out.println(funcionarioService.obterFuncionario(id));
    }

    private static void alterarDadosFuncionario(int id, Funcionario dadosFuncionario) {
        Funcionario funcionario = funcionarioService.obterFuncionario(id);

        if (funcionario != null) {
            funcionario.setNome(dadosFuncionario.getNome() != null && !dadosFuncionario.getNome().isEmpty()
                    ? dadosFuncionario.getNome() : funcionario.getNome());

            funcionario.setDesignacao(dadosFuncionario.getDesignacao() != null && !dadosFuncionario.getDesignacao().isEmpty()
                    ? dadosFuncionario.getDesignacao() : funcionario.getDesignacao());

            funcionario.setSalario(dadosFuncionario.getSalario() != 0.0
                    ? dadosFuncionario.getSalario() : funcionario.getSalario());

            funcionario.setNumeroTelefone(dadosFuncionario.getNumeroTelefone() != null && !dadosFuncionario.getNumeroTelefone().isEmpty()
                    ? dadosFuncionario.getNumeroTelefone() : funcionario.getNumeroTelefone());

            funcionario.setEndereco(dadosFuncionario.getEndereco() != null
                    ? dadosFuncionario.getEndereco() : funcionario.getEndereco());

            System.out.println("\nDetalhes do funcionário " + funcionario.getNome() + " após a alteração dos dados:");
            System.out.println(funcionarioService.obterFuncionario(id));
        } else {
            System.out.println("Funcionário com ID " + id + " não encontrado.");
        }
    }


    private static void excluirFuncionario(int id) {

        funcionarioService.excluirFuncionario(id);

        System.out.println("\nDetalhes do funcionário após a exclusão:");
        // Deve retornar null
        System.out.println(funcionarioService.obterFuncionario(id));
    }
}