package estructurales.simple.decorator;

/**
 * Componente concreto: una bebida básica de café.
 */
public final class CafeSimple implements Bebida {
    @Override
    public String descripcion() {
        return "Café";
    }

    @Override
    public double precio() {
        return 2.00;
    }
}
