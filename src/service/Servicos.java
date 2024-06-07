/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.sql.Connection;
import util.BD;

/**
 *
 * @author pc
 */
public class Servicos {
    
    private ServicoDeLogin login = null;
    private ServicoDePessoa pessoa = null;
    private ServicoDeMedico medico = null;
    private ServicoDeFuncionario funcionario = null;
    private ServicoDePaciente paciente = null;

    public Servicos Init() {
        Servicos servicos = new Servicos();

        servicos.setServicoDeLogin(new ServicoDeLogin());
        servicos.setServicoDePessoa(new ServicoDePessoa());
        servicos.setServicoDeMedico(new ServicoDeMedico());
        servicos.setServicoDeFuncionario(new ServicoDeFuncionario());
        servicos.setServicoDePaciente(new ServicoDePaciente());

        return servicos;
    }

    public ServicoDeLogin getServicoDeLogin() {
        return login;
    }

    public void setServicoDeLogin(ServicoDeLogin login) {
        this.login = login;
    }

    public ServicoDePessoa getServicoDePessoa() {
        return pessoa;
    }

    public void setServicoDePessoa(ServicoDePessoa pessoa) {
        this.pessoa = pessoa;
    }

    public ServicoDeMedico getServicoDeMedico() {
        return medico;
    }

    public void setServicoDeMedico(ServicoDeMedico medico) {
        this.medico = medico;
    }

    public ServicoDeFuncionario getServicoDeFuncionario() {
        return funcionario;
    }

    public void setServicoDeFuncionario(ServicoDeFuncionario funcionario) {
        this.funcionario = funcionario;
    }

    public ServicoDePaciente getServicoDePaciente() {
        return paciente;
    }

    public void setServicoDePaciente(ServicoDePaciente paciente) {
        this.paciente = paciente;
    }
}
