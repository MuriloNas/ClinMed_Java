/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.sql.Connection;
import java.sql.SQLException;
import util.BD;

/**
 *
 * @author pc
 */
public class ServicoBase {

    private Connection conn = null;

    public Connection getConn() {
        if (conn == null) {
            conn = BD.conectar();
        }

        return conn;
    }

    public void closeConn() {
        if (conn == null) {
            try {
                conn.close();
            } catch (SQLException e) {
                System.err.println("service.ServicoBase.closeConn()" + e.getMessage());
            }
        }
    }
}
