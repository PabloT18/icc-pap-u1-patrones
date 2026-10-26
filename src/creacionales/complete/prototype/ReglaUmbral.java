package creacionales.complete.prototype;

/**
 * Regla mutable que define un límite para una magnitud medida.
 */
public final class ReglaUmbral {
    private final String magnitud;
    private double limite;

    public ReglaUmbral(String magnitud, double limite) {
        if (magnitud == null || magnitud.isBlank()) {
            throw new IllegalArgumentException("Magnitud obligatoria");
        }
        this.magnitud = magnitud;
        cambiarLimite(limite);
    }

    /**
     * Cambia el límite de la regla, rechazando valores no finitos.
     */
    public void cambiarLimite(double nuevo) {
        if (!Double.isFinite(nuevo)) {
            throw new IllegalArgumentException("Límite no finito");
        }
        limite = nuevo;
    }

    /**
     * Crea una regla independiente con los mismos valores.
     */
    public ReglaUmbral copiar() {
        return new ReglaUmbral(magnitud, limite);
    }

    @Override
    public String toString() {
        return magnitud + " > " + limite;
    }
}
