package estructurales.simple.adapter;

/**
 * Adapter: permite usar un termómetro Fahrenheit con una aplicación que espera Celsius.
 */
public final class AppAdapter {
    private AppAdapter() {
    }

    public static void main(String[] args) {
        FuenteCelsius termometro = new AdaptadorFahrenheit(new TermometroFahrenheit());
        System.out.println("Temperatura: " + termometro.leerCelsius() + " °C");
    }
}

interface FuenteCelsius {
    double leerCelsius();
}

final class TermometroFahrenheit {
    double leerFahrenheit() {
        return 77.0;
    }
}

final class AdaptadorFahrenheit implements FuenteCelsius {
    private final TermometroFahrenheit termometro;

    AdaptadorFahrenheit(TermometroFahrenheit termometro) {
        this.termometro = termometro;
    }

    @Override
    public double leerCelsius() {
        return (termometro.leerFahrenheit() - 32) * 5.0 / 9.0;
    }
}
