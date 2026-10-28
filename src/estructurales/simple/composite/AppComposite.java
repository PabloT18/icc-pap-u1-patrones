package estructurales.simple.composite;

/**
 * Composite: calcula el precio de productos y grupos con la misma operación.
 */
public final class AppComposite {
    private AppComposite() {
    }

    public static void main(String[] args) {
        GrupoMenu combo = new GrupoMenu();
        combo.agregar(new ProductoMenu("Hamburguesa", 5.00));
        combo.agregar(new ProductoMenu("Jugo", 2.00));

        System.out.println("Total del combo: $" + combo.precio());
    }
}
