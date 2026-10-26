package creacionales.complete.abstracFactory;

/**
 * Fuente simulada que entrega una lectura en grados Fahrenheit.
 */
public final class FuenteFahrenheit implements FuenteTemperatura {
    @Override
    public double leer() {
        return 77.0;
    }
}
