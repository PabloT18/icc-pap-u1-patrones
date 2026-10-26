package creacionales.complete.abstracFactory;

/**
 * Conversor de grados Fahrenheit a grados Celsius.
 */
public final class ConversorFahrenheit implements ConversorTemperatura {
    @Override
    public double aCelsius(double valor) {
        return (valor - 32) * 5.0 / 9.0;
    }
}
