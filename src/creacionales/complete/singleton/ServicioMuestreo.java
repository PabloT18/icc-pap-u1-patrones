package creacionales.complete.singleton;

import java.util.Objects;

/**
 * Servicio que recibe explícitamente los parámetros que utiliza.
 */
public final class ServicioMuestreo {
    private final Parametros parametros;

    public ServicioMuestreo(Parametros parametros) {
        this.parametros = Objects.requireNonNull(parametros);
    }

    /**
     * Describe la frecuencia y la unidad configuradas para un sensor.
     */
    public String describir(String sensor) {
        return sensor + ": cada " + parametros.intervalo().toSeconds()
                + " s, unidad " + parametros.unidad();
    }
}
