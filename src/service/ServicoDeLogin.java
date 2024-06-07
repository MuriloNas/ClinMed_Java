/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import model.Usuario;

/**
 *
 * @author pc
 */
public class ServicoDeLogin extends ServicoBase {

    public boolean Entrar(Usuario u) {

        return true;
        
//        try {
//            String query
//                    = "SELECT * FROM usuario "
//                    + "WHERE "
//                    + "idUsuario = ? AND "
//                    + "senha = ? AND "
//                    + "perfil = ?";
//
//            PreparedStatement ps = getConn().prepareStatement(query);
//
//            ps.setInt(1, u.getIdUsuario());
//            ps.setString(2, u.getSenha());
//            ps.setString(3, u.getPerfil());
//
//            ResultSet rs = ps.executeQuery();
//            if (rs.next()) {
//                return true;
//            }
//        } catch (SQLException sqlE) {
//            System.err.println("service.ServicoDeLogin.Entrar(). " + sqlE.getMessage());
//        }
//
//        return false;
    }
}
