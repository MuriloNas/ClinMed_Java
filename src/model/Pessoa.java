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
public class Pessoa extends Usuario {

    public Pessoa(Integer idPessoa, String nome, String cpf, String endereco, String email, String telefone,
            String telefoneSecundario, Integer idUsuario, String senha, String perfil) {
        super(idUsuario, senha, perfil);
        this.setNome(nome);
        this.setCpf(cpf);
        this.setEndereco(endereco);
        this.setEmail(email);
        this.setTelefone(telefone);
        this.setTelefoneSecundario(telefoneSecundario);
    }

    public Pessoa(Integer idPessoa, String nome, String cpf, String endereco, String email, String telefone,
            String telefoneSecundario) {
        this.setNome(nome);
        this.setCpf(cpf);
        this.setEndereco(endereco);
        this.setEmail(email);
        this.setTelefone(telefone);
        this.setTelefoneSecundario(telefoneSecundario);
    }

    private Integer idPessoa;
    private String nome;
    private String cpf;
    private String endereco;
    private String email;
    private String telefone;
    private String telefoneSecundario;

    public Integer getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(Integer idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTelefoneSecundario() {
        return telefoneSecundario;
    }

    public void setTelefoneSecundario(String telefoneSecundario) {
        this.telefoneSecundario = telefoneSecundario;
    }
}
