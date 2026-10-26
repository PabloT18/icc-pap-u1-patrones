package creacionales.simple.factoryMethod;

/**
 * Creador concreto cuyo método fábrica produce un saludo informal.
 */
public final class SaludoInformal extends GeneradorSaludo {
    @Override
    protected String crearSaludo() {
        return "¡Hola,";
    }
}
