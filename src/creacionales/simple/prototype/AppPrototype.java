package creacionales.simple.prototype;

/**
 * Demuestra que se puede personalizar una copia sin modificar la plantilla.
 */
public final class AppPrototype {
    private AppPrototype() {
    }

    public static void main(String[] args) {
        PlantillaCorreo base = new PlantillaCorreo("Aviso", "Su pedido está listo");
        PlantillaCorreo copia = base.copiar();
        copia.cambiarAsunto("Pedido enviado");

        System.out.println("Original: " + base.contenido());
        System.out.println("Copia: " + copia.contenido());
    }
}
