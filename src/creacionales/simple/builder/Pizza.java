package creacionales.simple.builder;

import java.util.List;

/**
 * Producto inmutable que representa una pizza ya configurada.
 */
public final class Pizza {
    private final String tamano;
    private final List<String> ingredientes;

    Pizza(String tamano, List<String> ingredientes) {
        this.tamano = tamano;
        this.ingredientes = List.copyOf(ingredientes);
    }

    public String descripcion() {
        return "Pizza " + tamano + " con " + ingredientes;
    }
}
