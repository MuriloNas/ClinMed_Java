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
public class Funcionario extends Pessoa {

    public Funcionario(Pessoa pessoa, String cargo) {
        super(pessoa.getIdPessoa(), pessoa.getNome(), pessoa.getCpf(), pessoa.getEndereco(), pessoa.getEmail(), pessoa.getTelefone(),
                pessoa.getTelefoneSecundario(), pessoa.getIdUsuario(), pessoa.getSenha(), pessoa.getPerfil());

        this.setCargo(cargo);
    }

    private String cargo;

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}