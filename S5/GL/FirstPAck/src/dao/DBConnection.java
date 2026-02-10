package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/gestion_employe";
    private static final String USER = "root";
    private static final String PASSWORD = "admin";

    private static Connection connection;

    private DBConnection() { }

    public static Connection getConnection() {
        if (connection == null) {
            try {
                connection = DriverManager.getConnection(URL, USER, PASSWORD);
                System.out.println("Connexion réussie à MySQL !");
            } catch (SQLException e) {
                System.out.println("Erreur de connexion : " + e.getMessage());
            }
        }
        return connection;
    }
}
