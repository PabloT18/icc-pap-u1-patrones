package creacionales.complete.abstracFactory;

import java.util.Locale;

/**
 * Punto de entrada para ejecutar la demostración de Abstract Factory.
 */
public final class AppAbatracfactory {
    private AppAbatracfactory() {
    }

    public static void main(String[] args) {
        Estacion local = new Estacion(new EquipoCelsius());
        Estacion importada = new Estacion(new EquipoFahrenheit());

        System.out.printf(Locale.ROOT, "Equipo Celsius: %.1f °C%n", local.medirCelsius());
        System.out.printf(Locale.ROOT, "Equipo Fahrenheit: %.1f °C%n", importada.medirCelsius());
    }
}
