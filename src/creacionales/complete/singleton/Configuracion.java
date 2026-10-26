package creacionales.complete.singleton;

import java.time.Duration;

/**
 * Configuración única de la aplicación, implementada como Singleton con enum.
 */
public enum Configuracion implements Parametros {
    INSTANCIA;

    private final Duration intervalo = Duration.ofSeconds(30);
    private final String unidad = "°C";

    @Override
    public Duration intervalo() {
        return intervalo;
    }

    @Override
    public String unidad() {
        return unidad;
    }
}
