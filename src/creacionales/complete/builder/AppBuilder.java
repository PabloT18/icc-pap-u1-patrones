package creacionales.complete.builder;

import java.time.Duration;

/**
 * Punto de entrada para ejecutar la demostración del patrón Builder.
 */
public final class AppBuilder {
    private AppBuilder() {
    }

    public static void main(String[] args) {
        PlanMuestreoBuilder builder = new PlanMuestreoBuilder("Laboratorio")
                .cada(Duration.ofSeconds(10))
                .agregarSensor("S01");

        PlanMuestreo primero = builder.construir();
        PlanMuestreo segundo = builder.agregarSensor("S02").construir();

        // La modificación posterior del builder no afecta al producto ya creado.
        System.out.println(primero.resumen());
        System.out.println(segundo.resumen());

        try {
            new PlanMuestreoBuilder("Vacío").construir();
        } catch (IllegalArgumentException error) {
            System.out.println(error.getMessage());
        }
    }
}
