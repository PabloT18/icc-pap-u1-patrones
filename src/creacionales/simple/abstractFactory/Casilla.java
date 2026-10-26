package creacionales.simple.abstractFactory;

/**
 * Casilla de selección sencilla perteneciente a un estilo visual.
 */
public final class Casilla {
    private final String estilo;

    public Casilla(String estilo) {
        this.estilo = estilo;
    }

    public String dibujar() {
        return "Casilla " + estilo;
    }
}
