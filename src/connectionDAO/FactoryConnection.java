package connectionDAO;

import java.sql.Connection;
// conexão SQL para Java 
import java.sql.DriverManager;
// driver de conexão SQL para Java 
import java.sql.SQLException;

public class FactoryConnection {
    public static final String URL = "jdbc:mysql://localhost:3306/bicicletario";
    public static final String USER = "root";
    public static final String PASSWORD = "12345";
    

    public Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException excecao) {
            throw new RuntimeException(excecao);
        }
    }
}