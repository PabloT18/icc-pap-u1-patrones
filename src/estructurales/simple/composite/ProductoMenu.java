package estructurales.simple.composite;

/**
 * Hoja del Composite: representa un producto individual del menú.
 */
public final class ProductoMenu implements ElementoMenu {
    private final String nombre;
    private final double precio;

    public ProductoMenu(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public double precio() {
        return precio;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
