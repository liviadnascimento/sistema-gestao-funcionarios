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

    public int adicionarFuncionario(Funcionario funcionario) {
        funcionarios.put(funcionario.getId(), funcionario);
        return funcionario.getId();
    }

    public void atualizarFuncionario(int id, Funcionario novoFuncionario) {
        if (funcionarios.containsKey(id)) {
            funcionarios.put(id, novoFuncionario);
        } else {
            System.out.println("Funcionário com ID " + id + " não encontrado.");
        }
    }

    public void excluirFuncionario(int id) {
        if (funcionarios.containsKey(id)) {
            funcionarios.remove(id);
        } else {
            System.out.println("Funcionário com ID " + id + " não encontrado.");
        }
    }

    public Funcionario obterFuncionario(int id) {
        return funcionarios.get(id);
    }
}