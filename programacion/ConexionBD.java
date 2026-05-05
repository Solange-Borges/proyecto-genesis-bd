// Clase encargada de gestionar la conexión a la base de datos MySQL mediante JDBC

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionBD {

    public static Connection conectar() {
        try {
            return DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/proyecto_genesis",
                    "root",
                    "147258"
            );
        } catch (Exception e) {
            System.out.println("Error conexión: " + e.getMessage());
            return null;
        }
    }
}
