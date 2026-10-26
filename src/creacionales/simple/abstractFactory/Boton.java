package creacionales.simple.abstractFactory;

/**
 * Botón sencillo que muestra el estilo visual elegido por su fábrica.
 */
public final class Boton {
    private final String estilo;

    public Boton(String estilo) {
        this.estilo = estilo;
    }

    public String dibujar() {
        return "Botón " + estilo;
    }
}
