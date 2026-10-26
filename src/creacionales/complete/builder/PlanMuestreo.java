package creacionales.complete.builder;

import java.time.Duration;
import java.util.List;

/**
 * Producto inmutable que contiene la configuración de un plan de muestreo.
 */
public final class PlanMuestreo {
    private final String nombre;
    private final Duration intervalo;
    private final List<String> sensores;

    PlanMuestreo(String nombre, Duration intervalo, List<String> sensores) {
        this.nombre = nombre;
        this.intervalo = intervalo;
        this.sensores = List.copyOf(sensores);
    }

    /**
     * Devuelve un resumen legible del plan y de sus sensores.
     */
    public String resumen() {
        return nombre + " | " + intervalo.toSeconds() + " s | " + sensores;
    }
}
