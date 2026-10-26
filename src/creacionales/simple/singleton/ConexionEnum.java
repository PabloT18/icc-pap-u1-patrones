package creacionales.simple.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Singleton de conexión implementado con un enum de una sola constante.
 *
 * <p>La JVM garantiza una única constante {@link #INSTANCIA}. Al acceder a ella por
 * primera vez, Java construye el enum e inicializa su conexión; las referencias
 * posteriores apuntan al mismo objeto.</p>
 *
 * <p>Este ejemplo requiere un servidor MySQL y el controlador JDBC correspondiente.</p>
 */
public enum ConexionEnum {

    INSTANCIA;

    private Connection conexion;

    /**
     * El constructor del enum se ejecuta una sola vez al inicializar la constante.
     */
    ConexionEnum() {
        try {
            conexion = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/mi_base",
                    "root",
                    "1234");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Obtiene la conexión asociada a la única constante del enum.
     */
    public Connection getConexion() {
        return conexion;
    }
}
