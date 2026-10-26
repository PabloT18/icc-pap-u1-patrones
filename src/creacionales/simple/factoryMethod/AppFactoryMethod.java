package creacionales.simple.factoryMethod;

/**
 * Demuestra cómo el creador cambia el saludo mediante su método fábrica.
 */
public final class AppFactoryMethod {
    private AppFactoryMethod() {
    }

    public static void main(String[] args) {
        GeneradorSaludo formal = new SaludoFormal();
        GeneradorSaludo informal = new SaludoInformal();

        System.out.println(formal.generar("Ana"));
        System.out.println(informal.generar("Luis"));
    }
}
