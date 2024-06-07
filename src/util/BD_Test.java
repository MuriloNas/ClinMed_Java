/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author pc
 */
public class BD_Test {

    public static void main(String args[]) {
        try {
            System.out.println("util.BD_Test.main()");
            Connection conexao = BD.conectar();
        
            InserirFuncionario (conexao);
      
            
            
            PesquisarFuncionarios(conexao);
        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    private static void InserirFuncionario(Connection conexao) throws SQLException {
        String query ="INSERT INTO funcionario("
                
                + "nome,"
                + "cpf,"
                + "cargo,"
                + "email,"
                + "endereco,"
                + "telefone,"
                + "senha)"
                + "VALUES(?,?,?,?,?,?,?)";
        
        PreparedStatement preparedStmt = conexao.prepareStatement(query);
        preparedStmt.setString (1, "Barney");
        preparedStmt.setString (2, "000.000.000-07");
        preparedStmt.setString (3, "enfermeiro");
        preparedStmt.setString (4, "barney@.com");
        preparedStmt.setString (5, "rua x");
        preparedStmt.setString (6, "1111-1111");
        preparedStmt.setString (7, "456789");
        
        
        preparedStmt.execute();
    }

    private static void PesquisarFuncionarios(Connection conexao) throws SQLException {
        String query = "select * from funcionario";
        Statement st = conexao.createStatement();
        ResultSet rs = st.executeQuery(query);
        
        while (rs.next()) {
            int idFuncionario = rs.getInt("idFuncionario");
            String nome = rs.getString("nome");
            String cpf = rs.getString("cpf");
            String cargo = rs.getString("cargo");
            String email = rs.getString("email");
            String endereco = rs.getString("endereco");
            String telefone = rs.getString("telefone");
            String senha = rs.getString("senha");
            // print the results
            System.out.format("%s, %s, %s, %s, %s, %s, %s, %s\n", idFuncionario, nome, cpf, cargo, email, endereco, telefone, senha);
        }
        st.close();
    }

}
