package creacionales.simple.abstractFactory;

/**
 * Fábrica concreta que crea componentes del tema oscuro.
 */
public final class TemaOscuro implements FabricaTema {
    @Override
    public Boton crearBoton() {
        return new Boton("oscuro");
    }

    @Override
    public Casilla crearCasilla() {
        return new Casilla("oscura");
    }
}
