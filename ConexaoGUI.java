package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoGUI {
    private static final String URL = "localhost";
    private static final String USUARIO = "root";
    private static final String SENHA = "senai";

    private static Connection conexao;

    private ConexaoGUI() {}

    public static Connection getConexao() throws SQLException {
        if (conexao == null) {
            conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
        }
        
        return conexao;
    }
}