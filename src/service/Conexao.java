package service;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/bibliotecapoo";
    private static final String DATABASE_USER = "root";
    private static final String DATABASE_PASSWORD = "yukavagama";

    private static Connection connection;

    public static Connection getConnection() {
        try {
             if (connection == null) {
                 connection = DriverManager.getConnection(DATABASE_URL, DATABASE_USER, DATABASE_PASSWORD);
             }
         } catch (SQLException e) {
             e.printStackTrace();
             return null;
         }
         return connection;
    }
}
