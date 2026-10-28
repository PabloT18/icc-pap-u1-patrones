package estructurales.comlete.adapter;

/**
 * Adapter: permite usar un termómetro Fahrenheit con una aplicación que espera
 * Celsius.
 */
public final class AppAdapter {
    private AppAdapter() {
    }

    public static void main(String[] args) {
        FuenteCelsius termometro = new AdaptadorFahrenheit(new TermometroFahrenheit());
        System.out.println("Temperatura: " + termometro.leerCelsius() + " °C");
    }
}
