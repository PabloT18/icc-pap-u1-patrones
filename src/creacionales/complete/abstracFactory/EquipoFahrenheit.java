package creacionales.complete.abstracFactory;

/**
 * Fábrica concreta para crear equipos compatibles con temperaturas Fahrenheit.
 */
public final class EquipoFahrenheit implements FabricaEquipo {
    @Override
    public FuenteTemperatura crearFuente() {
        return new FuenteFahrenheit();
    }

    @Override
    public ConversorTemperatura crearConversor() {
        return new ConversorFahrenheit();
    }
}
