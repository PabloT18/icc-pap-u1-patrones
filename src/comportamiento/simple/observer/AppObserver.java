package comportamiento.simple.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * Observer: notifica a los suscriptores cuando cambia el precio observado.
 */
public final class AppObserver {
    private AppObserver() {
    }

    public static void main(String[] args) {
        Producto producto = new Producto();
        producto.suscribir(precio -> System.out.println("Correo: nuevo precio $" + precio));
        producto.suscribir(precio -> System.out.println("Registro: $" + precio));

        producto.cambiarPrecio(19.99);
    }
}

final class Producto {
    private final List<Consumer<Double>> observadores = new ArrayList<>();

    void suscribir(Consumer<Double> observador) {
        observadores.add(observador);
    }

    void cambiarPrecio(double precio) {
        for (Consumer<Double> observador : observadores) {
            observador.accept(precio);
        }
    }
}
