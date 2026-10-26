package creacionales.complete.abstracFactory;

import java.util.Objects;

/**
 * Cliente del patrón: usa productos de una familia sin conocer sus clases.
 */
public final class Estacion {
    private final FuenteTemperatura fuente;
    private final ConversorTemperatura conversor;

    public Estacion(FabricaEquipo fabrica) {
        Objects.requireNonNull(fabrica, "Fábrica obligatoria");
        fuente = Objects.requireNonNull(fabrica.crearFuente());
        conversor = Objects.requireNonNull(fabrica.crearConversor());
    }

    /**
     * Lee la temperatura y devuelve su valor convertido a Celsius.
     */
    public double medirCelsius() {
        double valor = conversor.aCelsius(fuente.leer());
        if (!Double.isFinite(valor)) {
            throw new IllegalStateException("Medición no finita");
        }
        return valor;
    }
}
