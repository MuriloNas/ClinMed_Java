/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import model.Medico;

/**
 *
 * @author pc
 */
public class ServicoDeMedico extends ServicoDePessoa {
    
    public boolean Cadastrar(Medico m) {
        Integer idPessoaInserida = super.Cadastrar(m);

        m.setIdPessoa(idPessoaInserida);

        // TODO validar medico

        // TODO inserir na tabela médico

        // sucesso
        return true;
    }

    public List<Medico> Pesquisar() {
        List<Medico> medicos = new ArrayList<Medico>();

        

        return medicos;
    }
}
