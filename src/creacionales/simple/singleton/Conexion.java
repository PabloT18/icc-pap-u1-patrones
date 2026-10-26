package creacionales.simple.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Singleton de conexión con inicialización diferida.
 *
 * <p>El constructor privado impide crear conexiones desde otras clases. La primera llamada
 * a {@link #getInstancia()} construye el único objeto; las llamadas posteriores reciben
 * la misma referencia. El método sincronizado evita crear más de una instancia cuando
 * varios hilos la solicitan al mismo tiempo.</p>
 *
 * <p>Este ejemplo requiere un servidor MySQL y el controlador JDBC correspondiente.</p>
 */
public class Conexion {

    private static Conexion instancia;
    private Connection conexion;

    /**
     * Solo el propio Singleton puede crear la conexión.
     */
    private Conexion() {
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
     * Devuelve la única instancia, creándola la primera vez que se solicita.
     */
    public static synchronized Conexion getInstancia() {
        if (instancia == null) {
            instancia = new Conexion();
        }
        return instancia;
    }

    /**
     * Obtiene la conexión creada por la instancia única.
     */
    public Connection getConexion() {
        return conexion;
    }
}
