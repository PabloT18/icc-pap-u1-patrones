package creacionales.simple.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Acumula las opciones de una pizza y crea el producto cuando se solicita.
 */
public final class PizzaBuilder {
    private String tamano = "mediana";
    private final List<String> ingredientes = new ArrayList<>();

    public PizzaBuilder tamano(String tamano) {
        this.tamano = tamano;
        return this;
    }

    public PizzaBuilder agregar(String ingrediente) {
        ingredientes.add(ingrediente);
        return this;
    }

    public Pizza construir() {
        return new Pizza(tamano, ingredientes);
    }
}
