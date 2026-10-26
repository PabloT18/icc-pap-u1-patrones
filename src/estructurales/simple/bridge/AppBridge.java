package estructurales.simple.bridge;

/**
 * Bridge: el control remoto puede operar distintos dispositivos sin acoplarse a uno.
 */
public final class AppBridge {
    private AppBridge() {
    }

    public static void main(String[] args) {
        ControlRemoto control = new ControlRemoto(new Televisor());
        control.encender();
        control.apagar();
    }
}

interface Dispositivo {
    void encender();

    void apagar();
}

final class Televisor implements Dispositivo {
    @Override
    public void encender() {
        System.out.println("Televisor encendido");
    }

    @Override
    public void apagar() {
        System.out.println("Televisor apagado");
    }
}

final class ControlRemoto {
    private final Dispositivo dispositivo;

    ControlRemoto(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    void encender() {
        dispositivo.encender();
    }

    void apagar() {
        dispositivo.apagar();
    }
}
