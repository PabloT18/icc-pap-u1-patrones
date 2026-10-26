package creacionales.complete.abstracFactory;

/**
 * Conversor para una fuente que ya mide en grados Celsius.
 */
public final class ConversorCelsius implements ConversorTemperatura {
    @Override
    public double aCelsius(double valor) {
        return valor;
    }
}
