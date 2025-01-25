package com.example.minio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Objects;

public class Conexao {

    private static Conexao instance;

    private static Connection conn;

    private Conexao() throws SQLException {
        String url = "jdbc:postgresql://autorack.proxy.rlwy.net:25763/railway?sslmode=require";
        String username = "postgres";
        String password = "JfTPXFiTovmjSHUKOrMAZJNXrPlxUsfn";
        conn = DriverManager.getConnection(url, username, password);
    }

    public static Conexao getConnection() throws SQLException {
        if (Objects.isNull(instance)) {
            instance = new Conexao();
        }
        return instance;
    }

    public Connection connection() {
        return conn;
    }
}
