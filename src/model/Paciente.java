/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author pc
 */
public class Paciente extends Pessoa {

    public Paciente(Pessoa p) {
        super(p.getIdPessoa(), p.getNome(), p.getCpf(), p.getEndereco(), p.getEmail(), p.getTelefone(),
                p.getTelefoneSecundario());
    }
}