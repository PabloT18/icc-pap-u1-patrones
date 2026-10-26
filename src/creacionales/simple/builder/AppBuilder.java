package creacionales.simple.builder;

/**
 * Demuestra cómo configurar un producto paso a paso con un Builder.
 */
public final class AppBuilder {
    private AppBuilder() {
    }

    public static void main(String[] args) {
        Pizza pizza = new PizzaBuilder()
                .tamano("grande")
                .agregar("queso")
                .agregar("champiñones")
                .construir();

        System.out.println(pizza.descripcion());
    }
}
