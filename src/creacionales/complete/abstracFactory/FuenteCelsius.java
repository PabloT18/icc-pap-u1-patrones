package creacionales.complete.abstracFactory;

/**
 * Fuente simulada que entrega una lectura en grados Celsius.
 */
public final class FuenteCelsius implements FuenteTemperatura {
    @Override
    public double leer() {
        return 25.0;
    }
}
