package creacionales.complete.abstracFactory;

/**
 * Fábrica concreta para crear equipos compatibles con temperaturas Celsius.
 */
public final class EquipoCelsius implements FabricaEquipo {
    @Override
    public FuenteTemperatura crearFuente() {
        return new FuenteCelsius();
    }

    @Override
    public ConversorTemperatura crearConversor() {
        return new ConversorCelsius();
    }
}
