package br.com.sgf;

import br.com.sgf.model.Funcionario;
import br.com.sgf.service.FuncionarioService;

public class Main {
    public static void main(String[] args) {

        FuncionarioService funcionarioService = new FuncionarioService();

        // Adicionar novos funcionários
        Funcionario func1 = new Funcionario(1, "João", "Analista", 3500.0, "111111111", "Rua A");
        Funcionario func2 = new Funcionario(2, "Maria", "Gerente", 5000.0, "222222222", "Rua B");

        funcionarioService.adicionarFuncionario(func1);
        funcionarioService.adicionarFuncionario(func2);

        // Obter detalhes dos funcionários existentes
        Funcionario funcObtido = funcionarioService.obterFuncionario(1);
        System.out.println("Detalhes do funcionário 1: " + funcObtido);

        // Atualizar detalhes dos funcionários existentes
        func1.setSalario(4000.0);
        funcionarioService.atualizarFuncionario(func1);

        // Excluir funcionários existentes
        funcionarioService.excluirFuncionario(2);

    }
}