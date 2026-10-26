package creacionales.complete.builder;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Construye gradualmente un PlanMuestreo y valida sus invariantes antes de crearlo.
 */
public final class PlanMuestreoBuilder {
    private final String nombre;
    private Duration intervalo = Duration.ofSeconds(30);
    private final List<String> sensores = new ArrayList<>();

    public PlanMuestreoBuilder(String nombre) {
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("Nombre obligatorio");
        }
        this.nombre = nombre;
    }

    /**
     * Configura el intervalo entre mediciones.
     */
    public PlanMuestreoBuilder cada(Duration intervalo) {
        this.intervalo = Objects.requireNonNull(intervalo);
        return this;
    }

    /**
     * Agrega un sensor al plan, rechazando identificadores vacíos o repetidos.
     */
    public PlanMuestreoBuilder agregarSensor(String id) {
        if (id == null || id.isBlank()) {
            throw new IllegalArgumentException("Identificador obligatorio");
        }
        if (sensores.contains(id)) {
            throw new IllegalArgumentException("Sensor duplicado: " + id);
        }
        sensores.add(id);
        return this;
    }

    /**
     * Valida la configuración y crea un producto inmutable.
     */
    public PlanMuestreo construir() {
        if (intervalo.compareTo(Duration.ofSeconds(1)) < 0) {
            throw new IllegalArgumentException("Intervalo mínimo: 1 segundo");
        }
        if (sensores.isEmpty()) {
            throw new IllegalArgumentException("Agrega al menos un sensor");
        }
        return new PlanMuestreo(nombre, intervalo, sensores);
    }
}
