/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.sql.Connection;
import model.Funcionario;

/**
 *
 * @author pc
 */
public class ServicoDeFuncionario extends ServicoDePessoa {

    public boolean Cadastrar(Funcionario f) {
        Integer idPessoaInserida = super.Cadastrar(f);
        
        f.setIdPessoa(idPessoaInserida);

        //TODO validar medico

        //TODO inserir na tabela médico

        // sucesso
        return true;
    }
}
