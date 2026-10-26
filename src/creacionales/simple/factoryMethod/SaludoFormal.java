package creacionales.simple.factoryMethod;

/**
 * Creador concreto cuyo método fábrica produce un saludo formal.
 */
public final class SaludoFormal extends GeneradorSaludo {
    @Override
    protected String crearSaludo() {
        return "Buenos días,";
    }
}
