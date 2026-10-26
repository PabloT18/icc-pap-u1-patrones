package creacionales.complete.prototype;

/**
 * Punto de entrada para ejecutar la demostración del patrón Prototype.
 */
public final class AppPrototype {
    private AppPrototype() {
    }

    public static void main(String[] args) {
        PerfilSensor base = new PerfilSensor("Base");
        base.agregarRegla("temperatura", 28.0);
        base.agregarRegla("humedad", 70.0);

        // Se copia el prototipo antes de personalizar el nuevo perfil.
        PerfilSensor laboratorio = base.copiar();
        laboratorio.renombrar("Laboratorio");
        laboratorio.ajustarLimite(0, 25.0);

        System.out.println(base);
        System.out.println(laboratorio);
        System.out.println("Mismo perfil: " + (base == laboratorio));
    }
}
