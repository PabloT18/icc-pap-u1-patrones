package creacionales.simple.factoryMethod;

/**
 * Creador base: define el proceso y delega la creación del saludo concreto.
 */
public abstract class GeneradorSaludo {
    public final String generar(String nombre) {
        return crearSaludo() + " " + nombre;
    }

    /**
     * Método fábrica que cada tipo de saludo implementa a su manera.
     */
    protected abstract String crearSaludo();
}
