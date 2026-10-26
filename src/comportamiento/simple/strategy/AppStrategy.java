package comportamiento.simple.strategy;

import java.util.function.Function;

/**
 * Strategy: permite elegir la fórmula de descuento sin cambiar el cálculo cliente.
 */
public final class AppStrategy {
    private AppStrategy() {
    }

    public static void main(String[] args) {
        Function<Double, Double> descuentoSocio = precio -> precio * 0.90;
        Function<Double, Double> descuentoTemporada = precio -> precio * 0.80;

        System.out.println("Socio: $" + calcularTotal(100, descuentoSocio));
        System.out.println("Temporada: $" + calcularTotal(100, descuentoTemporada));
    }

    private static double calcularTotal(double precio, Function<Double, Double> estrategia) {
        return estrategia.apply(precio);
    }
}
