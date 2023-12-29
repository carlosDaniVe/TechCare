package clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// Esta clase genera la conexion con la base de datos
public class Conectar {

    public static Connection conectar() {
        Connection conexion = null;

        try {
            conexion = DriverManager.getConnection("jdbc:sqlite:src/main/resources/BaseDeDatos.db");
        } catch (SQLException e) {
            System.out.println("Error en la case Conectar: " + e);
        }
        return conexion;
    }
}
