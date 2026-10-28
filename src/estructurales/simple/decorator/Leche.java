package estructurales.simple.decorator;

/**
 * Decorador que envuelve una bebida y le agrega leche y su costo.
 */
public final class Leche implements Bebida {
    private final Bebida bebida;

    public Leche(Bebida bebida) {
        this.bebida = bebida;
    }

    @Override
    public String descripcion() {
        return bebida.descripcion() + " con leche";
    }

    @Override
    public double precio() {
        return bebida.precio() + 0.50;
    }
}
