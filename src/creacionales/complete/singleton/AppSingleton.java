package creacionales.complete.singleton;

import java.time.Duration;

/**
 * Punto de entrada para ejecutar la demostración del patrón Singleton.
 */
public final class AppSingleton {
    private AppSingleton() {
    }

    public static void main(String[] args) {
        Configuracion primera = Configuracion.INSTANCIA;
        Configuracion segunda = Configuracion.INSTANCIA;
        System.out.println("Misma instancia: " + (primera == segunda));

        ServicioMuestreo servicio = new ServicioMuestreo(primera);
        System.out.println(servicio.describir("S01"));

        // Un sustituto de prueba permite verificar el servicio sin usar el Singleton.
        Parametros prueba = new Parametros() {
            @Override
            public Duration intervalo() {
                return Duration.ofSeconds(1);
            }

            @Override
            public String unidad() {
                return "°F";
            }
        };
        System.out.println(new ServicioMuestreo(prueba).describir("TEST"));
    }
}
