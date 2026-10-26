package creacionales.simple.abstractFactory;

/**
 * Demuestra que una fábrica entrega componentes compatibles de una familia.
 */
public final class AppAbstractFactory {
    private AppAbstractFactory() {
    }

    public static void main(String[] args) {
        FabricaTema fabrica = new TemaOscuro();
        // Ambos componentes se crean con la misma fábrica, así comparten tema.
        System.out.println(fabrica.crearBoton().dibujar());
        System.out.println(fabrica.crearCasilla().dibujar());
    }
}
