/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.sql.Connection;
import model.Pessoa;

/**
 *
 * @author pc
 */
public class ServicoDePessoa extends ServicoBase {

    public Integer Cadastrar(Pessoa p) {
        // TODO validar

        // TODO salvar no banco
        // try {
        //     String query = "";
        //     PreparedStatement ps = this.getConn().prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
        //     int affectedRows = ps.executeUpdate();
        //     if (affectedRows == 0) {
        //         return 0;
        //     }
        //     ResultSet generatedKeys = ps.getGeneratedKeys();
        //     if (generatedKeys.next()) {
        //         Integer idPessoa = generatedKeys.getInt(1);
        //         p.setIdPessoa(idPessoa);
        //     }
        // } catch (SQLException sql) {
        //     return 0;
        // }
        // return p.getIdPessoa();
        return 0;
    }
}
