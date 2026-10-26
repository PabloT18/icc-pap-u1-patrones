package estructurales.simple.composite;

import java.util.ArrayList;
import java.util.List;

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

interface ElementoMenu {
    double precio();
}

final class ProductoMenu implements ElementoMenu {
    private final String nombre;
    private final double precio;

    ProductoMenu(String nombre, double precio) {
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

final class GrupoMenu implements ElementoMenu {
    private final List<ElementoMenu> elementos = new ArrayList<>();

    void agregar(ElementoMenu elemento) {
        elementos.add(elemento);
    }

    @Override
    public double precio() {
        return elementos.stream().mapToDouble(ElementoMenu::precio).sum();
    }
}
