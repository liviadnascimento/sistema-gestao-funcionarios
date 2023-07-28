package br.com.sgf.service;

import br.com.sgf.model.Funcionario;
import br.com.sgf.repository.IFuncionarioService;

import java.util.HashMap;
import java.util.Map;

/***
 * FuncionarioService possui uma única responsabilidade, que é gerenciar os funcionários.
 * Portanto, o Single Responsibility Principle - SRP está sendo aplicado.
 */
public class FuncionarioService implements IFuncionarioService {

    private Map<Integer, Funcionario> funcionarios;

    public FuncionarioService() {
        funcionarios = new HashMap<>();
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.put(funcionario.getId(), funcionario);
    }

    public Funcionario obterFuncionario(int id) {
        return funcionarios.get(id);
    }

    public void atualizarFuncionario(Funcionario funcionario) {
        funcionarios.put(funcionario.getId(), funcionario);
    }

    public void excluirFuncionario(int id) {
        funcionarios.remove(id);
    }
}
