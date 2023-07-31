package br.com.sgf.repository;

import br.com.sgf.model.Funcionario;

/***
 * Para aplicar o OCP, podemos criar uma interface para a classe FuncionarioService e,
 * se necessário, criar implementações adicionais para diferentes tipos de armazenamento
 * (por exemplo, banco de dados, arquivo, etc.).
 */
public interface IFuncionarioService {

    int adicionarFuncionario(Funcionario funcionario);

    Funcionario obterFuncionario(int id);

    void atualizarFuncionario(int id, Funcionario novoFuncionario);

    void excluirFuncionario(int id);
}