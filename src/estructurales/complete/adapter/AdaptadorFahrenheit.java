package estructurales.comlete.adapter;

/**
 * Adapter que convierte la lectura Fahrenheit para cumplir el contrato Celsius.
 */
public final class AdaptadorFahrenheit implements FuenteCelsius {
    private final TermometroFahrenheit termometro;

    public AdaptadorFahrenheit(TermometroFahrenheit termometro) {
        this.termometro = termometro;
    }

    @Override
    public double leerCelsius() {
        return (termometro.leerFahrenheit() - 32) * 5.0 / 9.0;
    }
}
