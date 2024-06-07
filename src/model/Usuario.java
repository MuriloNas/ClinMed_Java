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
public class Usuario {

    public Usuario() {
    }

    public Usuario(Integer idUsuario, String senha, String perfil) {
        this.setIdUsuario(idUsuario);
        this.setSenha(senha);
        this.setPerfil(perfil);
    }

    private Integer idUsuario;
    private String senha;
    private String perfil;

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }
    
    public boolean ehMedico() {
        return this.getPerfil() == "M";
    }
}
