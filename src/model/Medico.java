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
public class Medico extends Pessoa {

    public Medico(Pessoa p, String especialidade, String crm) {
        super(p.getIdPessoa(), p.getNome(), p.getCpf(), p.getEndereco(), p.getEmail(), p.getTelefone(),
                p.getTelefoneSecundario(), p.getIdUsuario(), p.getSenha(), p.getPerfil());

        this.setEspecialidade(especialidade);
        this.setCrm(crm);
    }

    private String especialidade;
    private String crm;

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }
}
