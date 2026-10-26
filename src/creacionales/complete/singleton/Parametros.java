package creacionales.complete.singleton;

import java.time.Duration;

/**
 * Contrato de los parámetros que necesita el servicio de muestreo.
 */
public interface Parametros {
    Duration intervalo();

    String unidad();
}
