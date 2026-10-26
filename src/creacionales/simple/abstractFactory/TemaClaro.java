package creacionales.simple.abstractFactory;

/**
 * Fábrica concreta que crea componentes del tema claro.
 */
public final class TemaClaro implements FabricaTema {
    @Override
    public Boton crearBoton() {
        return new Boton("claro");
    }

    @Override
    public Casilla crearCasilla() {
        return new Casilla("clara");
    }
}
