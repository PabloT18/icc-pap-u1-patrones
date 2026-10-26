package comportamiento.simple.state;

/**
 * State: el comportamiento del semáforo cambia según su estado actual.
 */
public final class AppState {
    private AppState() {
    }

    public static void main(String[] args) {
        Semaforo semaforo = new Semaforo();
        System.out.println(semaforo.color());
        semaforo.avanzar();
        System.out.println(semaforo.color());
        semaforo.avanzar();
        System.out.println(semaforo.color());
    }
}

final class Semaforo {
    private ColorSemaforo estado = ColorSemaforo.ROJO;

    String color() {
        return estado.color;
    }

    void avanzar() {
        estado = estado.siguiente;
    }
}

enum ColorSemaforo {
    ROJO("Rojo"),
    VERDE("Verde"),
    AMARILLO("Amarillo");

    final String color;
    ColorSemaforo siguiente;

    static {
        ROJO.siguiente = VERDE;
        VERDE.siguiente = AMARILLO;
        AMARILLO.siguiente = ROJO;
    }

    ColorSemaforo(String color) {
        this.color = color;
    }
}
