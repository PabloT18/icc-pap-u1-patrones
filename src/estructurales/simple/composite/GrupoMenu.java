package estructurales.simple.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Composite que agrupa productos u otros elementos y suma sus precios.
 */
public final class GrupoMenu implements ElementoMenu {
    private final List<ElementoMenu> elementos = new ArrayList<>();

    public void agregar(ElementoMenu elemento) {
        elementos.add(elemento);
    }

    @Override
    public double precio() {
        return elementos.stream().mapToDouble(ElementoMenu::precio).sum();
    }
}
